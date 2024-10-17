public class GoogleCloudStorage implements Storage{
    GoogleCloudStorage(int capacityInMib){
        System.out.println("Allocated "+ capacityInMib+ " on Google Clout Storage");
    }
    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage";
    }
}
