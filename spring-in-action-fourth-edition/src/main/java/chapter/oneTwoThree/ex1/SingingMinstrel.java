package chapter.oneTwoThree.ex1;

import java.io.PrintStream;

/**
 * @author bgoyal
 */
public class SingingMinstrel implements Minstrel {

    private PrintStream stream;

    public SingingMinstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Fa Fa Fa! Here goes the mighty for his quest!");
    }

    public void singAfterQuest() {
        stream.println("Long live the mighty from quest!");
    }
}
