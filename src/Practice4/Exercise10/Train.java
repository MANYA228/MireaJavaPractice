package Practice4.Exercise10;

class Train extends TransportVehicle {
    private double ticketPrice;
    private double cargoPrice;

    public Train(String name, double speed, double ticketPrice, double cargoPrice) {
        super(name, speed);
        this.ticketPrice = ticketPrice;
        this.cargoPrice = cargoPrice;
    }

    @Override
    public double calculateTime(int distance) {
        return distance / getSpeed();
    }

    @Override
    public double calculateCost(int passengers, int cargo) {
        return ticketPrice * passengers + cargoPrice * cargo;
    }
}
