package com.yuancheng.dependencyinjectionexamples;

import com.yuancheng.dependencyinjectionexamples.controllers.ConstructorInjectedController;
import com.yuancheng.dependencyinjectionexamples.controllers.MyController;
import com.yuancheng.dependencyinjectionexamples.controllers.PropertyInjectedController;
import com.yuancheng.dependencyinjectionexamples.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

	public static void main(String[] args) {

		/*
			Spring Framework is managing the construction of controllers, we do need to create controller objects (e.g. controller = new Controller)
			the framework is creating those objects and provide the instantiated objects to us when we ask for it.
			This is the idea of IoC (inversion of control)
		 */
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionExamplesApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("---- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
 	}

}
