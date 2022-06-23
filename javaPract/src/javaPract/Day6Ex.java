package javaPract;

import java.util.Scanner;
import java.util.Arrays;
public class Day6Ex {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N];
		for (int i = 0; i<L.length; i++) {
			L[i]=sc.nextInt();
		}
		Arrays.sort(L);
		System.out.print(L[0]+" "+L[N-1]);
	}

}
