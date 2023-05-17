package ex21_30.ex24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            Pattern pattern = Pattern.compile("(?:<([^>]+>))([^<]+)(<\\/\\1)");

            Matcher matcher = pattern.matcher(line);

            while(matcher.find()){
                System.out.println(matcher.group(2));
            }
            if(!matcher.find(0)){
                System.out.println("None");
            }

            testCases--;
        }
    }
}
