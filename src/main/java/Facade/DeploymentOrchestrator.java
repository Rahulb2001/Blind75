package Facade;

public class DeploymentOrchestrator {

    private VersionControlSystem vcs=new VersionControlSystem();
    private TestingFramework testingFramework=new TestingFramework();
    private DeploymentTarget deploymentTarget=new DeploymentTarget();
    private BuildSystem buildSystem=new BuildSystem();

    public void deploy(String version) throws InterruptedException {

        vcs.getbranch(version);
        testingFramework.test();
        deploymentTarget.deploy(version);
        buildSystem.compile();


    }



}
