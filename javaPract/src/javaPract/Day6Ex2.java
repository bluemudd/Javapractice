package javaPract;

import java.util.Scanner;
public class Day6Ex2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=9;
		
		int [] L= new int[N];
		for(int i =0; i<N; i++) {
			L[i] = sc.nextInt();
		}
		int max=L[0];
		int maxIndex=0;
		for(int a =0; a<N; a++) {
			if (max <= L[a]) {
				max=L[a];
				maxIndex=a+1;
			}
		}
		System.out.println(max+"\n"+maxIndex);
	}

}
