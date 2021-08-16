/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

import java.util.Scanner;

/**
 *
 * @author 88bry
 */
public class SimpleCalculatorApp 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int userNum = 0, exit = 0;
        
        do
        {
            System.out.println("What would you lie to do?");
            System.out.println();
            System.out.println("1- add");
            System.out.println("2- subtract");
            System.out.println("3- multiply");
            System.out.println("4- divide");
            System.out.println("5- exit");
        
            userNum = Integer.parseInt(input.nextLine());
        
            switch (userNum)
            {
                case 1:
                    System.out.println("What numbers would you like to add?");
                    double op1 = Double.parseDouble(input.nextLine());
                    double op2 = Double.parseDouble(input.nextLine());
                    double ans = SimpleCalculator.add(op1, op2);
                    System.out.println("The answer is: " + ans);
                    break;
                case 2:
                    System.out.println("What numbers would you like to subtract?");
                    op1 = Double.parseDouble(input.nextLine());
                    op2 = Double.parseDouble(input.nextLine());
                    ans = SimpleCalculator.subtract(op1, op2);
                    System.out.println("The answer is: " + ans);
                    break;
                case 3:
                    System.out.println("What numbers would you like to multiply?");
                    op1 = Double.parseDouble(input.nextLine());
                    op2 = Double.parseDouble(input.nextLine());
                    ans = SimpleCalculator.multiply(op1, op2);
                    System.out.println("The answer is: " + ans);
                    break;
                case 4:
                    System.out.println("What numbers would you like to divide?");
                    op1 = Double.parseDouble(input.nextLine());
                    op2 = Double.parseDouble(input.nextLine());
                    ans = SimpleCalculator.divide(op1, op2);
                    System.out.println("The answer is: " + ans);
                    break;
                case 5:
                    exit++;
                    break;
                default:
                    System.out.println("That's an invalid input. Please try again.");
            }
        }
        while (exit == 0);
        
        System.out.println("Thanks for using The Simple Calculator.");
    }
}
