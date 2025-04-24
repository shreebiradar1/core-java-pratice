package abstract_example;
//Let's try this with inner class

//Here is some complex topic but example is simple let's break it down 
//At first we have create a abstract class 
abstract class Computer {
	// Then the abstract method
	abstract void play();

//Then we create a new BUT inner class beneath Computer and made it static
	// There is reason we had made it static
	// We can directly create object of abstract class
	static class Laptop extends Computer {
		// Inside this class we had declare the abstract method which is play
		public void play() {
			System.out.println("Playing games inside laptop");
		}
	}

	// Let's see this without static keyword
	// Create another Inner class but this time without static keyword
	class Machine extends Computer {
		public void play() {
			System.out.println("Playing games inside a machine");
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		// --------------------with static -----------------------
		Computer laptop = new Computer.Laptop();
		laptop.play();

		// --------------------without static --------------------
		// There is little concept of Anonymous class
		// It means we were declare class definition at runtime (Late binding)
		// this is how you do it
		Computer obj = new Computer() {
			// Here, we have to fake the implementation of an abstract method
			void play() {
			}
		};

		// This is little bit complex but here Let's go with word by word
		Computer.Machine machine = obj.new Machine();

		// ----------------------- LHS part --------------------------------------------
		// Computer.Machine were we tell java that we are gonna store a Machine object
		// And java ask were it is so by pointing
		// It is inside the Computer class named Machine

		// ----------------------- RHS part
		// ---------------------------------------------
		// With the help of "obj" which is a temporary object of Anonymous class
		// through this we can get the play method which is present inside the Machine
		// class
		machine.play();

	}
}

//Code look complex but you will learn a lot from this 
//Believe me this is not from chatgpt


// 24/04/2025
