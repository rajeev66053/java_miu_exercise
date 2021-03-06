import java.util.Arrays;

public class Prog6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "horse", "dog", "cat", "horse", "dog" };
		// Sorting array first
		Arrays.sort(arr);
		String[] removeDup = removeDups(arr);
		System.out.println(Arrays.toString(removeDup));
	}

	public static String[] removeDups(String[] arrayWithDuplicates) {

		// Assuming all elements in input array are unique

		int length = arrayWithDuplicates.length;

		// Comparing each element with all other elements

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
					// Replace duplicate element with last unique element

					arrayWithDuplicates[j] = arrayWithDuplicates[length - 1];

					// Decrementing length

					length--;

					// Decrementing j

					j--;
				}
			}
		}

		// Copying only unique elements of arrayWithDuplicates into
		// arrayWithoutDuplicates

		String[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, length);

		return arrayWithoutDuplicates;
	}
}
