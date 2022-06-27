package javaPract;

import java.util.Scanner;
import java.util.Arrays;
public class Day7Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a= new int [10];
		int [] b= new int [10];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		for(int j=0; j<a.length; j++) {
			b[j]=a[j]%42;
		}
		int[] distinct = Arrays.stream(b).distinct().toArray();
		System.out.println(distinct.length);
	}
}
