import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        int A = Integer.parseInt(inputArr[0]);
        int B = Integer.parseInt(inputArr[1]);
        
        if(A > B){
            System.out.println(">");
        } else if(A < B){
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}