package chapter.oneTwoThree.ex4;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * @author bgoyal
 */
@Component
public class StorageService {

    private ShoppingCart shoppingCart;

    @Inject
    public StorageService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void getCount() {
        System.out.println(shoppingCart.countInCart());
    }
}
