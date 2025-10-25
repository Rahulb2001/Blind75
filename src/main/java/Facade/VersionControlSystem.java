package Facade;

public class VersionControlSystem {

    public void getbranch(String branch) throws InterruptedException {
        System.out.println("Getting branch: " + branch);
        simulate();
        System.out.println("Branch " + branch + " is ready.");
    }

    private void simulate() throws InterruptedException {

        Thread.sleep(5000);
    }
}
