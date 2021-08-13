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
public class DogGenetics 
{
    public static void main(String[] args)
    {
        //declare
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        
        String dogName;
        int percent1 = 0, percent2 = 0, percent3 = 0, percent4 = 0, percent5 = 0;
        
        percent1 = ran.nextInt(99) + 1;
        percent2 = ran.nextInt(99 - percent1) + 1;
        percent3 = ran.nextInt(99 - percent1 - percent2) + 1;
        percent4 = ran.nextInt(99 - percent1 - percent2 - percent3)+ 1;
        percent5 = ran.nextInt(99 - percent1 - percent2 - percent3 - percent4)+ 1;
        
        System.out.println("What is your dog's name?");
        dogName = input.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s\nprestigious background right here.");
        System.out.println(dogName + " is:");
        System.out.println();
        System.out.println(percent1 + "% St. Bernard");
        System.out.println(percent2 + "% Chihuahua");
        System.out.println(percent3 + "% Dramatic RedNosed Asian Pug");
        System.out.println(percent4 + "% Common Cur");
        System.out.println(percent5 + "% King Doberman");
        System.out.println();
        System.out.println("Wow, that's QUITE the dog!");
    }
}
