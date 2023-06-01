package javaExercises.ex41_50.ex43;

import java.util.BitSet;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer m = scanner.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for(int i = 0; i < m; i++){
            String op = scanner.next();
            Integer n1 = scanner.nextInt();
            Integer n2 = scanner.nextInt();
            if(op.equals("AND")){
                if(n1 == 1){
                    b1.and(b2);
                }else{
                    b2.and(b1);
                }
            }else if(op.equals("OR")){
                if(n1 == 1){
                    b1.or(b2);
                }else{
                    b2.or(b1);
                }
            }else if(op.equals("XOR")){
                if(n1 == 1){
                    b1.xor(b2);
                }else{
                    b2.xor(b1);
                }
            }else if(op.equals("FLIP")){
                if(n1 == 1){
                    b1.flip(n2);
                }else{
                    b2.flip(n2);
                }
            }else if(op.equals("SET")){
                if(n1 == 1){
                    b1.set(n2);
                }else{
                    b2.set(n2);
                }
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}
