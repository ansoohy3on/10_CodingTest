package practice.test.coding;

import java.util.Scanner;

public class WordFlipping2 {

	// 해당 문자가 알파벳인지 확인하는 메소드
	public static boolean isAlphabet(char c) {
		return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		kb.nextLine();

		// 입력받은 문자열 문자 배열로 변경
		char[] charArr = str.toCharArray();

		int start = 0;
		int end = charArr.length - 1;

		while(start < end) {

			// 왼쪽 문자가 특수문자인지 확인
			if(!isAlphabet(charArr[start])) start++;
				
			// 오른쪽 문자가 특수문자인지 확인
			else if (!isAlphabet(charArr[end])) end--;
				
			// 해당 문자가 알파벳일 경우
			else {
				char tmp = charArr[start];
				charArr[start] = charArr[end];
				charArr[end] = tmp;

				start++;
				end--;
			}
		}
		
		System.out.println(charArr);
	}

}
