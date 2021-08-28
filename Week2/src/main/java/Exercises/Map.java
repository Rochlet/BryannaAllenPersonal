/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author 88bry
 */
public class Map 
{
    public static void main(String [] args)
    {
        HashMap<String, String> livedIn = new HashMap<>();
        
        livedIn.put("Alaska", "Ketchican");
        livedIn.put("Arizona", "Prescott Valley");
        livedIn.put("Oklahoma", "Bugtussle");
        livedIn.put("Washington", "Renton");
        livedIn.put("Texas", "Fort Worth");
        
        Set<String> keys = livedIn.keySet();
        for (String k : keys)
        {
            System.out.println("I've lived in " + livedIn.get(k) + ", " + k);
        }
        System.out.println("Just to name a few");
    }
}
