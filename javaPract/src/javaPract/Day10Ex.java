package javaPract;
import java.util.Scanner;
class Text{

	long sum(int[] a) {
		long ans=0;
		for (int i =0; i<a.length; i++) {
			ans+=a[i];
		}
			return ans; 
	}
}
public class Day10Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Text t = new Text();
		int N = sc.nextInt();
		int [] b = new int[N];
		for(int a=0; a<N; a++) {
			b[a]=sc.nextInt();
		}
		System.out.println(t.sum(b));
	}
}
