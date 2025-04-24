package abstract_example;

abstract class A {
	public abstract String show();

}

class B extends A {

	public String show() {
		return "Showing something";
	}
}

public class BasicExample {

	public static void main(String[] args) {

		A obj = new B();

		B obj2 = new B();

		String str1 = obj.show();
		String str2 = obj2.show();

		System.out.println(str1);
		System.out.println(str2);
	}
}
