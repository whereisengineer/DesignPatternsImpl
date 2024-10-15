public class DesktopComputerBuilder implements ComputerBuilder{

    DesktopComputerBuilder(){
        computer = new Computer();
    }
    private Computer computer;

    @Override
    public ComputerBuilder buildProcessor(String processor) {
        computer.processer = processor;
        return this;
    }

    @Override
    public ComputerBuilder buildSSD(int ssd) {
        computer.ssd_memory = ssd;
        return this;
    }

    @Override
    public ComputerBuilder buildMemory(int memory) {
         computer.memory = memory;
         return this;
    }

    @Override
    public ComputerBuilder buildGraphics(String graphics) {
        computer.graphics = graphics;
        return this;
    }

    public Computer build(){
        return computer;
    }
}
