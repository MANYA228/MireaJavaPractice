package Practice4.Exercise4;

enum ComputerBrand {
    DELL,
    HP,
    ASUS,
    ACER,
    LENOVO
}

// Класс для процессора
class Processor {
    private String model;
    private double clockSpeed;

    public Processor(String model, double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    public String getModel() {
        return model;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    @Override
    public String toString() {
        return "Процессор: " + model + ", Частота: " + clockSpeed + " ГГц";
    }
}

// Класс для оперативной памяти (Memory)
class Memory {
    private int size; // объем в гигабайтах
    private String type; // тип памяти (DDR3, DDR4, и т.д.)

    public Memory(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Память: " + size + " ГБ, DDR" + type;
    }
}

// Класс для монитора (Monitor)
class Monitor {
    private String model;
    private double size; // диагональ в дюймах

    public Monitor(String model, double size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Монитор: " + model + ", Диагональ: " + size + " дюймов";
    }
}

// Класс компьютера (Computer)
class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return "Компьютер марки " + brand + "\n" + processor + "\n" + memory + "\n" + monitor;
    }
}

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel i7", 3.4);
        Memory memory = new Memory(16, "4");
        Monitor monitor = new Monitor("Dell Ultrasharp", 27.0);

        Computer computer = new Computer(ComputerBrand.DELL, processor, memory, monitor);
        System.out.println(computer);
    }
}
