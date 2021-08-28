/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

import Exercises.StateCapitals3.Capital;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author 88bry
 */
public class StateCapitalsApp 
{
    public static void main(String[] args) throws Exception
    {
        Scanner fileScanner = new Scanner(new BufferedReader(new FileReader("MoreStateCapitals.txt")));
        HashMap<String, Capital> stateCapital = new HashMap<>();

        while (fileScanner.hasNextLine())
        {
            String currentLine = fileScanner.nextLine();
            String[] parts = currentLine.split("::");
            stateCapital.put(parts[0], new Capital(parts[1]), Integer.parseInt(parts[2]), Double.parseDouble(parts[3]));
        }

        for (String key: stateCapital.keySet()) 
        {
            String name = stateCapital.get(key).getName();
            int population = stateCapital.get(key).getPopulation();
            double squareMileage = stateCapital.get(key).getSquareMileage();
            System.out.println(key + " - " + name + " | Pop:" + population + " | Area:" + squareMileage + " sq mi");
        }
        findStatesWithMinPopOver(stateCapital);
    }

    public static void findStatesWithMinPopOver(HashMap<String, Capital> stateCapital)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a population number");
        int popLimit = Integer.parseInt(sc.nextLine());
        for (String key: stateCapital.keySet()) 
        {
            String name = stateCapital.get(key).getName();
            int population = stateCapital.get(key).getPopulation();
            if (population > popLimit) 
            {
                System.out.println(key + " - " + name + " | Pop:" + population);
            }
        }
    }
}