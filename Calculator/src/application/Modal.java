/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below java code perform the operation with various operands.
 *   Project:  calculate.
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2022-02 (4.0.0)
 *             Build id: 202202
 ********************************************************************************************/



package application;

/**
 * The Modal class provides methods for performing mathematical calculations.
 */
public class Modal {
    
    /**
     * Performs the calculation based on the provided operator and operands.
     * 
     * @param number1 The first operand.
     * @param number2 The second operand.
     * @param operator The operator to perform the calculation.
     * @return The result of the calculation.
     */
    public float calculate(long number1, long number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0)
                    return 0; // Handling division by zero
                return number1 / number2;
            default:
                return 0; // Invalid operator
        }
    }
}