import org.example.UnitTesting.MathUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilTest {

    private MathUtils MathUtils;

    @BeforeAll
    void beforeAll() {
        MathUtils = new MathUtils();
    }

    @AfterAll
    void afterAll(){
        System.out.println("All tests completed.");
        MathUtils=null;
        System.out.println("Cleaning up resources...");
    }

    @BeforeEach
    void Setup(){
        System.out.println("Setting up test environment...");
        MathUtils=new MathUtils();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down test environment...");
        MathUtils = null;
    }

    @Test
    @DisplayName("Add two positive numbers")
    void testAdd() {
        int result = MathUtils.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    @DisplayName("subtrract two numbers")
    void testSubtract() {
        int result = MathUtils.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }

    @Test
    @DisplayName("Multiply two numbers")
    void testMultiply() {
        int result = MathUtils.multiply(4, 5);
        assertEquals(20, result, "4 * 5 should equal 20");
    }

    @Test
    @DisplayName("Divide two numbers")
    void testDivide() {
        double result = MathUtils.divide(10, 2);
        assertEquals(5.0, result, 0.0001); // delta for floating point comparison
    }

    @Test
    @DisplayName("Divide by zero throws exception")
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            MathUtils.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }


}
