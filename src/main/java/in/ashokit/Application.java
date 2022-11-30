package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.beans.Car;
import in.ashokit.beans.EnginePrototypeScope;
import in.ashokit.beans.EngineSingleTonScope;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EngineSingleTonScope eng1 = context.getBean(EngineSingleTonScope.class);
		EngineSingleTonScope eng2 = context.getBean(EngineSingleTonScope.class);
		
		System.out.println("=======================================");
		
		Car c1 = context.getBean(Car.class);
		Car c2 = context.getBean(Car.class);

		
		
		System.out.println("=======================================");
		EnginePrototypeScope eng3 = context.getBean(EnginePrototypeScope.class);
		EnginePrototypeScope eng4 = context.getBean(EnginePrototypeScope.class);


		
	}

}
