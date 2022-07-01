package javaPract;

import java.util.Scanner;
public class Day9Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		float sum = 0;
		float sum2=0;
		int count =0;
		float result;
		int b=0;
		float [] average = new float[N];
		int [][] a = new int[N][];
		for (int j=0; j<N; j++) {
			b = sc.nextInt();
			a[j]= new int[b];
			for (int i =0; i<b; i++) {
				a[j][i]=sc.nextInt();
			}
			b=0;
		}
		for (int d=0; d<N; d++) {
			for (int e=0; e<a[d].length; e++) {
				sum+=a[d][e];

			}
			average[d]=sum/(a[d].length);
			sum=0;
		}
		for (int f=0; f<N; f++) {
			for(int g=0; g<a[f].length; g++) {
				if (a[f][g]>average[f]) {
					count+=1;
				}
				else {
					continue;
				}

			}
			result= ((float)count/a[f].length)*100;
			System.out.println(String.format("%.3f", result)+"%");
			result=0;
			count=0;
			
		}
		
	}

}
