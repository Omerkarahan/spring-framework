package stereotype_annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import stereotype_annotations.model.DataStructure;
import stereotype_annotations.model.Devops;

@Configuration
@ComponentScan(basePackages = {"stereotype_annotations", "bean_practice"})
public class ConfigApp {


}
