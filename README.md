# Java-Lab2

<p>Homework assignment: You’ve been hired to write a payroll program for a local company.</p> 

<p>You will declare the following variables:</p>
  <ul>
    <li>name: String to hold the first and last name of the employee</li>
    <li>hours: double to hold the number of hours worked this week by the employee</li>
    <li>payRate: double to hold the rate of pay for the employee</li>
    <li>fedTaxWHrate: double to hold the federal withholding rate</li>
    <li>stateTaxWHrate: double to hold the state withholding rate</li>
    <li>grossPay: double to hold the gross wages for this week for the employee</li>
    <li>fedTaxWH: double to hold the federal withholding amount to be deducted</li>
    <li>stateTaxWH: double to hold the state withholding amount to be deducted</li>
    <li>totalDeduction: double to hold the total amount to be deducted</li>
    <li>netPay: double to hold the net pay of the employee</li>
   </ul>

<p>Create a program that prompts the user for name, hours, payRate, fedTaxWHrate, stateTaxWHrate.</p>
<p>Define 5 methods using the following method headers (exactly) &amp; formulas:</p>
  <ul>
    <li>public static double calcGross(double hrs, double pyRate) – hours * pay rate</li> 
    <li>public static double calcFedWH (double gross, double fedWHrate) – gross pay * federal withholding rate</li>
    <li>public static double calcStateWH(double gross, double stateWHrate) – gross pay *state withholding rate</li>
    <li>public static double calcTotalDeduct(double fedWH, double stateWH) – amount of federal withholding + amount of state withholding</li>
    <li>public static double calcNet(double gross, double totalDed) – gross pay - total deductions</li>
  </ul>
<p>Required: Format the following variables to currency: payRate, grossPay, fedTaxWH, stateTaxWH, totalDeduction, netPay.</p>

<p>Optional: format the following variables to 2 decimal places: fedTaxWHrate, stateTaxWHrate</p> 

