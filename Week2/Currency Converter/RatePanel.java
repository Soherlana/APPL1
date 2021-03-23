/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrencyConverter;

// ******************************************************************
// RatePanel.java
//
// Panel for a program that converts different currencies to
// U.S. Dollars
// ******************************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RatePanel extends JPanel
{  
    private double[] rate; // exchange rates
    private String[] currencyName;
    private JLabel result;
    private JComboBox comboBox;
    private JTextField fieldValue;
    private JLabel label;
    private JButton calculate;  
    // ------------------------------------------------------------
    // Sets up a panel to convert cost from one of 6 currencies
    // into U.S. Dollars. The panel contains a heading, a text
    // field for the cost of the item, a combo box for selecting
    // the currency, and a label to display the result.
    // ------------------------------------------------------------
    public RatePanel ()
    {
        JLabel title = new JLabel ("How much is that in dollars?");
        title.setAlignmentX (Component.CENTER_ALIGNMENT);
        title.setFont (new Font ("Helvetica", Font.BOLD, 20));
        
        // Set up the arrays for the currency conversions
        currencyName = new String[] {"Select the currency..",
        "European Euro", "Canadian Dollar",
        "Japanese Yen", "Australian Dollar",
        "Indian Rupee", "Mexican Peso"};
        rate = new double [] {0.0, 1.2103, 0.7351, 0.0091,
            0.6969, 0.0222, 0.0880};
        result = new JLabel (" ------------ ");
        
        //Add combo box
        comboBox = new JComboBox(currencyName);
        //Add text field 
        fieldValue = new JTextField(); 
        //Add calculate button 
        calculate = new JButton("Calculate");     
        //Add Label
        label = new JLabel("Insert Value : ");
        
        //Set size and coordinate of the component
        title.setBounds(70, 5, 350, 20);
        comboBox.setBounds(90, 40, 200, 25);
        label.setBounds(80, 80, 200, 30);
        fieldValue.setBounds(170, 80, 150, 30);
        calculate.setBounds(110, 120, 150, 30);
        result.setBounds(90, 160, 300, 35);
        
        //Add component to the panel
        add(title);
        add(comboBox);
        add(label);
        add(fieldValue);
        add(calculate);
        add(result);
        
        //Add listeners to the calculate buttons
        calculate.addActionListener(new ComboListener());
    }
    // ******************************************************
    // Represents an action listener for the combo box.
    // ******************************************************
    private class ComboListener implements ActionListener
    {
        // --------------------------------------------------
        // Determines which currency has been selected and
        // the value in that currency then computes and
        // displays the value in U.S. Dollars.
        // --------------------------------------------------
        public void actionPerformed (ActionEvent event)
        {
            // Get value from text field
            int textFieldValue = Integer.parseInt(fieldValue.getText());
            //Set result when the Calculate button is pressed
            result.setText (fieldValue.getText()+" " 
                    + currencyName[comboBox.getSelectedIndex()] 
                    + " = " + rate[comboBox.getSelectedIndex()]*textFieldValue 
                    + " U.S. Dollars");
        }
    }
}