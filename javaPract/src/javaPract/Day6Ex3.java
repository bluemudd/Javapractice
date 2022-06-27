package javaPract;

import java.util.Arrays;
import java.util.Scanner;
public class Day6Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int result=A*B*C;
		System.out.println(result);
		int [] num = {0,0,0,0,0,0,0,0,0,0,0};
		String resultString=String.valueOf(result);
		String [] resultString2 = resultString.split("");
		for(int i =0; i<resultString2.length; i++) {
			if (Integer.parseInt(resultString2[i])==0) {
				num[0]+=1;
			}
			else if (Integer.parseInt(resultString2[i])==1) {
				num[1]+=1;
			}
			else if (Integer.parseInt(resultString2[i])==2) {
				num[2]+=1;
			}
			else if (Integer.parseInt(resultString2[i])==3) {
				num[3]+=1;
			}
			else if (Integer.parseInt(resultString2[i])==4) {
				num[4]+=1;
			}
			else if (Integer.parseInt(resultString2[i])==5) {
				num[5]+=1;
			}
			else if (Integer.parseInt(resultString2[i])==6) {
				num[6]+=1;
			}
			else if (Integer.parseInt(resultString2[i])==7) {
				num[7]+=1;
			}
			else if (Integer.parseInt(resultString2[i])==8) {
				num[8]+=1;
			}
			else {
				num[9]+=1;
			}
		}
		for (int a=0; a<10; a++) {
			System.out.println(num[a]);
		}
		
	}
}
