package L11_20.L12;

/**
 * Package : pat.src.L11_20.L11.L11
 *
 * @author YixinCapital -- jieliyu 2017年10月09日 09:56:00
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultArr[] = new int[5];
		boolean resultHasData[] = new boolean[5];
		int argCountR = sc.nextInt();
		int temp = -1;
		int countA3 = 0;
		for (int i = 0; i < argCountR; i++) {
			int currArg = sc.nextInt();
			switch (currArg % 5) {
			case 0:
				if (currArg % 10 == 0) {
					resultArr[0] += currArg;
					resultHasData[0] = true;
				}
				break;
			case 1:
				temp = 0 - temp;
				resultArr[1] += (temp) * currArg;
				resultHasData[1] = true;
				break;
			case 2:
				resultArr[2]++;
				resultHasData[2] = true;
				break;
			case 3:
				resultArr[3] += currArg;
				countA3++;
				resultHasData[3] = true;
				break;
			case 4:
				resultArr[4] = resultArr[4] - currArg > 0 ? resultArr[4] : currArg;
				resultHasData[4] = true;
				break;
			default:
				break;
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < resultArr.length; i++) {
			if (resultHasData[i])

				if (i != 3) {
					stringBuilder.append(resultArr[i]);
				} else {
					DecimalFormat df = new DecimalFormat("0.0");
					df.setRoundingMode(RoundingMode.HALF_UP);
					stringBuilder.append(df.format(((double) resultArr[3]) / countA3));
				}
			else
				stringBuilder.append("N");
			stringBuilder.append(" ");
		}
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		System.out.println(stringBuilder);
	}
}
