package exception;

public class ArrayException {
	public static void main(String[] args) {
		// unchecked Exception
		int[] a = { 10, 20, 30, 40, 50 };
		for (int i = 0; i <= 5; i++) {
			System.out.println(a[i]);
		}
	}
}