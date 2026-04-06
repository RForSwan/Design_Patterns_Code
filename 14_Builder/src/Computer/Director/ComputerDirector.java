package Computer.Director;

import Computer.Builder.ComputerBuilder;
import Computer.Builder.GamingComputerBuilder;
import Computer.Computer;

public class ComputerDirector {
    ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder){
        this.builder = builder;
    }

    public Computer buildComputer() {
        return new Computer(builder.buildCPU(),
                            builder.buildRAM(),
                            builder.buildStorage(),
                            builder.buildGPU(),
                            builder.buildOS());
    }
}
