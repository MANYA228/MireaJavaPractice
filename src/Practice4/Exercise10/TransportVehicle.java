package Practice4.Exercise10;

abstract class TransportVehicle {
    private String name;
    private double speed;

    public TransportVehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public abstract double calculateTime(int distance);

    public abstract double calculateCost(int passengers, int cargo);

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }
}
