package chapter.oneTwoThree.ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author bgoyal
 */
@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(classes = {Configuration.class}))
public class ExFive {

    @Bean
    public Container glass() {
        return new Glass();
    }

    @Bean
    @Conditional(ContainerCondition.class)
    // can specify a condition whether the bean is to be created or not.
    // ContainerCondition implements org.springframework.context.annotation.Condition matches() definition.
    // In this example the bottle bean is only created when a glass named bean is not already created.
    // the bean is already created by id/name "glass" as it declared before.
    // to test simply move the glass bean declaration below.
    public Container bottle() {
        return new Bottle();
    }
}
