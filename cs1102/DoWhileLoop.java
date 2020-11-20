
public class DoWhileLoop {
	public static void main(String[] args) {

		int number = 10;
		
		do {
			System.out.println(number);
			number--; // Go on to the next number.
		}
		while (number > 0);
		System.out.println("Blastoff!");
	}
}
