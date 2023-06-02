package javaExercises.ex41_50.ex46;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

class Solution{

    public static void main(String[] argh){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String input = sc.next();
            //Complete the code
            var length = input.length();
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < length; i++){
                stack.push(input.charAt(i));
            }
            System.out.println(isBalanced(stack, new Stack<>()));
        }

    }

    private static boolean isBalanced(Stack<Character> principalStack, Stack<Character> openingStack){
        try{
            if(isOpeningCharacter(principalStack.lastElement())){
                if(!canClose(principalStack, openingStack)){
                    return false;
                }
                principalStack.pop();
                openingStack.pop();
            }else{
                openingStack.push(principalStack.pop());
            }
        }catch(NoSuchElementException e){
            return false;
        }

        return (principalStack.empty() && openingStack.empty()) || isBalanced(principalStack, openingStack);
    }

    private static boolean isOpeningCharacter(Character lastCharacter){
        if(lastCharacter.equals('(') || lastCharacter.equals('[') || lastCharacter.equals('{')){
            return true;
        }
        return false;
    }

    private static boolean canClose(Stack<Character> principalStack, Stack<Character> openingStack){
        var lastCharacter = principalStack.lastElement();

        if(lastCharacter.equals('(') && openingStack.lastElement().equals(')')){
            return true;
        }else if(lastCharacter.equals('[') && openingStack.lastElement().equals(']')){
            return true;
        }else if(lastCharacter.equals('{') && openingStack.lastElement().equals('}')){
            return true;
        }
        return false;
    }
}
