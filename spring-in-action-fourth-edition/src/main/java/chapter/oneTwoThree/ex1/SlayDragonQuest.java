package chapter.oneTwoThree.ex1;

import java.io.PrintStream;

/**
 * @author bgoyal
 */
public class SlayDragonQuest implements Quest {

    PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay dragon!");
    }
}
