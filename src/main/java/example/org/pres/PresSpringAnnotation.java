package example.org.pres;

import example.org.metier.iMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
//        ApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext("example.org.example.org.ext", "example.org.metier");
//        ApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext("example.org.dao", "example.org.metier");
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("example.org");
        iMetier metier = applicationContext.getBean(iMetier.class);
        System.out.println("RES = "+metier.Calcul());
    }
}
