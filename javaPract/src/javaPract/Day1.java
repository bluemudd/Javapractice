package javaPract;
import java.util.Scanner;


public class Day1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("수를입력하시오");
		int Score=sc.nextInt();
		String grade;
		switch(Score/10) {
		case 10:
		case 9:
			grade="A";
			break;
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:
			grade="D";
			break;
		default:
			grade="F";
		}
		System.out.println("학점:"+grade);
	}
}
