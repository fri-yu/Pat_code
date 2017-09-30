package L1_10.L10;

/**
 * Package : L10
 *
 * @author YixinCapital -- jieliyu 2017年09月30日 15:41:00
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		boolean flag = false;
		while(sc.hasNext()){
			a = sc.nextInt();
			b = sc.nextInt();
			if(b>0)
				if(!flag){
					System.out.print(a*b+" "+(b-1));
					flag = true;
				}
				else{
					System.out.print(" "+a*b+" "+(b-1));
				}

		}
		if(!flag)
			System.out.print("0 0");
	}
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		if (strArr.length % 1 == 1 || strArr.length == 0) {
			System.out.println("0 0");
		}
		int halfLength = strArr.length / 2;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < halfLength - 1; i++) {
			Integer a = Integer.parseInt(strArr[2 * i]);
			Integer b = Integer.parseInt(strArr[2 * i + 1]);
			stringBuilder.append(a * b).append(" ").append(b - 1).append(" ");
		}
		if (!strArr[strArr.length - 1].equals("0")) {
			Integer a = Integer.parseInt(strArr[strArr.length - 2]);
			Integer b = Integer.parseInt(strArr[strArr.length - 1]);
			stringBuilder.append(a * b).append(" ").append(b - 1);
		} else {
			if (stringBuilder.length() > 0)
				stringBuilder.deleteCharAt(stringBuilder.length() - 1);
			else
				stringBuilder.append("0 0");
		}
		System.out.println(stringBuilder.toString());
	}
}
