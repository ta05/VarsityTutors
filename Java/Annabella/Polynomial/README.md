# Polynomial

A polynomial is an expression consisting of variables and coefficients, that involves only the operations of addition, subtraction, multiplication, and non-negative integer exponentiation of variables. This program creates a Polynomial class which is a programmatic representation of a polynomial and a Calculus class which performs integration and differentiation on Polynomial Objects.

## Polynomial Class

The double array polynomial will hold the values in reverse order so that the index will match the exponent of the polynomial term. So the constant will be at position 0, the x term will be at position 1, the x^2 term will be at position 2 and so on.

Complete the following methods:

### `Polynomial(double[] polynomial)`

Complete the Polynomial constructor

### `double getPolynomial()`

Returns the Polynomial

### `String toString()`

Returns the Polynomial as a String in descending term degree order. For example, [2,1,3] should be returned as 3x^2 + x + 2. Use the symbol ^ for exponents and use the variable x for all Polynomial objects. All coefficients of 1 should not appear in the String.


## Calculus Class

The Calculus class only contains static methods. These methods are used to differentiate and integrate Polynomial objects.

Complete the following methods:

### `Polynomial differentiate(Polynomial p)`

Precondition: p is not null
Postcondition: returns the derivative of p as a Polynomial

### `Polynomial differentiate(Polynomial p, double value)`

Precondition: p is not null
Postcondition: returns the value of the derivative of p at x = value. 

First find the derivative and then substitute the value for x into the derivative and calculate a solution.

### `Polynomial integrate(Polynomial p)`

Precondition: p is not null
Postcondition: returns a Polynomial as the antiderivative of p

This is the indefinite integral of p and should include the constant of integration in the solution but we will ignore it and put zero instead.

### `Polynomial integrate(Polynomial p, double lowerLimit, double upperLimit)`

Precondition: p is not null, lowerLimit < upperLimit
Postcondition: returns the solution to the definite integral