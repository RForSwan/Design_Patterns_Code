import Computer.Builder.GamingComputerBuilder;
import Computer.Builder.OfficeComputerBuilder;
import Computer.Computer;
import Computer.Director.ComputerDirector;

void main() {
    ComputerDirector gamingPCBuilder = new ComputerDirector(new GamingComputerBuilder());
    ComputerDirector officePCBuilder = new ComputerDirector(new OfficeComputerBuilder());

    Computer gamingPC = gamingPCBuilder.buildComputer();
    Computer officePC = officePCBuilder.buildComputer();

    gamingPC.specs();
    officePC.specs();
}
