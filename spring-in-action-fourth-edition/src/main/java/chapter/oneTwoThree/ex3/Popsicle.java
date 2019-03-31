package chapter.oneTwoThree.ex3;

import chapter.oneTwoThree.ex3.customQualifier.Cold;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author bgoyal
 */
@Component
@Primary
@Cold
public class Popsicle implements Dessert {

    @Override
    public String getName() {
        return "Popsicle";
    }
}
