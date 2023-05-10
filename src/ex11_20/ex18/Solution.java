package ex11_20.ex18;

import java.util.Scanner;

public class Solution{
    static boolean isAnagram(String a, String b) {
        String A = a.toUpperCase();
        String B = b.toUpperCase();
        if(A.length() != B.length()){
            return false;
        }

        int size = A.length();
        while(size > 0){
            String firstLetter = String.valueOf(A.charAt(0));
            if(!B.contains(firstLetter)){
                return false;
            }
            A = A.replaceFirst(firstLetter, "");
            B = B.replaceFirst(firstLetter, "");
            size--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
