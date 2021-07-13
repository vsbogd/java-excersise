class StringExample {

	public static void main (String[] args) {
		String greeting1 = "Hello world!";
		String greeting2 = new String("Hello world!");
		String greeting = greeting2;

		System.out.println(greeting1);
		System.out.println(greeting1.length());
		System.out.println(greeting1.substring(0, 5));
		System.out.println(greeting.charAt(11));
		// greeting1.charAt(12);

		String foo = "foo";
		String bar = "bar";

		String foobar = foo.concat(bar);
		String _foobar = foo + bar;

		System.out.println(foobar);
		System.out.println(_foobar);
		System.out.println(foo);
		System.out.println(bar);

		System.out.println("foobar == _foobar: " + foobar == _foobar);
		System.out.print("foobar.equals(_foobar): " + foobar.equals(_foobar));
	}
}
