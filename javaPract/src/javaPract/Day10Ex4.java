package javaPract;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Day10Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> as = new ArrayList<>();
		String [] word = sc.next().toUpperCase().split("");
		ArrayList<Integer> wordlen = new ArrayList<Integer>();
		int count=0;

		for (int i=0; i<word.length; i++) {
			if (!as.contains(word[i])) {
				as.add(word[i]);
				wordlen.add(1);
			}
			else {
				wordlen.set(as.indexOf(word[i]), wordlen.get(as.indexOf(word[i]))+1);
			}
		}
		for(int j=0; j<wordlen.size(); j++) {
			if(wordlen.get(j).equals(Collections.max(wordlen))) {
				count++;
			}
			else {
				continue;
			}
		}
		if (count >= 2) {
			System.out.println("?");
		}
		else {
			System.out.println(as.get(wordlen.indexOf(Collections.max(wordlen))));
		}
		
	}
	
}
