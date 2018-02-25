package ua.edu.constantine.aspectj.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationSecurityAspect {

	@Pointcut("execution(public * ua.edu.constantine.aspectj.data.Passanger.passControl(..))")
	public void passControl() {}
	
	@Before("passControl()")
	public void removeMetalObjects() {
		System.out.println("[Security]:\"Dear Passanger, please remove all metal objects before scanning.\"");
	}
	
	@AfterReturning("passControl()")
	public void greetPassanger() {
		System.out.println("[Security]:\"You a welcome! Expect your flight in the hall.\"");
	}
	
	@After("passControl()")
	public void makeANoteInDB() {
		System.out.println("[AnnotationSecurityAspect]: +1 handled method invocation");
	}
	
}
