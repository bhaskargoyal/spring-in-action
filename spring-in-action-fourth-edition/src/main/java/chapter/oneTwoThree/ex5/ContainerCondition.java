package chapter.oneTwoThree.ex5;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author bgoyal
 */
public class ContainerCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
            context.getBeanFactory().getBean("glass");
        } catch (NoSuchBeanDefinitionException nsbde) {
            System.out.println("Creating bottle bean as glass bean doesn't exist");
            return true;
        }
        System.out.println("NOT creating bottle bean as glass bean exists");
        return false;
    }
}
