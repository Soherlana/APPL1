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
public class Cylinder extends Shape {
    private double radius; 
    private int height;
    //----------------------------------
    // Constructor: Sets up the sphere.
    //----------------------------------
    public Cylinder(double r, int h)
    {
        super("Cylinder");
        radius = r;
        height = h;
    }
    //-----------------------------------------
    // Returns the surface area of the sphere.
    //-----------------------------------------
    public double area()
    {
        return Math.PI*radius*radius*height;
    }
    //-----------------------------------
    // Returns the sphere as a String.
    //-----------------------------------
    public String toString()
    {
        return super.toString()+" of radius "+radius+" and height "+height;
    }
}
