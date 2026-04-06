package Computer.Builder;

import Computer.Computer;

public interface ComputerBuilder {
    String buildCPU();
    int buildRAM();
    String buildStorage();
    String buildGPU();
    String buildOS();
}
