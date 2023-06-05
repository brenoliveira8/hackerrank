package javaExercises.ex41_50.ex47;

import java.security.MessageDigest;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] hash = md5.digest(s.getBytes());

        StringBuilder sb = new StringBuilder();
        for(byte b : hash){
            sb.append(String.format("%02x", b));
        }

        System.out.printf(sb.toString());
    }
}
