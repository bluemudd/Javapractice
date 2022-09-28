package javaPract;

import java.util.Scanner;

public class Day13 {
	public static int Fibo(int n) {
		if (0<n && n<=2) {
			return 1;
		}
		else if (n<=0 ) {
			return 0;
		}
		return Fibo(n-1)+Fibo(n-2);

	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Fibo(n));
	}
}
