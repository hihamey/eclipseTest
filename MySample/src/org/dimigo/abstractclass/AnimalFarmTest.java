package org.dimigo.abstractclass;

public class AnimalFarmTest {

	public static void main(String[] args) {

		Animal[] animals = {new Dog(), new Cat(), new Duck()};
		for(Animal animal : animals) {
			animal.sleep();
		}
			
		// 추상클래스로는 객체를 생성할 수 없다!!!
//		Animal a = new Animal();
//		a.sleep();
		
		System.out.println("-------- 늑대가 나타났다!! -----------");
		
		for(Animal animal : animals) {
			animal.bark();
		}
	}

}
