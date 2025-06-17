package Examples;

public class Question1 {

	public static void main(String[] args) {

		int x = 2;
		int y = 1;
		int z = 2;
		if (x == y && y == z) {
			System.out.println("All are equal.");
		} else if (x == y || y == z || x == z) {
			System.out.println("Two are equal.");
		} else {
			System.out.println("All are not equal.");
		}
	}
}
