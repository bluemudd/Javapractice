package javaPract;

import java.util.Scanner;
import java.util.Arrays;
public class Day8Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		float [] Score = new float[N];
		float [] fakeScore= new float[N];
		float Avg=0;
		for(int i=0; i<Score.length; i++) {
			Score[i]=sc.nextInt();
		}
		Arrays.sort(Score);
		for(int e=0; e<Score.length; e++) {
			fakeScore[e]=Score[e]/Score[N-1]*100;
			Avg+=fakeScore[e];
		}
		System.out.println(Avg/N);
		
	}
}
