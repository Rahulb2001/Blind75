package Facade;

public class DeploymentAppDirect {
    public static void main(String[] args) throws InterruptedException {

        DeploymentOrchestrator deploymentOrchestrator = new DeploymentOrchestrator();
        deploymentOrchestrator.deploy("V1.0.0");
    }
}
