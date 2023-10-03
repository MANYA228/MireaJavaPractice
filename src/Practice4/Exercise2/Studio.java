package Practice4.Exercise2;

enum ClothingSize {
    XXS(32, "Детский размер"),
    XS(34, "Взрослый размер"),
    S(36, "Взрослый размер"),
    M(38, "Взрослый размер"),
    L(40, "Взрослый размер");

    private int euroSize;
    private String description;

    // Конструктор для размеров одежды
    ClothingSize(int euroSize, String description) {
        this.euroSize = euroSize;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }
}

// Интерфейс для мужской одежды
interface MenClothing {
    void dressMan();
}

// Интерфейс для женской одежды
interface WomenClothing {
    void dressWomen();
}

// Абстрактный класс для одежды
abstract class Clothes {
    private ClothingSize size;
    private double cost;
    private String color;

    public Clothes(ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}

