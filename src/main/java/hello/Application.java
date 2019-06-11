package hello;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class Application {

    @Autowired
    private UserRepository repository; 

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            repository.save(new User("Sally", 1));
            repository.save(new User("Sally", 2));
            repository.save(new User("Jack", 3));
            repository.save(new User("Jeff", 4));
            
            for (User user : repository.findAll()){
                System.out.println(user.name);
            }

        };
    }

}
