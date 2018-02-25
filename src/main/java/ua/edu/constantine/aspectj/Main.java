package ua.edu.constantine.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.edu.constantine.aspectj.data.Passanger;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("JavaBeans.xml");
		Passanger p = (Passanger) context.getBean("passanger");
		//p.setWeapon(true); //this line is testing <aop:after-throwing/> aspect
		try {
			p.passControl();
		} catch (Exception e) {
			System.out.println("THIS PASSANGER IS DANGEROUS!");
		}
	}
}
