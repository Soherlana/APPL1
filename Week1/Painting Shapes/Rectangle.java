/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;

/**
 *
 * @author lenovo
 */
public class Rectangle extends Shape {
    private int panjang;
    private int lebar;
    //----------------------------------
    // Constructor: Sets up the rectangle.
    //----------------------------------
    public Rectangle(int p, int l)
    {
        super("Rectangle");
        panjang  = p;
        lebar = l;
    }
    //-----------------------------------------
    // Returns the surface area of the rectangle.
    //-----------------------------------------
    public double area()
    {
        return panjang * lebar;
    }
    //-----------------------------------
    // Returns the rectangle as a String.
    //-----------------------------------
    public String toString()
    {
        return super.toString()+" of length "+panjang+" and width "+lebar;
    }
}
