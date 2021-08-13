/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 88bry
 */
public class RockPaperScissors
{
    public static void main(String [] args)
    {
        int rounds = 0, win, tie, lose, end = 0;
        int[] score = new int[3]; 
        String playerInput, playAgain;
        Scanner input = new Scanner(System.in);
            
        do
        {
            do
            {
                System.out.println("How many rounds would you like to play?");
                playerInput = input.nextLine();
                try
                {
                    rounds = Integer.parseInt(playerInput);
                }
                catch(NumberFormatException e)
                {
                    System.out.print("Invalid input. Please try again");
                }
            
                if ((rounds <= 0)||(rounds >= 11))
                {
                    System.out.println("Invalid input. Please try again.");
                }
            }
            while (rounds == 0);
            
            score = playGame(rounds);
            win = score[0];
            tie = score[1];
            lose = score[2];
        
            System.out.println("You won " + win + " times.");
            System.out.println("You tied " + tie + " times.");
            System.out.println("The computer won " + lose + " times.");
        
            System.out.println("Would you like to play again? Yes or No?");
            playAgain = input.nextLine();
            playAgain = playAgain.toLowerCase();
            if (playAgain.equals("no"))
            {
               end++; 
            }
        }
        while (end == 0);
    }
    
    public static int[] playGame(int rounds)
    {
        int win = 0, tie = 0, lose = 0;
        int[] score = new int[3];
        String playerChoice, comChoice = "";
        int plyrNum = 0, comNum;
            
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        
        for (int i = 0; i < rounds; i++) // play the game for some many rounds
        {
            comNum = ran.nextInt(3) + 1;
            
            System.out.println("Rock, Paper, or Scissors?");
            playerChoice = input.nextLine();
            playerChoice = playerChoice.toLowerCase();
            
            switch (playerChoice) // convert string into number
            {
                case "rock":
                    plyrNum = 1;
                    break;
                case "paper":
                    plyrNum = 2;
                    break;
                case "scissors":
                    plyrNum = 3;
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
            
            switch (comNum) // convert number into string
            {
                case 1:
                    comChoice = "rock";
                    break;
                case 2:
                    comChoice = "paper";
                    break;
                case 3:
                    comChoice = "scissors";
                    break;
            }
            
            if (plyrNum == comNum) // if the computer and player got the same thing
            {
                tie++;
                System.out.println("The computer played " + comChoice + " too.");
                System.out.println("You've tied.");
            }
            else if (((plyrNum == 1)&&(comNum == 3))||((plyrNum == 3)&&(comNum == 1))) // if someone played rock and scissors (the two end points)
            {
                if (plyrNum > comNum) // com's rock crushes player's scissors
                {
                    lose++;
                    System.out.println("The computer played " + comChoice + ".");
                    System.out.println("You've lost.");
                }
                else // the other way around
                {
                    win++;
                    System.out.println("The computer played " + comChoice + ".");
                    System.out.println("You've won.");
                }
            }
            else if (plyrNum > comNum) // otherwise the bigger number is the winner
            {
                win++;
                System.out.println("The computer played " + comChoice + ".");
                System.out.println("You've won.");
            }
            else // otherwise the player loses
            {
                lose++;
                System.out.println("The computer played " + comChoice + ".");
                System.out.println("You've lost.");
            }
        }
        
        score[0] = win;
        score[1] = tie;
        score[2] = lose;
        
        return score;
    }
}