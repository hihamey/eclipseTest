package org.dimigo.abstractclass;

// test1111
public class GreetingTest {

	public static void main(String[] args) {
//		Person[] people = {new Korean(), new Japanese(), new Chinese()};
		Person[] people = new Person[3];
		people[0] = new Korean();
		people[1] = new Japanese();
		people[2] = new Chinese();
		
		for(Person person : people) {
			person.sayHello();
		}
		
		System.out.println("------------------------------");
		
		for(Person person : people) {
			person.sayBye();
		}

	}

}
