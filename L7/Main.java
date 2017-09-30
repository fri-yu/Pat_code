package pat.L7;

/**
 * Package : pat.L7
 *
 * @author YixinCapital -- jieliyu
 *         2017年09月28日 16:59:00
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer inputInteger = sc.nextInt();
		if (inputInteger < 4) {
			System.out.println(0);
		} else if (inputInteger < 7) {
			System.out.println(1);
		} else if (inputInteger < 11) {
			System.out.println(2);
		} else if (inputInteger < 19) {
			System.out.println(3);
		} else if (inputInteger < 23) {
			System.out.println(4);
		} else {
			int count = 4;
			int up = (inputInteger % 2 == 1) ? inputInteger / 2 : inputInteger / 2 - 1;
			for (int i = 11; i <= up; i++) {
				if (isPrime(2 * i - 1) && isPrime(2 * i + 1))
					count++;
			}
			System.out.println(count);
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 2)
			return false;
		for (int i = 2; i < Math.sqrt(num) + 1; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
