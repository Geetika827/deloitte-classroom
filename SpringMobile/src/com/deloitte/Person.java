package com.deloitte;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
import java.util.Scanner;
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in= new Scanner(System.in);
     ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
     Mobile m= context.getBean("mobile",Mobile.class);
     m.browse();
     m.call();
     m.sendSms();
     m.sendMms();
     m.sim=context.getBean("jio",Sim.class);
     Mobile m2= context.getBean("mobile",Mobile.class);
     m2.browse();
     m2.call();
     m2.sendSms();
     m2.sendMms();
	}

}
