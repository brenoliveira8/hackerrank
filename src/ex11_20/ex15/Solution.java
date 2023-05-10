package ex11_20.ex15;

import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String out = s.substring(start, end);
        System.out.println(out);
    }
}
