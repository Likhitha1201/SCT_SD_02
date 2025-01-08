/*** 
    @Author: Likhitha S
    @Date: 05-01-2025 17:30
    @Last Modified by: Likhitha S
    @Last Modified time: 06-01-2025 12:30
    @Title: Build a program that generates a random number and challenges the user to guess it. The program should prompt the user input thir guess, compare it to the generated number.
           
*/

import java.util.Scanner;
import java.util.Random;

class RandomNumber{

    /***
            Description: 
                This methods are used to generate the random number and check the user entered number are same are not.
            Parameters: 
                used parameters are random number which automatically generated and used guessed number.
            return:
                It checks numbers accordingly and prints the statement.
     */

        static int generation(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("please guess the generated number:");
            int userInput = scanner.nextInt();
            scanner.close();
            return userInput;
        }

        static void check(int random, int userInput){
            if (random == userInput){
                System.out.println("Congratulations.. your guess is correct...!!!");
            }
            else{
                System.out.println("Sorry.. betterluck next time..!!!");
            }
        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many random numbers has to be generated:");
        int num= sc.nextInt();
        
        int usr_input = generation();

        Random rand = new Random();
        int random=rand.nextInt(10000);
        for(int i=1; i<=num; i++){
            System.out.println(random);
            random = random*2+1;
        }
        
        check(random, usr_input);
        sc.close();
    }
}