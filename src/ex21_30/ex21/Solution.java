package ex21_30.ex21;

import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    public String pattern = "^(?:(\\d)\\.|" + // (Start: from 0. to 9.) or
            "(\\d\\d)\\.|" + // (Start: from 00. to 99.) or
            "(?:([01]\\d\\d)\\." + // (Start: From 000. to 199.) or
            "|(?:(2[0-4]\\d)|(25[0-5]))\\.))" + // (Start: (from 200. to 249.) or (from 250. to 255.))
            "{3}" + //Repeats 3 times
            "(?:(\\d)$|" + // (End: from 0 to 9) or
            "(\\d\\d)$|" + // (End: from 00 to 99) or
            "(?:([01]\\d\\d)$" + // (End: from 000 to 199) or
            "|(?:(2[0-4]\\d)|(25[0-5]))$))"; // (End: (from 200 to 249) or (from 250 to 255))
}
