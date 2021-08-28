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
public class UserIOImpl implements UserIO 
{
    private Scanner input = new Scanner(System.in);
    
    @Override
    public void print(String message)
    {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt)
    {
        System.out.println(prompt);
        String value = input.nextLine();
        return value;
    }

    @Override
    public int readInt(String prompt)
    {
        System.out.println(prompt);
        int value = Integer.parseInt(input.nextLine());
        return value;
    }

    @Override
    public int readInt(String prompt, int min, int max)
    {
        int value = 0;
        do
        {
            System.out.println(prompt);
            value = Integer.parseInt(input.nextLine());
        } while ((value < min)||(value > max));
        return value;
    }

    @Override
    public double readDouble(String prompt)
    {
        System.out.println(prompt);
        double value = Double.parseDouble(input.nextLine());
        return value;
    }

    @Override
    public double readDouble(String prompt, double min, double max)
    {
        double value = 0;
        do
        {
            System.out.println(prompt);
            value = Double.parseDouble(input.nextLine());
        } while ((value < min)||(value > max));
        return value;
    }

    @Override
    public float readFloat(String prompt)
    {
        System.out.println(prompt);
        float value = Float.parseFloat(input.nextLine());
        return value;
    }

    @Override
    public float readFloat(String prompt, float min, float max)
    {
        float value = 0;
        do
        {
            System.out.println(prompt);
            value = Float.parseFloat(input.nextLine());
        } while ((value < min)||(value > max));
        return value;
    }

    @Override
    public long readLong(String prompt)
    {
        System.out.println(prompt);
        long value = Long.parseLong(input.nextLine());
        return value;
    }

    @Override
    public long readLong(String prompt, long min, long max)
    {
        long value = 0;
        do
        {
            System.out.println(prompt);
            value = Long.parseLong(input.nextLine());
        } while ((value < min)||(value > max));
        return value;
    }
}
