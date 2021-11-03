package com.yuancheng.dependencyinjectionexamples;

import com.yuancheng.dependencyinjectionexamples.controllers.MyController;
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
	}

}
