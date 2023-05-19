package ex21_30.ex26;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();

        ArrayList<String> strings = new ArrayList<>();
        for(int i = 0; i < n; i++){
            strings.add(s[i]);
        }

        strings.sort((s1, s2) -> {
            BigDecimal n1 = new BigDecimal(s1);
            BigDecimal n2 = new BigDecimal(s2);

            if(n1.compareTo(n2) == 1){
                return -1;
            }
            if(n1.compareTo(n2) == -1){
                return 1;
            }
            return 0;
        });

        for(int i = 0; i < n; i++){
            s[i] = strings.get(i);
        }

        //Output
        for(int i = 0; i < n; i++){
            System.out.println(s[i]);
        }
    }
}
