package Facade;

public class BuildSystem {

    public void compile() throws InterruptedException {
        System.out.println("Compiling the source code...");
        simulateDelay();
        System.out.println("Compilation successful.");
    }

    private void simulateDelay() throws InterruptedException {
        Thread.sleep(5000);
    }
}
