public class GoogleComputingInstance implements Instance{

    GoogleComputingInstance(Capacity capacity){
        System.out.println("Created Google Compute Engine Instance.");
    }
    @Override
    public void start() {
        System.out.println("Compute Engine instance started.");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached "+storage+ " to Compute engine instance.");
    }

    @Override
    public void stop() {
        System.out.println("Compute Engine Instance Stopped.");
    }
}
