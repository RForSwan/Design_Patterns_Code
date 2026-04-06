package Computer.Builder;

public class OfficeComputerBuilder implements ComputerBuilder{

    public OfficeComputerBuilder(){}

    @Override
    public String buildCPU() {
        return "Intel core i5 7th gen";
    }

    @Override
    public int buildRAM() {
        return 8;
    }

    @Override
    public String buildStorage() {
        return "512 GB SSD";
    }

    @Override
    public String buildGPU() {
        return "Intel integrated graphics";
    }

    @Override
    public String buildOS() {
        return "Windows 11";
    }
}
