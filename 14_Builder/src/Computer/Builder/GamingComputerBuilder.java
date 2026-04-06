package Computer.Builder;

import Computer.Computer;

public class GamingComputerBuilder implements ComputerBuilder{

    public GamingComputerBuilder(){}

    @Override
    public String buildCPU() {
        return "AMD ryzen 7 7800X3D";
    }

    @Override
    public int buildRAM() {
        return 32;
    }

    @Override
    public String buildStorage() {
        return "SAMSUNG 990PRO 1Tb SSD";
    }

    @Override
    public String buildGPU() {
        return "NVIDIA RTX 5070Ti";
    }

    @Override
    public String buildOS() {
        return "Windows 11 pro";
    }
}
