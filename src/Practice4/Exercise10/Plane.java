package Practice4.Exercise10;

class Plane extends TransportVehicle {
    private double ticketPrice;
    private double fuelConsumption;

    public Plane(String name, double speed, double ticketPrice, double fuelConsumption) {
        super(name, speed);
        this.ticketPrice = ticketPrice;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double calculateTime(int distance) {
        return distance / getSpeed();
    }

    @Override
    public double calculateCost(int passengers, int cargo) {
        double distance = passengers * 100 + cargo * 50; // Предполагаем, что стоимость зависит от расстояния
        return ticketPrice * passengers + fuelConsumption * distance;
    }
}
