package chapter.oneTwoThree.ex3;

import chapter.oneTwoThree.ex3.customQualifier.Cold;
import chapter.oneTwoThree.ex3.customQualifier.Creamy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author bgoyal
 */
@Component
@Primary
@Cold
@Creamy
public class IceCream implements Dessert {

    @Override
    public String getName() {
        return "Ice Cream";
    }
}
