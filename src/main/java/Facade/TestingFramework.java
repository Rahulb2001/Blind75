package Facade;

public class TestingFramework {

    public void test() throws InterruptedException {
        // Implement test cases here
        System.out.println("Testing framework is set up.");
        simulate(5000);
        System.out.println("All tests executed.");
    }

    private void simulate(int i) throws InterruptedException {

        Thread.sleep(i);
    }
}
