package ex9;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = 1;
        while(scanner.hasNext()){
            System.out.println(line + " " + scanner.nextLine());
            line++;
        }
    }
}