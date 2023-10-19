package Practice4.Exercise1;

// Класс, представляющий интернет-магазин

/*public class Main {
    public static void main(String[] args) {
        // Создаем интернет-магазин
        OnlineStore store = new OnlineStore();

        // Создаем каталоги товаров
        Catalog electronicsCatalog = new Catalog("Электроника");
        electronicsCatalog.addProduct(new Product("Смартфон", 599.99));
        electronicsCatalog.addProduct(new Product("Ноутбук", 999.99));
        electronicsCatalog.addProduct(new Product("Планшет", 299.99));

        Catalog clothingCatalog = new Catalog("Одежда");
        clothingCatalog.addProduct(new Product("Футболка", 19.99));
        clothingCatalog.addProduct(new Product("Джинсы", 49.99));
        clothingCatalog.addProduct(new Product("Куртка", 79.99));

        store.addCatalog(electronicsCatalog);
        store.addCatalog(clothingCatalog);

        Scanner scanner = new Scanner(System.in);
        boolean isAuthenticated = false;

        // Реализация аутентификации пользователя (просто для примера)
        while (!isAuthenticated) {
            System.out.print("Введите логин: ");
            String username = scanner.nextLine();
            System.out.print("Введите пароль: ");
            String password = scanner.nextLine();
            // Здесь можно добавить проверку логина и пароля в базе данных пользователей
            // В данном примере просто предполагается, что аутентификация успешна
            isAuthenticated = true;
            System.out.println("Вы успешно вошли в систему.");
        }

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Просмотреть каталоги товаров");
            System.out.println("2. Просмотреть товары в каталоге");
            System.out.println("3. Добавить товар в корзину");
            System.out.println("4. Оформить покупку");
            System.out.println("0. Выйти из приложения");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем символ новой строки

            switch (choice) {
                case 1:
                    store.displayCatalogs();
                    break;
                case 2:
                    System.out.print("Введите имя каталога: ");
                    String catalogName = scanner.nextLine();
                    store.displayProductsInCatalog(catalogName);
                    break;
                case 3:
                    System.out.print("Введите имя товара: ");
                    String productName = scanner.nextLine();
                    store.addToCart(productName);
                    break;
                case 4:
                    store.checkout();
                    break;
                case 0:
                    System.out.println("Выход из приложения.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }
}
*/
