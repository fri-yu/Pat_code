package L1_10.L05;

/**
 * Package : pat.L05
 *
 * @author YixinCapital -- jieliyu
 *         2017年09月01日 17:28:00
 */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strCountStr = sc.nextLine();
		int strCount = Integer.parseInt(strCountStr);
		int intArr[] = new int[strCount];
		Set<Integer> intSet = new HashSet<Integer>();
		String str = sc.nextLine();
		String[] spArr = str.split(" ");
		for (int i = 0; i < intArr.length; i++) {
			int num = Integer.parseInt(spArr[i]);
			intArr[i] = num;
			while (num > 1) {

				if (num % 2 == 0) {
					num = num / 2;
					intSet.add(num);
				} else {
					num = (3 * num + 1) / 2;
					intSet.add(num);
				}

			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		Arrays.sort(intArr);
		for (int i = intArr.length - 1; i >= 0; i--) {
			if (!intSet.contains(intArr[i])) {
				stringBuilder.append(intArr[i]).append(" ");
			}
		}
		if (stringBuilder.length() > 0) {
			System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString());
		}

	}
}
