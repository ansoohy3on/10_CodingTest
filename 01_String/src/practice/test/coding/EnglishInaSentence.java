package practice.test.coding;

import java.util.Scanner;

public class EnglishInaSentence {

	public static String solution(String str) {
		
		String answer = "";
		int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화 (최솟값을 구할 때 많이 사용)
		
		String[] s = str.split(" "); // 띄어쓰기로 단어 구분
		
		for(String x : s) {
			
			int len = x.length();
			
			if(len > m) {
				m = len;
				answer = x;
			}

		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.nextLine();
		
		System.out.print(solution(str));
		
	}

}