package javaPract;

import java.util.Scanner;
public class Day8Ex2 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int right = 0;
	int AnsSum=0;
	String [] arr= new String[N];
	for (int i=0; i<N; i++) {
		arr[i]=sc.next();
	}
	for(int j=0; j<N; j++) {
		right=0;
		AnsSum=0;
		String [] a= arr[j].split("");
		for(int m=0; m<arr[j].split("").length;m++) {
			 if (a[m].equals("O")) {
				 right+=1;
				 AnsSum+=right;
			 }
			 else {
				 right=0;
			 }
		}
		System.out.println(AnsSum);

	}


}
}
