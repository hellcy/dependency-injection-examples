package com.yuancheng.dependencyinjectionexamples;

import com.yuancheng.dependencyinjectionexamples.controllers.*;
import com.yuancheng.dependencyinjectionexamples.services.PrototypeBean;
import com.yuancheng.dependencyinjectionexamples.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

	public static void main(String[] args) {

		/*
			Spring Framework is managing the construction of controllers, we do need to create controller objects (e.g. controller = new Controller)
			the framework is creating those objects and provide the instantiated objects to us when we ask for it.
			This is the idea of IoC (inversion of control)
		 */
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

		System.out.println("---- Primary");
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(myController.sayHello());

		System.out.println("---- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("---- Spring Profile");
		I18NController i18NController = (I18NController) ctx.getBean("i18NController");
		System.out.println(i18NController.sayHello());

		System.out.println("---- Pet Service");

		PetController petController = (PetController) ctx.getBean("petController");

		System.out.println(petController.getPetService());

		System.out.println("---- Bean Scopes -----");
		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getScope());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getScope());

		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getScope());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getScope());
 	}

}
