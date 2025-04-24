package abstract_example;

abstract class Computer {
	abstract void play();

	static class Laptop extends Computer {
		public void play() {
			System.out.println("Playing games inside laptop");
		}
	}

	class Machine extends Computer {
		public void play() {
			System.out.println("Playing games inside a machine");
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		Computer laptop = new Computer.Laptop();
		laptop.play();

		Computer obj = new Computer() {
			void play() {
			}
		};

		Computer.Machine machine = obj.new Machine();

		machine.play();

	}
}

// 24/04/2025
