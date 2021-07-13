class MyClass {

	int i;
	boolean b;
	String str;

	MyClass(boolean b) {
		this.b = b;
	}

	void show() {
		System.out.println("MyClass");
	}

	int getI() {
		return i;
	}

	void setI(int i) {
		this.i = i;
	}

	void setB(boolean _b) {
		b = _b;
	}

	static void foo() {
	}

	static class OddCache {

		int i;
		boolean odd;

		OddCache(int i) {
			setI(i);
		}

		void setI(int i) {
			this.i = i;
			this.odd = i % 2 == 1;
		}

		boolean isOdd() {
			return odd;
		}

	}

	static class MyPojo {
		int a;
		double b;
	}
	
	public static void main (String[] args) {
		MyClass ref = new MyClass(true);	
		ref.show();
		System.out.println("ref.i == " + ref.i);
		System.out.println("ref.b == " + ref.b);

		MyClass.foo();

		OddCache c = new OddCache(1);
		System.out.println("c.isOdd() == " + c.isOdd());
		c.i = 2;
		System.out.println("c.isOdd() == " + c.isOdd());
		c.setI(2);
		System.out.println("c.isOdd() == " + c.isOdd());

		MyPojo pojo = new MyPojo();
		pojo.a = 3;
		pojo.b = 4.0;
	}


}
