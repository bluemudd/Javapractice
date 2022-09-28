package javaPract;

import java.util.Scanner;

public class Day11 {
	public static int fact(int i) {
		if (i<=0) {
			return 1;
		}
		return i*fact(i-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(fact(x));
	}
}
