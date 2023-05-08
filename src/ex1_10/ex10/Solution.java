package ex1_10.ex10;

import java.util.Scanner;

public class Solution{
    static {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if((b > 0) && (h > 0)){
            System.out.println(b*h);
        }else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
    }
}
