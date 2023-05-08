package ex5;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        int i1 = scanner.nextInt();
        String s2 = scanner.next();
        int i2 = scanner.nextInt();
        String s3 = scanner.next();
        int i3 = scanner.nextInt();

        while(s1.length() != 15){
            s1 += " ";
        }
        if(i1 >= 100){
            s1 += i1;
        }
        if(i1 < 100 && i1 > 0){
            s1 += "0"+i1;
        }
        if(i1 < 10 && i1 > 0){
            s1 += "00"+i1;
        }
        if(i1 == 0){
            s1 += "000";
        }

        while(s2.length() != 15){
            s2 += " ";
        }
        if(i2 >= 100){
            s2 += i2;
        }
        if(i2 < 100 && i2 > 0){
            s2 += "0"+i2;
        }
        if(i2 < 10 && i2 > 0){
            s2 += "00"+i2;
        }
        if(i2 == 0){
            s2 += "000";
        }

        while(s3.length() != 15){
            s3 += " ";
        }
        if(i3 >= 100){
            s3 += i3;
        }
        if(i3 < 100 && i3 > 0){
            s3 += "0"+i3;
        }
        if(i3 < 10 && i3 > 0){
            s3 += "00"+i3;
        }
        if(i3 == 0){
            s3 += "000";
        }

        System.out.println("================================");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("================================");
    }
}
