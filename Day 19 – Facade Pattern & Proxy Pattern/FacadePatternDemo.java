// Subsystem Class 1
class CPU {

    public void start() {

        System.out.println("CPU Started.");

    }

}

// Subsystem Class 2
class Memory {

    public void load() {

        System.out.println("Memory Loaded.");

    }

}

// Subsystem Class 3
class HardDrive {

    public void readData() {

        System.out.println("Operating System Loaded from Hard Drive.");

    }

}

// Facade Class
class ComputerFacade {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {

        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();

    }

    public void startComputer() {

        System.out.println("Starting Computer...\n");

        cpu.start();
        memory.load();
        hardDrive.readData();

        System.out.println("\nComputer Started Successfully.");

    }

}

// Main Class
public class FacadePatternDemo {

    public static void main(String[] args) {

        ComputerFacade computer = new ComputerFacade();

        computer.startComputer();

    }

}
