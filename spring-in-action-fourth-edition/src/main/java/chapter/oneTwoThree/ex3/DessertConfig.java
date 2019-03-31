package chapter.oneTwoThree.ex3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author bgoyal
 */
@Configuration
@ComponentScan
public class DessertConfig {

    // 3 beans for the same type will be resolved Dessert, so spring wouldn't know which oneTwoThree to inject it with.
    // Hence we will narrow the beans that spring is ambiguous with
    // 1. can you @Primary, but multiple can also have @Primary annotation
    // 2. Use @Qualifier. But We can't use @Qualifier more than once, so we will extend @Qualifier
}
