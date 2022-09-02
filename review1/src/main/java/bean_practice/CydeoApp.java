package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigEmployee.class,NewConfigApp.class);

        FullTimeEmployee ft = container.getBean(FullTimeEmployee.class);

        PartTimeEmployee pt = container.getBean(PartTimeEmployee.class);
        ft.createAccount();
        pt.createAccount();


//        String str1 = container.getBean("message1",String.class);
//        String str2 = container.getBean("message2",String.class);
//        System.out.println(str1);
//        System.out.println(str2);

        String str = container.getBean(String.class);
        System.out.println(str);
    }
}
