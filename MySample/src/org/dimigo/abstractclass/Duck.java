package org.dimigo.abstractclass;

public class Duck extends Animal {
	
	public void sleep() {
		System.out.println("오리가 잠을 잡니다.");
	}

	@Override
	public void bark() {
		System.out.println("꽥꽥!!");
	}

}
