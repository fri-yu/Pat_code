package pat.L1;

import java.util.Scanner;

/**
 * Package : pat.L1
 *
 * @author YixinCapital -- jieliyu 2017年09月01日 14:59:00
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int step=0;//步数计数

		while(num >1){
			if(num%2 == 0){//如果是偶数
				num = num/2;
				step++;
			}
			else{
				num = (3*num+1)/2;//(3N+1)/2
				step++;
			}
		}
		System.out.println(step);

	}
}
