package practice.test.coding;

import java.util.Scanner;

public class CaseConversion {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		String str = kb.nextLine();
		String str2 = "";
		
		int strlength = str.length();
		
		if(strlength <= 100) {
			
			for(int i=0; i<strlength; i++) {
				
				char ch = str.charAt(i);
				
				if((int)ch >= 65 && (int)ch <= 90) str2 += Character.toLowerCase(ch);
				if((int)ch >= 97 && (int)ch <= 122) str2 += Character.toUpperCase(ch);
			}

			System.out.println(str2);
			
		} else {
			System.out.println("100 글자 이하의 영어 알파벳만 입력해 주세요.");
		}
		
	}

}
