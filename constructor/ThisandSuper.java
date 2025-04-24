package constructor;

class A {
	public A() {
		super();
		System.out.println("Constructor of A");
	}

	// Parameterized constructor
	public A(int a) {
		super();
		System.out.println("Parameterized constructor of A");
	}
}

class B extends A {
	// Let's create a constructor of B
	public B() {
		super();
		System.out.println("Constructor of B");
	}

	// Parameterized constructor
	public B(int a) {
//		super();
		super(a);
		
		//For calling both the constructor of B
//		this();
		System.out.println("Parameterized constructor of B");
	}
}

public class ThisandSuper {
	public static void main(String[] args) {
		// If we create a object of B the what will print
		
//		B b = new B();

		// First it goes with constructor of A because of super keyword bydefault it is
		// present and it say before calling subclass call parent class constructor

		// But what if we call Parameterized constructor of B
		B b = new B(2);

		// By this it will call non-parameterized constructor of A and parameterized
		// constructor of B

		// If we want it should call the parameterized constructor of A, we must pass
		// parameter inside super keyword of parameterized constructor of B
		
		//But if we want to call both the constructor of B we can use there this keyword.
	}

}

// 13/04/2025