package ex11_20.ex11;

import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        try{
            String s = String.valueOf(n);
            System.out.println("Good job");
        }catch(Exception e){
            System.out.println("Wrong answer");
        }
    }
}
