package org.dimigo.abstractclass;

public class Cat extends Animal {
	
	public void sleep() {
		System.out.println("고양이가 잠을 잡니다.");
	}

	@Override
	public void bark() {
		System.out.println("야옹!!");
	}


}
