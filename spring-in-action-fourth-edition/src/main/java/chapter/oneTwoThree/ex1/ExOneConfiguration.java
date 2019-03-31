package chapter.oneTwoThree.ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.PrintStream;

/**
 * @author bgoyal
 */
@Configuration
public class ExOneConfiguration {

    @Bean
    public Knight knight(Quest quest) {
        return new BraveKnight(quest);
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Minstrel minstrel(PrintStream stream) {
        return new SingingMinstrel(stream);
    }

    // bean mapping happens as per this logic
    // 1. Matches with same name (camel case with first letter lowercase) exists with same type
    // 2. if the name (or id) is same for 2 beans, then the second bean initialization is ignored
    // 3. if the names are different than required or injected bean, then the NoUniqueBeanDefinitionException is thrown
    @Bean(name = "stream")
    public PrintStream stream2() {
        System.out.println("... Called this PrintStream");
        return System.out;
    }

    @Bean
    // not called as a bean with name/id stream exists.
    public PrintStream stream() {
        System.out.println("Not called");
        return System.out;
    }
}
