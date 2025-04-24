package abstract_example;

abstract class A {
	public abstract String show();

}

class B extends A{
	// if we inherit abstract class we need to define all the declare method of
	// abstract class
	public String show() {
		return "Showing something";
	}
}

public class BasicExample {

	public static void main(String[] args) {
		//We can't create object of an abstract class (we can refer it)
		//This is called dynamic method dispatch
		A obj = new B();
		
		//Or you can just create a simple object 
		B obj2 = new B();
		
		//You can use whatever object you want
		//It is returning we have to create a variable where it can store the value which is returned.
		String str1 = obj.show();
		String str2 = obj2.show();
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
