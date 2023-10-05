/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numberguessinggame;

import java.util.Scanner;

public class NumberGuessingGame {
    static int takeUserInput(){
        int user;
        System.out.println("Enter ");
        Scanner sc= new Scanner(System.in);
        user=sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j){
        if(i==j){
            System.out.println("Correct NO. Guess");
        }
        else if(i>j){
            System.out.println("Your No. is Big than computer No.");
        }
        else {
            System.out.println("Your No. is Small than computer No.");
        }
    }
    public static void main(String[] args) {
        int user=0,computer=0,itteration=0;
        Game g = new Game();
        do {
            user = takeUserInput();
            computer = g.computerNo();
//            System.out.println(user);
//            System.out.println(computer);
            isCorrectNumber(user, computer);
            itteration++;
        }while (user!=computer);
        System.out.println("YOU GUESS NO IN "+ itteration+" ITTERATIONS");

  
    }
}