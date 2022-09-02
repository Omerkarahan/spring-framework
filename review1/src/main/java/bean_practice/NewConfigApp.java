package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NewConfigApp {

    @Primary
    @Bean
   // @Bean(name ="message1")
    public String str1(){
        return "welcome to Cydeo app";
    }

   // @Bean(name = "message2")
    public String str2() {
        return "Spring Core Practice";
    }
}
