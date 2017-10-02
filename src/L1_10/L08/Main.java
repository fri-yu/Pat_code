package L1_10.L08;

/**
 * Package : pat.L08
 *
 * @author YixinCapital -- jieliyu
 *         2017年09月29日 10:02:00
 */
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrLength = sc.nextInt();
		int movIndex = sc.nextInt();
		movIndex = movIndex % arrLength;
		LinkedList<Integer> link = new LinkedList<Integer>();
		for (int i = 0; i < arrLength; i++) {
			link.add(sc.nextInt());
		}
		for (int i = arrLength - movIndex; i < arrLength + arrLength - movIndex - 1; i++) {
			System.out.print(link.get(i % arrLength) + " ");
		}
		System.out.print(link.get(arrLength - movIndex - 1));
	}
}
