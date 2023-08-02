import java.util.*;
/**
 * THIS PROGRAM TAKES AN INPUT NUMBER AND CHECKS WHETHER YOU HAVE GUSSED
 * IT RIGHT OR NOT
 */

class guess{
    public static void main(String[] args) {
        Random n = new Random();
        Scanner sc = new Scanner(System.in);
        
        
        
        for(int i=10;i>=0;i--){
        int rand_num = n.nextInt(100);
        System.out.print("Guess a number between 1 and 100: ");
        int a = sc.nextInt();
        if(a!=rand_num){
            System.out.println("Sorry, your guess was incorrect");
            System.out.println("The number was "+rand_num);
            continue;
        }
            
        while (a==rand_num) {
            System.out.println("Congrats!!! You guessed it right");
            break;
        }
    
        System.out.println("Game Ended");
        }
    }
    }

