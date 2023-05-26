package javaExercises.ex31_40.ex34;

import java.util.Scanner;

public class Solution{
    public static boolean canWin(int leap, int[] game, int pos){
        if(pos < 0 || game[pos] == 1){
            return false;
        }
        if((pos + leap) >= game.length || (pos + 1) >= game.length){
            return true;
        }
        game[pos] = 1;
        return canWin(leap, game, pos + leap) ||
                canWin(leap, game, pos + 1) ||
                canWin(leap, game, pos - 1);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while(q-- > 0){
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for(int i = 0; i < n; i++){
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
        }
        scan.close();
    }
}
