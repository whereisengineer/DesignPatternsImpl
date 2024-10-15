public interface ComputerBuilder {
    ComputerBuilder buildProcessor(String processor);
    ComputerBuilder buildSSD(int ssd);
    ComputerBuilder buildMemory(int memory);
    ComputerBuilder buildGraphics(String graphics);
    Computer build();

}
