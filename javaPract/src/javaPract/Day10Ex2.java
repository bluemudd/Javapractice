package javaPract;

import java.util.Scanner;
import java.util.ArrayList;
public class Day10Ex2 {
	public static void main(String[] args) {
		int [] a ;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList <Integer> b = new ArrayList<Integer>();
		int count=0;
		for (int i =1; i<=N; i++) {
			if(i< 100) {
				count++;
			}
			else if (i <1000) {
				b.add(i/100);
				b.add((i/10)%10);
				b.add((i%10)%10);

				if ((b.get(0)+2*(b.get(1)-b.get(0)))==b.get(2)) {
					count++;
				}
				b.clear();
				continue; 
				
			}
		}
		System.out.println(count);
	}
}
