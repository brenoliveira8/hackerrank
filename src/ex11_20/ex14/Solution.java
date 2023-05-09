package ex11_20.ex14;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var A = scanner.nextLine();
        var B = scanner.nextLine();
        scanner.close();

        System.out.println(A.length() + B.length());

        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.print(A.substring(0,1).toUpperCase() + A.substring(1));
        System.out.print(" ");
        System.out.print(B.substring(0,1).toUpperCase() + B.substring(1));
    }
}
