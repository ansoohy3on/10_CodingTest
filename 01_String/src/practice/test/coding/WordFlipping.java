package practice.test.coding;

import java.util.Scanner;

public class WordFlipping {
	
	public static String solution(String str) {
		
		char[] charArr = str.toCharArray();
		
		int start = 0;
		int end = charArr.length - 1;
		
		while(start < end) {
			char temp = charArr[start];
			charArr[start] = charArr[end];
			charArr[end] = temp;
			
			start++;
			end--;
		}
		
		return new String(charArr);
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int i = kb.nextInt();
		String[] str = new String[i];
		
		for(int x=0; x<i; x++) {
			str[x] = kb.next();
		}
		
		for(String x : str) {
			System.out.println(solution(x));
		}

	}
}