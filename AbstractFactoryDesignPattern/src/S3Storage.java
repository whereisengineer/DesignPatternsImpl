public class S3Storage implements Storage{
    S3Storage(int capacityInMib){
        System.out.println("Allocated "+ capacityInMib + " on S3");
    }
    @Override
    public String getId() {
        return "S31";
    }
    @Override
    public String toString(){
        return "S3Storage";
    }
}
