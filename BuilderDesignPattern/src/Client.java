public class Client {

    public void buildComputer(){
        ComputerBuilder computerBuilder = new DesktopComputerBuilder();
        Computer computer = computerBuilder.buildProcessor("Intel i7")
                .buildMemory(16)
                .buildSSD(4)
                .buildGraphics("Nvidia")
                .build();

        System.out.println("Computer specs are: Processor: " + computer.processer + " SSD: "+
                computer.ssd_memory + " Memory: "+ computer.memory + " Graphics: " + computer.graphics);


    }
}
