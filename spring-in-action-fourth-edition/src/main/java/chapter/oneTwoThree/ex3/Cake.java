package chapter.oneTwoThree.ex3;

import chapter.oneTwoThree.ex3.customQualifier.Creamy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author bgoyal
 */
@Component
@Primary
@Creamy
public class Cake implements Dessert {

    @Override
    public String getName() {
        return "Cake";
    }
}
