package Practice5.Exercise3;

import java.util.ArrayList;
import java.util.List;

class User {
    private String username;
    private String password;
    private List<Product> cart;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.cart = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public void checkout() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        System.out.println("Спасибо за покупку! Ваш заказ на сумму: $" + total);
        cart.clear();
    }

    public void viewCart() {
        System.out.println("Ваша корзина:");
        for (Product product : cart) {
            System.out.println(product);
        }
    }
}
