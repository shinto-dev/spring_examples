package springboot;

import com.examples.spring.controllers.GreetingsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.examples.spring")
/*
Can use ComponentScan annotation if the package to scan for the classes is different hierarchy.
 */
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		GreetingsController controller = (GreetingsController) context.getBean(GreetingsController.class);
		controller.sayHello();
	}
}
