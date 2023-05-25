package javaExercises.ex31_40.ex35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> integerList = new ArrayList<>(n);

        for(int i = 0; i < n; i++){
            integerList.add(scanner.nextInt());
        }

        int q = scanner.nextInt();

        for(int i = 0; i < q; i++){
            String query = scanner.next();
            if(query.equals("Insert")){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                integerList.add(x, y);
            }
            if(query.equals("Delete")){
                int x = scanner.nextInt();
                integerList.remove(x);
            }
        }

        integerList.forEach(i -> System.out.print(i + " "));
    }
}
