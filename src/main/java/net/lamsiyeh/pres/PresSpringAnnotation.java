package net.lamsiyeh.pres;

import net.lamsiyeh.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("net.lamsiyeh");
        IMetier metier = (IMetier) context.getBean(IMetier.class);
        System.out.println("RES"+metier.calcule());

    }
}
