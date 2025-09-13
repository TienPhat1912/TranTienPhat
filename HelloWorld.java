package test1;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World Java");
		for (int i = 0; i < 10; i++) {

			if (i % 2 == 0) {

				continue;
			}
			System.out.print(i + " ");
		}
	}
}
