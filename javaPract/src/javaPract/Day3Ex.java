package javaPract;
import java.util.Scanner;

public class Day3Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H, M;
		H=sc.nextInt();
		M=sc.nextInt();
		int RM = M-45;
		if (RM < 0) {
			RM+=60;
			H-=1;
			if (H <0) {
				H +=24;
				System.out.print(H+" "+RM);
			}
			else {
			System.out.print(H+" "+RM);
			}
		}
		else {
			System.out.print(H+" "+RM);
		}
		
	}
}
