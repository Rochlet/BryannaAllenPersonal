/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

/**
 *
 * @author 88bry
 */
public class Square implements Shape 
{
    private float side = 1;
    
    public float getArea()
    {
        return side * side;
    }
    
    public float getPerimeter()
    {
        return side * 4;
    }
}
