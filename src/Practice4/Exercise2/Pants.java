package Practice4.Exercise2;

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: размер " + getSize() + ", стоимость " + getCost() + " рублей, цвет " + getColor());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: размер " + getSize() + ", стоимость " + getCost() + " рублей, цвет " + getColor());
    }
}
