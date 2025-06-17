package Examples;
import java.util.HashSet;
import java.util.Set;

public class DuplicateChecker {

	public static void checkForDuplicates(int[] numbers) throws DuplicateNumberException {
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int number : numbers) {
			if (!seen.add(number)) {
				duplicates.add(number);
			}
		}

		if (!duplicates.isEmpty()) {
			throw new DuplicateNumberException(duplicates);
		} else {
			System.out.println("No duplicates found.");
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 2, 5, 3 };

		try {
			checkForDuplicates(nums);
		} catch (DuplicateNumberException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}