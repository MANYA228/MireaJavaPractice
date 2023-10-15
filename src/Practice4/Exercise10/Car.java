package Practice4.Exercise10;

class Car extends TransportVehicle {
    private double costPerKilometer;
    private double fuelConsumption;

    public Car(String name, double speed, double costPerKilometer, double fuelConsumption) {
        super(name, speed);
        this.costPerKilometer = costPerKilometer;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double calculateTime(int distance) {
        return distance / getSpeed();
    }

    @Override
    public double calculateCost(int passengers, int cargo) {
        double distance = passengers * 100 + cargo * 50; // Пример для стоимости, зависящей от расстояния
        return costPerKilometer * distance + fuelConsumption * distance;
    }
}
