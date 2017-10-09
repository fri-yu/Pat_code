package L1_10.L04;

/**
 * Package : pat.L04
 *
 * @author YixinCapital -- jieliyu
 *         2017年09月01日 17:06:00
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strCountStr = sc.nextLine();
		int strCount = Integer.parseInt(strCountStr);
		int maxScore = 0;
		int minScore = 101;
		int tempScore;
		StringBuilder firStr = new StringBuilder();
		StringBuilder secStr = new StringBuilder();
		for (int i = 0; i < strCount; i++) {
			String str = sc.nextLine();
			String[] spArr = str.split(" ");
			tempScore = Integer.parseInt(spArr[2]);
			if (maxScore < tempScore) {//if maxScore < input number
				maxScore = tempScore;
				firStr.delete(0,firStr.length());
				firStr.append(spArr[0]).append(" ").append(spArr[1]);
			}
			if (minScore > tempScore) {
				minScore = tempScore;//if minScore > input number
				secStr.delete(0,firStr.length());
				secStr.append(spArr[0]).append(" ").append(spArr[1]);
			}
		}
		System.out.println(firStr);
		System.out.println(secStr);
	}
}
