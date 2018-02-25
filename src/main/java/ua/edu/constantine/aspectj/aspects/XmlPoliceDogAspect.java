package ua.edu.constantine.aspectj.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("policeDog")
public class XmlPoliceDogAspect {
	
	public boolean watchPassanger(ProceedingJoinPoint jp) throws Throwable {
		boolean result = false;
		try {
			System.out.println("[Police Dog]:\"Woof woof!\" (I will watch the passenger)");
			result = (Boolean) jp.proceed();
			System.out.println("[Police Dog]:\"Woof woof!\" (I think he is not dangerous)");
		} catch(Throwable e) {
			throw e;
		}
		return result;
	}
	
	public void attackPassanger() {
		System.out.println("[Police Dog]:\"Ahhhrrr!\" (Caught!)");
	}
	
}
