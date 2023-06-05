package javaExercises.ex41_50.ex48;

import java.security.MessageDigest;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        byte[] hash = sha256.digest(s.getBytes());

        StringBuilder sb = new StringBuilder();
        for(byte b : hash){
            sb.append(String.format("%02x", b));
        }

        System.out.printf(sb.toString());
    }
}
