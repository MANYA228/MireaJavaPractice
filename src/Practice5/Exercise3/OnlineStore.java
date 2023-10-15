package Practice5.Exercise3;

/* import java.util.*;
import static Practice4.Exercise3.Catalog;

public class OnlineStore {
    private Map<Catalog, List<Product>> products;
    private Map<String, User> users;

    public OnlineStore() {
        products = new HashMap<>();
        users = new HashMap<>();
        initializeProducts();
        initializeUsers();
    }

    // Инициализация каталогов товаров
    private void initializeProducts() {
        products.put(Catalog.ELECTRONICS, new ArrayList<>(Arrays.asList(
                new Product("Смартфон", 599.99),
                new Product("Ноутбук", 899.99),
                new Product("Планшет", 299.99)
        )));

        products.put(Catalog.CLOTHING, new ArrayList<>(Arrays.asList(
                new Product("Футболка", 19.99),
                new Product("Джинсы", 39.99),
                new Product("Платье", 49.99)
        )));

        products.put(Catalog.BOOKS, new ArrayList<>(Arrays.asList(
                new Product("Роман", 9.99),
                new Product("Фантастика", 14.99),
                new Product("Поэзия", 7.99)
        )));
    }

    // Инициализация пользователей
    private void initializeUsers() {
        users.put("user1", new User("user1", "password1"));
        users.put("user2", new User("user2", "password2"));
    }

    public boolean authenticateUser(String username, String password) {
        User user = users.get(username);
        return user != null && user.authenticate(password);
    }

    public void displayCatalogs() {
        System.out.println("Доступные каталоги товаров:");
        for (Catalog catalog : Catalog.values()) {
            System.out.println(catalog);
        }
    }

    public List<Product> getProductsInCatalog(Catalog catalog) {
        return products.get(catalog);
    }

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя пользователя: ");
        String username = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        if (store.authenticateUser(username, password)) {
            System.out.println("Вход выполнен успешно!");

            store.displayCatalogs();
            System.out.print("Выберите каталог товаров: ");
            Catalog selectedCatalog = Catalog.valueOf(scanner.nextLine());

            List<Product> catalogProducts = store.getProductsInCatalog(selectedCatalog);
            if (catalogProducts != null) {
                System.out.println("Товары в выбранном каталоге:");
                for (Product product : catalogProducts) {
                    System.out.println(product);
                }

                User user = store.users.get(username);
                System.out.print("Введите имя товара для добавления в корзину: ");
                String selectedProduct = scanner.nextLine();
                for (Product product : catalogProducts) {
                    if (product.getName().equalsIgnoreCase(selectedProduct)) {
                        user.addToCart(product);
                        System.out.println(selectedProduct + " добавлен в корзину.");
                        break;
                    }
                }

                System.out.print("Желаете оформить покупку (да/нет)? ");
                String response = scanner.nextLine();
                if ("да".equalsIgnoreCase(response)) {
                    user.viewCart();
                    user.checkout();
                }
            } else {
                System.out.println("Каталог товаров не найден.");
            }
        } else {
            System.out.println("Неверное имя пользователя или пароль.");
        }

        scanner.close();
    }
} */
