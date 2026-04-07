package Computer;

public class Computer {
    /*
    Processor (String)
    RAM size (in GB)
    Hard drive (e.g., "512 GB SSD")
    Graphics card (String)
    Operating system (String)
     */

    private String cpu;
    private int ram;
    private String storage;
    private String gpu;
    private String os;

    public Computer(String cpu, int ram, String storage, String gpu, String os){
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.os = os;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGpu() {
        return gpu;
    }

    public String getOs() {
        return os;
    }

    public void specs() {
        System.out.println("Computer Specifications :\n" +
                           "> Processor : "+ this.cpu + "\n" +
                           "> RAM : " + this.ram + "Gb\n" +
                           "> Hard drive : " + this.storage + "\n" +
                           "> Graphics card : " + this.gpu + "\n" +
                           "> Operating system : " + this.os + "\n");
    }
}
