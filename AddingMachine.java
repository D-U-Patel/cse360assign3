/**
 * Author: Dhruval Patel
 * class: CSE360
 * Assignment number: Assignment 3
 * Description: 
 * Performs basic add and subtract calculations and maintains calculation 
 * history accessible through a toString method. 
 * This is a updated class AddingMachine from assignment 2, 
 * the instance variable are changed to have protected visibility.  
 */

package cse360assign3;

import java.lang.String;

public class AddingMachine {

	protected int total;
	protected String history = "0";

	/**
	 * @description: This is AddingMachine method which for clarity purpose.
	 */
	public AddingMachine() {
		total = 0; // not needed - included for clarity
	}

	/**
	 * 
	 * @return {int}
	 * @description: Gets the total.
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * 
	 * @description: This method is add the parameter to the total variable.
	 */
	public void add(int value) {

		total = total + value;
		history = history + " + " + value;

	}

	/**
	 * 
	 * @param value {int}
	 * @description: This method is subtract the parameter from the total variable.
	 */
	public void subtract(int value) {

		total = total - value;
		history = history + " - " + value;

	}

	/**
	 * @param value {int}
	 * @description: Return operations in string.
	 */
	public String toString() {
		return history;
	}

	/**
	 * 
	 * @description: Clear all operations happened.
	 */
	public void clear() {
		total = 0;
		history = "0";

	}
}
