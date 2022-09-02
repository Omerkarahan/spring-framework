package stereotype_annotations;

import bean_practice.FullTimeEmployee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.config.ConfigApp;
import stereotype_annotations.model.DataStructure;
import stereotype_annotations.model.Microservice;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        DataStructure ds = container.getBean(DataStructure.class);
        ds.getTotalHours();

        Microservice ms = container.getBean(Microservice.class);
        ms.getTotalHours();

        FullTimeEmployee ft = container.getBean(FullTimeEmployee.class);
        ft.createAccount();
    }
}
