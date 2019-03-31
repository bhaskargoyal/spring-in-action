package chapter.oneTwoThree.ex2;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.io.PrintStream;

/**
 * @author bgoyal
 */
// components are not automatically made, a ComponentScan needs to defined on a class which will by default scan all the
// component annotations in the same package and sub packages
@Component(value = "perfect by Ed Sheeran")  // can provide Id for the name of the component bean.
public class PerfectEdSheeran implements CompactDisc {

    private PrintStream stream;

    @Inject
    public PerfectEdSheeran(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void play() {
        stream.println("I found a love for me, darling just dive right in and follow my lead!");
    }
}
