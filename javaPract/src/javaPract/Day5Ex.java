package javaPract;

import java.util.Scanner;
public class Day5Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		int A = B;
		int t, e, result;
		int count=1;
		while (true) {
			t= B / 10;
			e= B % 10;
			result= t+e;
			B = Integer.parseInt(Integer.toString(e)+Integer.toString(result%10));
			
			if(B == A) {
				break;
			}
			else {
				count++;
				continue;
			}
		}
		System.out.println(count);

		
	}
}
