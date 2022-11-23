package course3.lesson4_spring.service;

import course3.lesson4_spring.model.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final ShoppingCart shoppingCart;

    public OrderService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void add(List<Integer> id) {
        this.shoppingCart.add(id);
    }

    public List<Integer> get() {
        return this.shoppingCart.get();
    }
}
