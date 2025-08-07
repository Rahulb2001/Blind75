import org.example.UnitTesting.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd(){

        Calculator calc=new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testSubtract(){

        Calculator calc=new Calculator();
        int result = calc.subtract(5, 3);
        assertEquals(2, result);
    }
}
