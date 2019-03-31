package chapter.oneTwoThree.ex4;

import org.springframework.stereotype.Component;

/**
 * @author bgoyal
 */
@Component
public class FlipkartShoppingCart implements ShoppingCart {

    @Override
    public Integer countInCart() {
        return 4;
    }
}
