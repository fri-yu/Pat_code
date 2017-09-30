package pat.L3;

/**
 * Package : pat.L3
 *
 * @author YixinCapital -- jieliyu
 *         2017年09月01日 16:27:00
 */
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strCountStr = sc.nextLine();
		int strCount = Integer.parseInt(strCountStr);
		String[] strArr = new String[strCount];
		for (int i = 0; i < strCount; i++) {
			strArr[i] = sc.nextLine();
		}
		int[] intArr = new int[3];
		boolean checkResult = false;
		for (int i = 0; i < strCount; i++) {
			char[] ca = strArr[i].toCharArray();

			for (int j = 0; j < ca.length; j++) {
				switch (ca[j]) {
				case 0:
					break;
				case 80:
					if (intArr[0] == 0)
						intArr[0] = 1;
					break;
				case 65:
					if (intArr[0] == 1)
						intArr[1] = 1;
					break;
				case 84:
					if (intArr[1] == 1)
						intArr[2] = 1;
					break;
				default:
					intArr[0] = -1;
					break;
				}
			}
			if (intArr[0] == 1) {
				if (intArr[1] == 1) {
					if (intArr[2] == 1) {
						if (strArr[i].indexOf('P')
								* (strArr[i].indexOf('T') - strArr[i].indexOf('P') - 1) == strArr[i].length()
										- strArr[i].indexOf('T') - 1) {
							checkResult = true;
						}
						intArr[2] = 0;
					}
					intArr[1] = 0;
				}
			}
			intArr[0] = 0;
			if (checkResult) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			checkResult = false;
		}

	}
}
