package chapter.oneTwoThree.ex4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author bgoyal
 */
@Component
@Primary
public class AmazonShoppingCart implements ShoppingCart {


    @Value("${ex4.amazon.count}")
    // access the value of the .properties file using @Value annotation in format of ${*.*.*..}
    private String count;

    @Value("#{54}")
    // Spring Expression Language syntax
    private Integer rounds;

    @Override
    public Integer countInCart() {
        return Integer.parseInt(count) + rounds;
    }
}
