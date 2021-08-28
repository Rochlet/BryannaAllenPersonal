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
public class Rectangle implements Shape 
{
    private float side1 = 1;
    private float side2 = 1;
    
    public float getArea()
    {
        return side1 * side2;
    }
    
    public float getPerimeter()
    {
        return (2 * side1) + (2 * side2);
    }
}
