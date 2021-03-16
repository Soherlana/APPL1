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
public abstract class Shape
{
    protected String shapeName;

    public Shape (String theShapeName)
    {
        shapeName = theShapeName;
    }

    abstract double area();

    public String toString()
    {
        return shapeName;
    }
}
