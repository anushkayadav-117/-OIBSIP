/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numberguessinggame;

import java.util.Random;

/**
 *
 * @author ANUSHKA
 */
class Game{
    int computer;
    public Game(){
        Random rand = new Random();
        computer = rand.nextInt(100);
        System.out.println("Guess the Number Form  1 to 100");
    }
    public int computerNo(){
        return computer;
    }
}
