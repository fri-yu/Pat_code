package L11_20.L13;

/**
 * Package : L11_20.L13
 *
 * @author YixinCapital -- jieliyu
 *         2017年10月09日 15:31:00
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int indexS = sc.nextInt();
		int indexE = sc.nextInt();
		if (indexE < 2) {
			System.out.println(2);
		} else {
			int intArr[] = new int[indexE + 1];
			intArr[1] = 2;
			int arrIndex = 2;
			for (int i = 3; i <= 100000000; i++) {
				if (isPrime(i, intArr, arrIndex)) {
					arrIndex++;
				}
				if (arrIndex > indexE)
					break;
			}

			for (int circle = 1, i = indexS; i < indexE + 1; i++, circle++) {
				System.out.print(intArr[i]);
				if (circle % 10 == 0 || i == indexE) {
					System.out.print("\r\n");
				} else {
					System.out.print(" ");
				}
			}
		}
	}

	static boolean isPrime(int arg, int[] intArr, int arrIndex) {
		for (int i = 1; i < arrIndex; i++) {
			if (arg % intArr[i] == 0) {
				return false;
			}
		}
		intArr[arrIndex] = arg;
		return true;
	}
}
