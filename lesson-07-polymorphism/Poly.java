class Parent {

	int pi;

	Parent() {
		System.out.println("Parent.Parent()");
		this.pi = 1;
	}

	void foo() {
		System.out.println("Parent.foo()");
	}

	void show() {
		System.out.println("Parent.show()");
	}
}

class Child extends Parent {

	int ci;

	Child() {
		System.out.println("Child.Child()");
		this.ci = 2;
	}

	void bar() {
		System.out.println("Child.bar()");
	}

	void show() {
		super.show();
		System.out.println("Child.show()");
	}

}

class P {
	int p;
	/*
	P() {
		this.p = 4;
	}
	*/

	P(int p) {
		this.p = p;
	}
}

/*
class C extends P {

}
*/

class CC extends P {
	CC() {
		super(4);
	}
}

class Empty /* extends Object */ {
	String str;
	public String toString() {
		return "this is an empty Object";
	}
}

class Int {
	int i;
	
	Int(int i) {
		this.i = i;
	}

	public String toString() {
		return "Int(i=" + i + ")";
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Int)) {
			return false;
		}
		Int other = (Int) obj;
		return this.i == other.i;
	}
}

class Poly {
	public static void main (String[] args) {
		Child child = new Child();

		System.out.println("child = new Child()");
		child.foo();
		child.bar();
		child.show();
		System.out.println("child.pi: " + child.pi);
		System.out.println("child.ci: " + child.ci);

		System.out.println("parent_child = new Child()");
		Parent parent_child = new Child();
		parent_child.foo();
		//parent_child.bar();
		parent_child.show();

		System.out.println("parent = new Parent()");
		Parent parent = new Parent();
		parent.foo();
		parent.show();

		//C c = new C();
		CC cc = new CC();

		Object obj = new Empty();
		Object ochild = new Child();
		Object oparent = parent;
		System.out.println("obj = any object works!");

		Object empty = new Empty();
		System.out.println("empty.toString(): " + empty.toString());
		System.out.println("obj.toString(): " + obj.toString());
		System.out.println("child.toString(): " + child.toString());
		System.out.println("empty == " + empty);

		//Empty e1;
		Empty e1 = null;
		Empty e2 = new Empty();
		if (e1 == e2) {
			System.out.println("ok");
		} else {
			System.out.println("not ok");
		}
		System.out.println("e2.str: " + e2.str);
		String[] stringArray = new String[3];
		System.out.println("stringArray[2]: " + stringArray[2]);

		Int a = new Int(1);
		Int b = new Int(42);
		Int c = new Int(42);
		System.out.println("a == " + a);
		System.out.println("b == " + b);
		System.out.println("c == " + c);
		System.out.println("b == c: " + (b == c));
		System.out.println("a.equals(c): " + a.equals(c));
		System.out.println("b.equals(c): " + b.equals(c));

	}
}

