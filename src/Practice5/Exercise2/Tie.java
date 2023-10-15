package Practice5.Exercise2;

class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужской галстук: размер " + getSize() + ", стоимость " + getCost() + " рублей, цвет " + getColor());
    }
}
