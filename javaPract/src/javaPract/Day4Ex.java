package javaPract;

import java.util.Scanner;
public class Day4Ex {
	public static void main(String[] args) {
		int H, M, C;
		int pH, pM;
		Scanner sc = new Scanner(System.in);
		H=sc.nextInt();
		M=sc.nextInt();
		C=sc.nextInt();
		int nH=H*60;
		M+=nH+C;
		H=M/60;
		M=M%60;
		if (H>=24) {
			H%=24;
		}
		System.out.println(H+" "+M);
	}
}
