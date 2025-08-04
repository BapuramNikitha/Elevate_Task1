# Elevate_Task1
Multiple Calculations
This program is a menu-driven calculator that performs basic arithmetic operations: addition, subtraction, multiplication, and division. It demonstrates the use of methods, loops, Scanner input, and control flow in Java.
Key Features:
Methods for Arithmetic Operations

The program defines four methods:

add(double a, double b) → returns the sum.

subtract(double a, double b) → returns the difference.

multiply(double a, double b) → returns the product.

divide(double a, double b) → returns the quotient (handles divide-by-zero safely).

User Input using Scanner

A Scanner object reads the user’s choice of operation and the two numbers for calculation.

Loop for Multiple Calculations

A while loop keeps the calculator running until the user selects the Exit (5) option.

The program repeatedly shows a menu of operations and performs the selected task.

Switch-Case for Operation Selection

The program uses a switch statement to call the corresponding method based on the user’s choice.

Divide-by-Zero Handling

The division method checks if the denominator is zero and prints an error message instead of crashing.

Program Flow:
Display the menu of operations.

Accept the user’s choice using Scanner.

If the choice is not Exit:

Ask the user for two numbers.

Call the corresponding arithmetic method.

Print the result.

Repeat until the user selects Exit.

Outcome:
Understands Java syntax, methods, loops, and switch-case.

Learns how to take input and handle divide-by-zero errors.

Practices logical program flow in Java.
