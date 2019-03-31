package chapter.oneTwoThree.ex3;

import chapter.oneTwoThree.ex3.customQualifier.Crispy;
import org.springframework.stereotype.Component;

/**
 * @author bgoyal
 */
@Component
@Crispy
public class Cookie implements Dessert {

    @Override
    public String getName() {
        return "Cookie";
    }
}
