package chapter.oneTwoThree.ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.PrintStream;

/**
 * @author bgoyal
 */
@Configuration
public class PrintStreamConfig {
    @Bean
    public PrintStream stream() {
        return System.out;
    }
}
