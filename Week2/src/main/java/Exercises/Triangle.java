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
public class Triangle implements Shape 
{
    private float height = 1;
    private float base = 1;
    private float side1 = 1;
    private float side2 = 1;
    private float side3 = 1;
    
    public float getArea()
    {
        return (height * base) / 2;
    }
    
    public float getPerimeter()
    {
        return side1 + side2 + side3;
    }
}
