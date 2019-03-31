package chapter;

import chapter.oneTwoThree.ex1.ExOneConfiguration;
import chapter.oneTwoThree.ex1.Knight;
import chapter.oneTwoThree.ex3.Cook;
import chapter.oneTwoThree.ex3.DessertConfig;
import chapter.oneTwoThree.ex4.ExFour;
import chapter.oneTwoThree.ex4.Notepad;
import chapter.oneTwoThree.ex4.StorageService;
import chapter.oneTwoThree.ex5.Container;
import chapter.oneTwoThree.ex5.ExFive;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bgoyal
 */
public class Application {

    public static void main(String[] args) {
//        EX1
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configurations/chapter/oneTwoThree/spring.xml");
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExOneConfiguration.class);
//        Knight knight = (Knight) applicationContext.getBean("knight");
//        knight.embarkOnQuest();

//        EX3
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DessertConfig.class);
//        Cook cook = (Cook) applicationContext.getBean("cook");
//        cook.cook();

//        EX4
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExFour.class);
//        Notepad notepad1 = (Notepad) applicationContext.getBean("notepad");
//        Notepad notepad2 = (Notepad) applicationContext.getBean("notepad");
//        StorageService storageService = (StorageService) applicationContext.getBean("storageService");
//        storageService.getCount();

//        EX5
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExFive.class);
//        Container container = (Container) applicationContext.getBean("bottle");
//        System.out.println(container.getType());
    }
}
