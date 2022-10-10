package ch7.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal animal = new Animal();
		
		System.out.println(dog.kind);
		System.out.println(animal.kind);
		System.out.println(cat.kind);
		
//		dog.sound();
//		cat.sound();
//		System.out.println();
//		System.out.println(dog.kind);
//		
//		Animal animal = null;
//		animal = new Dog();
//		animal.sound();
//		animal = new Cat();
//		animal.sound();
//		
//		System.out.println();
//		animal(dog);
//		animal(cat);
//		
//	}
//	public static void animal(Animal animal) {
//		animal.sound();
//	}
}
}