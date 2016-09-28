/*
 * Heather Taylor
 * CIS 2212 Tuesdays Fall 2016
 * Lab 02 - Company Payroll
 * Due September 6, 2016
 */

// Mock situation: You've been hired to write a payroll program for a local company.

package coPay;

import java.util.Scanner; 
import java.text.NumberFormat;

public class CompanyPayroll {

	public static void main(String[] args) {
		
		// declare variables
		String name; // first and last name
		double hours; // number of hours worked
		double payRate; // rate of pay
		double fedTaxWHrate; // federal withholding rate
		double stateTaxWHrate; // state withholding rate
		double grossPay; // pay before deductions
		double fedTaxWH; // federal withholding amount
		double stateTaxWH; // state withholding amount
		double totalDeduction; // total amount deducted
		double netPay; // pay after deductions
		
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Set up currency object
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		// Prompt user to enter their name
		System.out.print("Enter employee's name: ");
		name = input.nextLine();
		
		// Prompt user to enter their hours
		System.out.print("Enter number of hours worked in a week: ");
		hours = input.nextDouble();
		
		// Prompt user to enter their pay rate
		System.out.print("Enter hourly pay rate: ");
		payRate = input.nextDouble();
		
		// Prompt user to enter their federal tax withholding rate
		System.out.print("Enter federal tax withholding rate: ");
		fedTaxWHrate = input.nextDouble();
		
		// Prompt user to enter their state tax withholding rate
		System.out.print("Enter state tax withholding rate: ");
		stateTaxWHrate = input.nextDouble();
		
		// Display payroll header, employee name, hours worked & pay rate
		System.out.println("\nCompany Payroll");
		System.out.println("------------------------------");
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: " + currency.format(payRate));
		
		// Call methods and display payroll results
		grossPay = calcGross (hours, payRate); // gross pay
		System.out.println("Gross Pay: " + currency.format(grossPay));
		
		System.out.println("Deductions:");
		
		fedTaxWH = calcFedWH (grossPay, fedTaxWHrate); // federal tax
		System.out.printf("\tFederal Withholding (%4.2f",(fedTaxWHrate * 100));
		System.out.print("%): " + currency.format(fedTaxWH));
		
		stateTaxWH = calcStateWH (grossPay, stateTaxWHrate); // state tax
		System.out.printf("\n\tState Withholding (%4.2f",(stateTaxWHrate * 100));
		System.out.print("%): " + currency.format(stateTaxWH));
		
		totalDeduction = calcTotalDeduct (fedTaxWH, stateTaxWH); // total deductions
		System.out.println("\n\tTotal Deduction: " + currency.format(totalDeduction));
		
		netPay = calcNet (grossPay, totalDeduction); // net pay
		System.out.println("Net Pay: " + currency.format(netPay));
		
		input.close(); // close the scanner
		
	} // end main
	
	// Define 5 methods to calculate payroll ---------------------------	
	
	// Method to calculate and return gross pay
	public static double calcGross (double hrs, double pyRate){
		double result; // declare variable to hold answer
		result = hrs*pyRate;
		return result;
	} // end calcGross
	
	// Method to calculate federal withholding amount
	public static double calcFedWH (double gross, double fedWHrate){
		double result;
		result = gross * fedWHrate;
		return result;
	} // end calcFedWH
	
	// Method to calculate state withholding amount
	public static double calcStateWH (double gross, double stateWHrate){
		double result;
		result = gross * stateWHrate;
		return result;
	} // end calcStateWH
	
	// Method to calculate total payroll deductions
	public static double calcTotalDeduct (double fedWH, double stateWH){
		double result;
		result = fedWH + stateWH;
		return result;
	} // end calcTotalDeduct
	
	// Method to calculate net pay
	public static double calcNet (double gross, double totalDed){
		double result;
		result = gross - totalDed;
		return result;
	} // end calcNet

} // end CompanyPayroll class
