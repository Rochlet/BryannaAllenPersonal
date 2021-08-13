/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

import java.util.Scanner;

/**
 *
 * @author 88bry
 */
public class HealthyHearts 
{
    public static void main(String[] args)
    {
        //declare
        Scanner input = new Scanner(System.in);
        double age, max, targetMax, targetMin;
    
        System.out.println("What is your age?");
        age = Integer.parseInt(input.nextLine());
        max = 220 - age;
        targetMin = max / 2;
        targetMax = max * 0.85;
        System.out.println("You maxium hear rate should be " + max + " beats per minute.");
        System.out.println("Your target HR zone is " + targetMin + " - " + targetMax + " beats per minute.");
    }
}
