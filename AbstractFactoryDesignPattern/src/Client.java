public class Client {
    void createInstances(){
        ResourceFactory awsResource = new AwsResourceFactory();
        doProcessing(awsResource, Instance.Capacity.large, 2048);
        ResourceFactory googleResource = new GoogleResourceFactory();
        doProcessing(googleResource, Instance.Capacity.small, 1024);


    }
    private void doProcessing(ResourceFactory resourceFactory, Instance.Capacity capacity, int storage){
        Instance i = resourceFactory.createInstance(capacity);
        resourceFactory.createStorage(storage);
        i.start();
        i.stop();
    }
}
