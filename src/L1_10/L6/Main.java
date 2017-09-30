package L1_10.L6;

/**
 * Package : pat.L6
 *
 * @author YixinCapital -- jieliyu
 *         2017年09月02日 17:15:00
 */
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num_b = num / 100;

		int num_s = num / 10 % 10;
		int num_ = num % 10;
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < num_b; i++)
			output.append("B");
		for (int i = 0; i < num_s; i++)
			output.append("S");
		for (int i = 1; i < num_ + 1; i++)
			output.append(i);
		System.out.println(output.toString());
	}
}