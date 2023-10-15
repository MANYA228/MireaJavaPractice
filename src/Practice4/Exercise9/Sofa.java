package Practice4.Exercise9;

class Sofa extends Furniture {
    public Sofa(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Диван: " + getName() + ", Цена: " + getPrice() + " руб.");
    }
}
