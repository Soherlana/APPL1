/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CopyingFile;

// ****************************************************************************  
// CopyingFile.java  
//  
// Copy file and writes it to new file
// ****************************************************************************  
import java.util.Scanner;  
import java.io.*;  
public class CopyingFile  
{  
 
    public static void main (String[] args)  
    {  
        String inputName = "students.dat";  
        String outputName = "resultCopy.dat";
        String line;
                
        Scanner scan;
        PrintWriter outFile;
        try  
        {  
          // Set up scanner to input file  
          scan = new Scanner(new FileInputStream(inputName));
          // Set up the output file stream  
          outFile = new PrintWriter(new FileWriter(outputName));  
            
          // Process the copy paste file, one line at a time    
            while (scan.hasNextLine())  
            {   
                line = scan.nextLine();
                outFile.println(line);
                line = null;                
            }  
            // Close output file
            outFile.close();
            System.out.println("File "+outputName+" has been created successfully");
        }  
        catch (FileNotFoundException exception)  
        {  
            System.out.println ("The file " + inputName + " was not found.");   
        }  
        catch (IOException exception)  
        {  
            System.out.println (exception);  
        } 
    }  
}