public class Ec2Instance implements Instance{

    Ec2Instance(Capacity capacity){
        System.out.println("Created Ec2 Instance.");
    }
    @Override
    public void start() {
        System.out.println("Ec2 Instance Started.");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached "+storage+ " to Ec2 instance.");

    }

    @Override
    public void stop() {
        System.out.println("EC2 Instance Stopped.");
    }
    @Override
    public String toString(){
        return "Ec2Instance";
    }
}
