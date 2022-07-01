package javaPract;

import java.util.ArrayList;
public class Day9Ex2 {
	public static void main(String[] args) {
		long sum=0;
		ArrayList<Long> noself=new ArrayList<Long>();
		ArrayList<Long> self=new ArrayList<Long>();
		for(long i=0; i<10; i++) {
			sum=i+i;
			noself.add(sum);
			
		}
		sum=0;
		for(long a=10; a<100; a++) {
			sum=a+((a/10)+(a%10));
			if(sum>=10000) {
				sum=0;
				continue;
			}
			else {
			noself.add(sum);
			sum=0;
			}
		}
		sum=0;
		for(long b=100; b<1000; b++) {
			sum=b+((b/100)+((b%100)/10)+(b%100)%10);
			if(sum>=10000) {
				sum=0;
				continue;
				
			}
			else {
				noself.add(sum);
				sum=0;
			}
		}
		sum=0;
		for(long c=1000; c<=10000; c++) {
			sum=c+((c/1000)+(c%1000/100)+(c%1000%100/10)+(c%1000%100%10));
			if(sum>=10000) {
				sum=0;
				continue;
			}
			else {
			
				noself.add(sum);
				sum=0;
			}
		}
		for(long d=1; d<10000; d++) {
			if (noself.contains(d)) {
				continue;
			}
			else {
				self.add(d);
				System.out.println(d);
			}
		}
	}
}
