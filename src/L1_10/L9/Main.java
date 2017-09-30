package L1_10.L9;

/**
 * Package : L9
 *
 * @author YixinCapital -- jieliyu
 *         2017年09月30日 15:30:00
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String totalString = sc.nextLine();

		String[] stringArr = totalString.split(" ");
		if (stringArr.length == 1) {
			System.out.println(totalString);
		} else {
			for (int i = stringArr.length - 1; i >= 1; i--) {
				System.out.print(stringArr[i] + " ");
			}
			System.out.println(stringArr[0]);
		}
	}
}
