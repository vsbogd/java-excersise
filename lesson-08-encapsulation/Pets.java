import java.lang.String;

abstract class Pet {

	private String name;

	protected Pet(String name) {
		this.name = name;
	}

	protected String getName() {
		return name;
	}

	public void show() {
		System.out.println("Pet with name: " + name);
		foo();
	}

	private void foo() {
	}

}

class Cat extends Pet {

	public Cat(String name) {
		super(name);
		// cannot access private field
		//this.name = name;
	}

	public void call(String name) {
		if (getName() == name) {
			System.out.println("Myauooo");
		}
	}
	
	public void show() {
		System.out.println("Cat with name: " + getName());
	}
}

class Parrot extends Pet {

	public Parrot(String name) {
		super(name);
	}

	public String sayName() {
		return super.getName();
	}

}

public class Pets {

	public static void main(String[] args) {
		//Pet pet = new Pet("Sharik");
		//pet.show();

		// attempt to set private field
		//pet.name = "Bublik";
		//pet.show();

		// attempt to get private field
		//System.out.println("Pet name is: " + pet.name);
		
		// attempt to call private
		//pet.foo();
		
		// set and get field via methods
		//pet.setName("Bublik");
		//System.out.println("Pet name is: " + pet.getName());
		
		Cat cat = new Cat("Bublik");
		cat.show();
		cat.call("Sharik");
		cat.call("Bublik");

		Parrot parrot = new Parrot("Kesha");
		System.out.println("Parrot.sayName(): " + parrot.sayName());

		Pet pet = new Cat("Pushok");
		pet.show();
	}

}
