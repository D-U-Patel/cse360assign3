package cse360assign3;
/**
 * Author: Dhruval Patel
 * class: CSE360
 * Assignment number: Assignment 3
 * Description:
 * This class Inherits from AddingMachine to add multiplication, division, and power 
 * functionality.  
 
 */

public class Calculator extends AddingMachine {
	
	
	/**
	 * @description: Constructor for the Calculator class. 
	 */
	public Calculator() {
		super();              // Super is called to set total and history to default. 
	}
	
	
	/**
	 * @description: Method that will multiply current rolling value by the parameter 
	 * 'value'.
	 * @param value {int}
	 */
	public void multiply(int value) {
		total *= value;
		history += " * " + value;
	}
	
	
	/**
	 * @description: Method that divides current rolling value by parameter 'value'.
	 * If division by zero is attempted, the total rolling value will be set
	 * equal to zero, but the calculation history will remain. 
	 * 
	 * @param value	{int}
	 */
	public void divide(int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total /= value;
		}
		history += " / " + value;
	}
	
	
	/**
	 * Method that raises current rolling value by parameter 'value'. 
	 * 
	 * If 'value' is a negative number, the total rolling value will be set to 
	 * zero, but the calculation history will remain. 
	 * @param value {int}
	 */
	public void power(int value) {
		if (value < 0) {
			total = 0;
		}
		else {
			total ^= value;
		}
		history += " ^ " + value;
	}
}		