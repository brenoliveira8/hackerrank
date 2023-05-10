package ex11_20.ex16;

import java.util.Scanner;

public class Solution{
    public static String getSmallestAndLargest(String s, int k) {
        int start = 1;
        int end = k+1;
        String smallest = s.substring(0, k);
        String largest = smallest;

        while(end <= s.length()){
            String sub = s.substring(start, end);
            if(sub.compareTo(smallest) < 0){
                smallest = sub;
            }
            if(sub.compareTo(largest) > 0){
                largest = sub;
            }
            start++;
            end++;
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
