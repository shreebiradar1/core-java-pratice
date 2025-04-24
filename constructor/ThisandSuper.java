package constructor;

class A {
	public A() {
		super();
		System.out.println("Constructor of A");
	}

	public A(int a) {
		super();
		System.out.println("Parameterized constructor of A");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("Constructor of B");
	}

	public B(int a) {
		super(a);

		System.out.println("Parameterized constructor of B");
	}
}

public class ThisandSuper {
	public static void main(String[] args) {
		B b = new B(2);

	}

}


// 13/04/2024
