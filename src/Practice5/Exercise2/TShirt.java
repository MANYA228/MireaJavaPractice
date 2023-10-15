package Practice5.Exercise2;

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: размер " + getSize() + ", стоимость " + getCost() + " рублей, цвет " + getColor());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: размер " + getSize() + ", стоимость " + getCost() + " рублей, цвет " + getColor());
    }
}
