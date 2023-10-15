package Practice4.Exercise9;

class FurnitureShop {
    private Furniture[] inventory;

    public FurnitureShop(int capacity) {
        inventory = new Furniture[capacity];
    }

    public void addFurniture(Furniture item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                System.out.println("Добавлено: " + item.getName());
                return;
            }
        }
        System.out.println("Магазин заполнен, не удалось добавить: " + item.getName());
    }

    public void listInventory() {
        System.out.println("Инвентарь магазина:");
        for (Furniture item : inventory) {
            if (item != null) {
                item.displayInfo();
            }
        }
    }
}
