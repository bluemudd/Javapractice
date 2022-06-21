package javaPract;

import java.util.Scanner;
public class Day4Ex2 {
	public static void main(String[] args) {
		int a, b, c;
		int result;
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		if (a == b && b == c && c == a) {
			System.out.println(10000+(a*1000));
		}
		else if (a==b || b==c || c==a) {
			if ( a==b) {
				System.out.println(1000+(a*100));
			}
			else if(b==c) {
				System.out.println(1000+(b*100));
			}
			else {
				System.out.println(1000+(c*100));
			}
		}
		else {
			result= Math.max(a, Math.max(b,c));
			System.out.println(result*100);
		}
	}
}
