import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        int A = Integer.parseInt(inputArr[0]);
        int B = Integer.parseInt(inputArr[1]);
        int C = Integer.parseInt(inputArr[2]);
        int reward = 0;
        if(A == B && B == C){
            reward = 10000+A*1000;
        } else if(A == B || A == C){
            reward = 1000+A*100;
        } else if(B == C){
            reward = 1000+B*100;
        } else {
            int max = Math.max(A, Math.max(B, C));
            reward = max*100;
        }
        System.out.println(reward);
    }
}