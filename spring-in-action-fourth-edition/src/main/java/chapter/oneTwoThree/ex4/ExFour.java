package chapter.oneTwoThree.ex4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author bgoyal
 */
@Configuration
@ComponentScan
@PropertySource(value = {"classpath:configurations/chapter/oneTwoThree/ex4.properties"})
// define a properties file inside the resources folder which is alongside java folder (because it is the class path)
public class ExFour {

    @Bean
    // need to setup a Place Holder Configurer
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
