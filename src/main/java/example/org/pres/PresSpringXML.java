package example.org.pres;

import example.org.metier.iMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext SpringContext =
                new ClassPathXmlApplicationContext("config.xml");
        iMetier metier = (iMetier) SpringContext.getBean("metier");
        System.out.println("RES = "+metier.Calcul());
    }
}
