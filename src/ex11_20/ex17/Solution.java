package ex11_20.ex17;

import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean isPalindrome = false;
        int start = 0;
        int half = A.length() / 2;
        int end = A.length() - 1;
        String first = A.substring(start, start + 1);
        String last = A.substring(end, end + 1);

        if(first.equals(last)){
            isPalindrome = true;
        }
        while((start < half) && (first.equals(last))){
            start++;
            end--;
            first = A.substring(start, start + 1);
            last = A.substring(end, end + 1);
            if(!first.equals(last)){
                isPalindrome = false;
            }
        }

        if(isPalindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
