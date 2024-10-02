package bt;

import static java.lang.System.in;

import java.util.Scanner;

public class PrimeNumbers {
	public static boolean prime(int num, int divisor) {

		if (divisor == 1) {
			return true;
		}

		if (num % divisor == 0) {
			return false;
		}
		return prime(num, divisor - 1);
	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		return prime(num, (int) Math.sqrt(num));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int in = scanner.nextInt();
		System.out.println(isPrime(in));
	}
}
