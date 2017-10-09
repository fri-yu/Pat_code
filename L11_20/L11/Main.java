package L11_20.L11;

/**
 * Package : L11_20.L11
 *
 * @author YixinCapital -- jieliyu 2017年09月30日 17:13:00
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lineNumber = sc.nextInt();
		for (int i = 0; i < lineNumber; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			System.out.println("Case #" + (i + 1) + ": " + (a - c + b > 0));
		}
	}
}
