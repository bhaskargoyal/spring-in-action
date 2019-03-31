package chapter.oneTwoThree.ex4;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author bgoyal
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Notepad {

    private static int number = 0;

    // for each getBean or injection of this Bean; a new Notepad instance will be created.
    public Notepad() {
        System.out.println(++number);
    }
}
