package ex1_10.ex7;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for(int queries = 1; queries <= q; queries++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int sum = a + b;
            System.out.print(sum);
            for(int i = 1; i < n; i++){
                System.out.print(" ");
                int pow = (int) Math.pow(2, i);
                sum += pow*b;
                System.out.print(sum);
            }

            System.out.println();
        }
    }
}