package L2;

/**
 * Package : pat.L2
 *
 * @author YixinCapital -- jieliyu
 *         2017年09月01日 16:06:00
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numStr=sc.nextLine();
		String [] arr2={"gnil","iy","re","nas","is","uw","uil","iq","ab","uij"};
		int num;
		int sum = 0;
		//字符串各数字求和
		for(int i=0;i<numStr.length();i++){
			num = Integer.parseInt(numStr.substring(i,i+1));
			sum += num;
		}
		//对求出的和进行按位求余，并把“翻转的数字-拼音”字符串拼接到后面
		StringBuilder stringBuilder=new StringBuilder();
		while (sum>0){
			stringBuilder.append(arr2[sum%10]+" ");
			sum=sum/10;
		}
		System.out.println(stringBuilder.reverse().delete(0,1).toString());
	}
}
