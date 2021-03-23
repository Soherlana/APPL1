/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThrowingException;

// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
// factorial method can throw an IllegalArgumentException.
// ****************************************************************
public class MathUtils
{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException
    {             
        int fac = 1;
        for (int i=n; i>0; i--)
            fac *= i;
        return fac;
    }
}