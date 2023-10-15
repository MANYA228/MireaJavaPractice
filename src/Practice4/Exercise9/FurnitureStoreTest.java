package Practice4.Exercise9;

public class FurnitureStoreTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(3);

        Chair chair = new Chair("Кресло", 350.0);
        Table table = new Table("Обеденный стол", 200.0);
        Sofa sofa = new Sofa("Мягкий диван", 500.0);

        shop.addFurniture(chair);
        shop.addFurniture(table);
        shop.addFurniture(sofa);

        shop.listInventory();
    }
}
