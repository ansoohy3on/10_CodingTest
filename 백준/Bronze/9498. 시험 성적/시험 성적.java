// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String rank = "";
        if(score >= 90) {
            rank = "A";
        } else if(score >= 80){
            rank = "B";
        } else if(score >= 70){
            rank = "C";
        } else if(score >= 60){
            rank = "D";
        } else {
            rank = "F";
        }
        System.out.println(rank);
    }
}