package javaPract;

import java.util.Scanner;
public class Day10Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] N2 = new int[N];
		String [][] st = new String[N][];
		for (int i=0; i<st.length;i++) {
			N2[i]=sc.nextInt();
			st[i]=sc.next().split("");	
		}
		for(int j=0; j<st.length; j++) {
			for(int p=0; p<st[j].length; p++) {
				for(int q=0; q<N2[j]; q++) {
					System.out.print(st[j][p]);
				}
			}
			System.out.println();
		}
	}
}
