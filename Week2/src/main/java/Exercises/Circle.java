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
public class Circle implements Shape 
{
    private final float PI = 3.1415926535897f;
    private float radius = 1;
    
    public float getArea()
    {
        return PI * radius * radius;
    }
    
    public float getPerimeter()
    {
        return 2 * PI * radius;
    }
}
