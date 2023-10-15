package Practice4.Exercise10;

public class TransportTest {
    public static void main(String[] args) {
        Car car = new Car("Car", 100, 0.2, 0.1);
        Plane plane = new Plane("Plane", 800, 300, 2);
        Train train = new Train("Train", 120, 50, 0.05);
        Ship ship = new Ship("Ship", 40, 100, 0.08);

        int distance = 500;
        int passengers = 100;
        int cargo = 200;

        System.out.println(car.getName() + ":\nTime: " + car.calculateTime(distance) + " hours\nCost: $" + car.calculateCost(passengers, cargo));
        System.out.println(plane.getName() + ":\nTime: " + plane.calculateTime(distance) + " hours\nCost: $" + plane.calculateCost(passengers, cargo));
        System.out.println(train.getName() + ":\nTime: " + train.calculateTime(distance) + " hours\nCost: $" + train.calculateCost(passengers, cargo));
        System.out.println(ship.getName() + ":\nTime: " + ship.calculateTime(distance) + " hours\nCost: $" + ship.calculateCost(passengers, cargo));
    }
}
