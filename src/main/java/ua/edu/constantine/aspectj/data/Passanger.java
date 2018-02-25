package ua.edu.constantine.aspectj.data;

import org.springframework.stereotype.Component;

@Component
public class Passanger {
	
	boolean weapon;
	
	public Passanger() {
		weapon = false;
	}
	
	public Passanger(boolean hasWeapon) {
		this.weapon = hasWeapon;
	}
	
	public boolean passControl() throws Exception {
		System.out.println("[Passanger try to pass a control in airport]");
		boolean forbidden = isWeapon();
		if(forbidden)
			throw new Exception();
		return forbidden;
	}

	public boolean isWeapon() {
		return weapon;
	}

	public void setWeapon(boolean weapon) {
		this.weapon = weapon;
	}

}
