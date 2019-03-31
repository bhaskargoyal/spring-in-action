package chapter.oneTwoThree.ex3;

import chapter.oneTwoThree.ex3.customQualifier.Cold;
import chapter.oneTwoThree.ex3.customQualifier.Creamy;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * @author bgoyal
 */
@Component("cook")
public class Cook {

    private Dessert dessert;


    public Cook() {

    }

    @Inject
//    @Qualifier("cold")
//    @Qualifier is not applicable to constructor
    @Cold
    @Creamy
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public void cook() {
        System.out.println("Cooking ..." + dessert.getName());
    }
}
