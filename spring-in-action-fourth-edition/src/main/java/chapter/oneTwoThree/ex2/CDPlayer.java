package chapter.oneTwoThree.ex2;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * @author bgoyal
 */
@Component
// need to enable component scanning,
// if you only use @Inject and not @Component then Spring wouldn't make a bean for CDPlayer, as it will be not registered.
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Inject
    // Use Inject as it is a JSR specification and not Spring Framework specific.
    // Though Spring as adopted this as same as Autowired
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }

}
