/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

/**
 *
 * @author 88bry
 */
public class SummativeSums 
{
    public static void main(String[] args)
    {
        //declare
        int[] array1 = new int[9];
        int[] array2 = new int[6];
        int[] array3 = new int[21];
        int total1 = 0, total2 = 0, total3 = 0;
        
        //initialize array1
        array1[0] = 1;
        array1[1] = 90;
        array1[2] = -33;
        array1[3] = -55;
        array1[4] = 67;
        array1[5] = -16;
        array1[6] = 28;
        array1[7] = -55;
        array1[8] = 15;
        
        //initialize array2
        array2[0] = 999;
        array2[1] = -60;
        array2[2] = -77;
        array2[3] = 14;
        array2[4] = 160;
        array2[5] = 301;
        
        //initialize array3
        for (int i = 1; i < 21; i++)
        {
            array3[i-1] = i * 10;
        }
        array3[20] = -99;
        
        //sum of array elements
        for (int i = 0; i <= 8; i++)
        {
            total1 = total1 + array1[i];
        }
        
        for (int i = 0; i <= 5; i++)
        {
            total2 = total2 + array2[i];
        }

        for (int i = 0; i <= 20; i++)
        {
            total3 = total3 + array3[i];
        }
        
        //print sums
        System.out.println("#1 Array Sum: " + total1);
        System.out.println("#2 Array Sum: " + total2);
        System.out.println("#3 Array Sum: " + total3);
    }
}
