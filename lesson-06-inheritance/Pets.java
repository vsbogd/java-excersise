abstract class Pet {

	String name;

	Pet(String name) {
		this.name = name;
	}

	void show() {
		System.out.println("Pet(name=" + name + ")");
	}
}

class Cat extends Pet {
	
	boolean catchMice;

	Cat(String name, boolean catchMice) {
		super(name);
		this.catchMice = catchMice;
	}

	void show() {
		System.out.println("Cat(name=" + name + ", catchMice=" + catchMice + ")");
	}
}

class Dog extends Pet {

	boolean trained;

	Dog(String name, boolean trained) {
		super(name);
		this.trained = trained;
	}

	void show() {
		System.out.println("Dog(name=" + name + ", trained=" + trained + ")");
	}

}

class Pets {

	public static void main (String[] args) {

		//Compilation error 
		//Pet p = new Pet();
		Pet p;

		Cat c = new Cat("Murka", true);
		p = c;
		p.show();

		Cat c1 = (Cat) p;
		c1.show();

		Dog d = new Dog("Sharik", false);
		p = d;
		p.show();
	
		Dog d1 = (Dog) p;
		d1.show();

		// Class cast exception
		//Cat c2 = (Cat) p;
	}

}
