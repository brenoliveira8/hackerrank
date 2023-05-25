package javaExercises.ex31_40.ex34_unsolved;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution{
    public static boolean canWin(int leap, int[] game){
        boolean defeatedWalkingFirst = false;
        boolean won = false;
        int n = game.length;
        int position = 0;
        int previousPosition = 0;
        int maxPosition = 0;
        while(!defeatedWalkingFirst && !won){
            if(position + 1 < n){
                if(game[position] == 0){
                    if(game[position + 1] == 0){
                        if(position + 1 != previousPosition){
                            previousPosition = position;
                            position++;
                        }else{
                            if(position + leap < n){
                                if(game[position + leap] == 0){
                                    previousPosition = position;
                                    position = position + leap;
                                }else{
                                    if(position - 1 < 0){
                                        defeatedWalkingFirst = true;
                                    }else{
                                        if(game[position - 1] == 0){
                                            if(position - 1 != previousPosition){
                                                previousPosition = position;
                                                position--;
                                            }else{
                                                if(position - 2 > 0){
                                                    if(game[position - 2] == 0){
                                                        previousPosition = position;
                                                        position = position - 2;
                                                    }else{
                                                        defeatedWalkingFirst = true;
                                                    }
                                                }else{
                                                    defeatedWalkingFirst = true;
                                                }
                                            }
                                        }else{
                                            defeatedWalkingFirst = true;
                                        }

                                    }
                                }
                            }else{
                                won = true;
                            }
                        }
                    }else{
                        if(position + leap < n){
                            if(game[position + leap] == 0){
                                previousPosition = position;
                                position = position + leap;
                            }else{
                                if(position - 1 < 0){
                                    defeatedWalkingFirst = true;
                                }else{
                                    if(game[position - 1] == 0){
                                        if(position - 1 != previousPosition){
                                            previousPosition = position;
                                            position--;
                                        }else{
                                            if(position - 2 > 0){
                                                if(game[position - 2] == 0){
                                                    previousPosition = position;
                                                    position = position - 2;
                                                }else{
                                                    defeatedWalkingFirst = true;
                                                }
                                            }else{
                                                defeatedWalkingFirst = true;
                                            }
                                        }
                                    }else{
                                        defeatedWalkingFirst = true;
                                    }
                                }
                            }
                        }else{
                            won = true;
                        }
                    }
                }else{
                    won = true;
                }
            }else{
                won = true;
            }
            if(position == maxPosition){
                defeatedWalkingFirst = true;
            }
            if(maxPosition < position){
                maxPosition = position;
            }
        }

        previousPosition = 0;
        position = 0;
        maxPosition = 0;
        boolean defeatedJumpingFirst = false;
        while(!defeatedJumpingFirst && !won){
            if(position + leap < n){
                if(game[position] == 0){
                    if(game[position + leap] == 0){
                        previousPosition = position;
                        position = position + leap;
                    }else{
                        if(game[position + 1] == 0){
                            if(position + 1 != previousPosition){
                                previousPosition = position;
                                position++;
                            }else{
                                if(position - 1 < 0){
                                    defeatedJumpingFirst = true;
                                }else{
                                    if(game[position - 1] == 0){
                                        if(position - 1 != previousPosition){
                                            previousPosition = position;
                                            position--;
                                        }else{
                                            if(position - 2 > 0){
                                                if(game[position - 2] == 0){
                                                    previousPosition = position;
                                                    position = position - 2;
                                                }else{
                                                    defeatedJumpingFirst = true;
                                                }
                                            }else{
                                                defeatedJumpingFirst = true;
                                            }
                                        }
                                    }else{
                                        defeatedJumpingFirst = true;
                                    }
                                }
                            }
                        }else{
                            if(position - 1 < 0){
                                defeatedJumpingFirst = true;
                            }else{
                                if(game[position - 1] == 0){
                                    if(position - 1 != previousPosition){
                                        previousPosition = position;
                                        position--;
                                    }else{
                                        if(position - 2 > 0){
                                            if(game[position - 2] == 0){
                                                previousPosition = position;
                                                position = position - 2;
                                            }else{
                                                defeatedJumpingFirst = true;
                                            }
                                        }else{
                                            defeatedJumpingFirst = true;
                                        }
                                    }
                                }else{
                                    defeatedJumpingFirst = true;
                                }
                            }
                        }
                    }
                }else{
                    defeatedJumpingFirst = true;
                }
            }else{
                won = true;
            }
            if(position == maxPosition){
                defeatedJumpingFirst = true;
            }
            if(maxPosition < position){
                maxPosition = position;
            }
            System.out.println("posicao " + position + " antes " + previousPosition);
        }
        if(won){
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        PrintStream out = new PrintStream("output.txt");
        int q = scan.nextInt();
        int count = 1;
        while(q-- > 0){
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for(int i = 0; i < n; i++){
                game[i] = scan.nextInt();
            }
//            System.out.println(count++);
            System.out.println((canWin(leap, game)) ? "YES" : "NO");
            out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        out.close();
        scan.close();
    }
}
