package L11_20.L14;

/**
 * Package : L11_20.L14
 *
 * @author YixinCapital -- jieliyu 2017年10月09日 17:24:00
 */

/**
 * 思路：
 * 1、获取输入值
 * 2、定义Map
 * 3、查找ABCDEFG哪个重复出现了
 * 4、继续查找：0-9、A-N 哪个重复出现了（假设位置是一定正确的）
 * 5、查找第三第四个字符串中重复出现的字符，根据位置输出对应分钟数
 */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] DAY = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		String arg1 = sc.nextLine();
		String arg2 = sc.nextLine();
		String arg3 = sc.nextLine();
		String arg4 = sc.nextLine();

		int len12 = Math.min(arg1.length(), arg2.length());
		int len34 = Math.min(arg3.length(), arg4.length());
		String a_g[] = { "A", "B", "C", "D", "E", "F", "G" };
		Map<String, String> stringMap = new HashMap<String, String>() {
			{
				put("A", "MON");
				put("B", "TUE");
				put("C", "WED");
				put("D", "THU");
				put("E", "FRI");
				put("F", "SAT");
				put("G", "SUN");
			}
		};
		int index_1 = 0;
		for (String character : a_g) {
			if (arg1.indexOf(character) != -1 && arg1.indexOf(character) == arg2.indexOf(character)) {
				index_1 = arg1.indexOf(character);
				System.out.print(stringMap.get(character) + " ");
				break;
			}
		}
		for (int i = index_1 + 1; i < len12; i++) {
			if (arg1.charAt(i) == arg2.charAt(i)) {
				if (arg1.charAt(i) >= '0' && arg1.charAt(i) <= '9') {
					System.out.print("0" + arg1.charAt(i) + ":");
					break;
				} else if (arg1.charAt(i) >= 'A' && arg1.charAt(i) <= 'N') {
					System.out.print((arg1.charAt(i) - 55) + ":");
					break;
				}
			}
		}

		for (int i = 0; i < len34; i++) {
			char character = arg3.charAt(i);
			if (character >= 'a' && character <= 'z' && character == arg4.charAt(i)) {
				if (i < 10)
					System.out.print("0" + i);
				else
					System.out.print(i);
				break;
			}
		}
	}
}
