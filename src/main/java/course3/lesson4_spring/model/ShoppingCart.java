package course3.lesson4_spring.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class ShoppingCart {

    private final List<Integer> shoppingCart = new ArrayList<>();

    public void add(List<Integer> id) {
        this.shoppingCart.addAll(id);
    }

    public List<Integer> get() {
        return Collections.unmodifiableList(shoppingCart);
    }
}
