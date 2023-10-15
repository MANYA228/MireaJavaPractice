package Practice5.Exercise2;

class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда в ателье:");
        for (Clothes clothing : clothes) {
            if (clothing instanceof WomenClothing) {
                ((WomenClothing) clothing).dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда в ателье:");
        for (Clothes clothing : clothes) {
            if (clothing instanceof MenClothing) {
                ((MenClothing) clothing).dressMan();
            }
        }
    }
}
