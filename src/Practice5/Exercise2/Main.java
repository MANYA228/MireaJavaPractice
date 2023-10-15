package Practice5.Exercise2;

public class Main {
    public static void main(String[] args) {
        TShirt tShirt1 = new TShirt(ClothingSize.S, 20.0, "синий");
        TShirt tShirt2 = new TShirt(ClothingSize.XXS, 15.0, "красный");
        Pants pants1 = new Pants(ClothingSize.M, 40.0, "черный");
        Pants pants2 = new Pants(ClothingSize.L, 50.0, "серый");
        Skirt skirt = new Skirt(ClothingSize.XS, 30.0, "розовый");
        Tie tie = new Tie(ClothingSize.XS, 25.0, "голубой");

        Clothes[] clothes = {tShirt1, tShirt2, pants1, pants2, skirt, tie};

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        atelier.dressMan(clothes);
    }
}
