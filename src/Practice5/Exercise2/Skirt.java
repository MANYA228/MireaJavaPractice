package Practice5.Exercise2;

class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская юбка: размер " + getSize() + ", стоимость " + getCost() + " рублей, цвет " + getColor());
    }
}
