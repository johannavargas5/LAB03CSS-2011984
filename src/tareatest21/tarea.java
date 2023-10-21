package tareatest21;
import java.util.List;
import java.util.StringTokenizer;

public class tarea {

	public static void main(String[] args) {
		new tarea();
	}

	public tarea() {

	}

	// https://junit.org/junit5/docs/current/user-guide/

	// 1
	public static int addFirstNumbersException(int n) throws ArithmeticException {
		if (n < 0)
			throw new ArithmeticException("No ingresar números menores a 0");
		if (n == 0)
			return 0;
		else
			return n + addFirstNumbersException(n - 1);
	}

	// 2
	public static int findHighestNumber(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			return n1;
		} else if (n3 > n2) {
			return n3;
		} else {
			return n3;
		}
	}

	// 3
	public static int findMaxNumber(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	// 4
	public static int calculateCube(int n) {
		return n * n * n;
	}

	// 5
	public static String reverseWord(String str) {

		StringBuilder result = new StringBuilder();
		StringTokenizer tokenizer = new StringTokenizer(str, " ");

		while (tokenizer.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder();
			sb.append(tokenizer.nextToken());
			sb.reverse();

			result.append(sb);
			result.append(" ");
		}
		return result.toString();
	}

	// 6
	public static int compareTwoNumbers(int n1, int n2) {
		if (n1 > n2)
			return 1;
		else if (n1 < n2)
			return -1;
		return 0;
	}

	// 7
	public static void sortArray(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	// 8
	public static void removeDuplicates(final List<Integer> numbers) {
		for (int i = 0; i < numbers.size() - 1; i++) {
			for (int j = i + 1; j < numbers.size(); j++) {
				if (numbers.get(i).equals(numbers.get(j))) {
					numbers.remove(j);
				}
			}
		}
	}

	// 9
	public static double divTwoNumbers(int number1, int number2) {
		if (number2 == 0) {
			throw new IllegalArgumentException("No puedes dividir entre 0!");
		}
		return (double) number1 / number2;
	}

	// 10
	public static int add(List<Integer> numbers) {
		if (numbers == null || numbers.isEmpty()) {
			throw new NullPointerException();
		}
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		return sum;
	}

}
