package chapter.oneTwoThree.ex2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author bgoyal
 */
@Configuration
// to provide an array inside the annotations, we use {}
// by default value is chosen, and we have alias for the value as in @ComponentScan.Filter.
@ComponentScan(excludeFilters = @ComponentScan.Filter(classes = {Configuration.class}))
// if there are multiple config files, we can import oneTwoThree from another.
@Import(PrintStreamConfig.class)
public class CDPlayerConfig {


}
