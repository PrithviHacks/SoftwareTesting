package Java;

public class FibonnaciSeries {
	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}
}

//Write program for Fibonacci series range from 0 to 10 