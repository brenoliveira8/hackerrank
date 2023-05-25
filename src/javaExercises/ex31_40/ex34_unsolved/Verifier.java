package javaExercises.ex31_40.ex34_unsolved;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Verifier{
    public static void main(String[] args) throws FileNotFoundException{
        File hackerRankFile = new File("correct.txt");
        Scanner hackerRankScanner = new Scanner(hackerRankFile);
        File myOutputFile = new File("output.txt");
        Scanner myOutputScanner = new Scanner(myOutputFile);

        int count = 1;
        while(myOutputScanner.hasNextLine()){
            if(!myOutputScanner.nextLine().equals(hackerRankScanner.nextLine()))
                System.out.println(count);
            count++;
        }

        hackerRankScanner.close();
        myOutputScanner.close();
    }
}
