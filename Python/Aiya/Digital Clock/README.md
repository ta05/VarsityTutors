# Problem 1

## for loops and user-defined functions (2.5 points)

You have been given three functions in the Python file `digitalclock.py`. For this problem, you will import functions from `digitalclock.py` to print patterns that look like digits on a clock.

Write a series of functions that will call functions from `digitalclock.py` to print the digits 0-9 in block format with fixed width 5 and fixed height 5 by calling functions from `digitalclock.py`. Your functions should take in a single argument that defines the character that will be used to print the number.

- The code for each digit function should not be more than five lines in length.
- Use a docstring to comment on each function.
- Dot notation should be used to call the functions.

Hint: use `help()` to look up docstring information about `digitalclock` functions. Remember to `import digitalclock` before calling `help()`.

Below are some examples of the functions being called in IDLE's interactive mode. Underlined text inidicates user input.

### Example 1
*`number5("%")`*
~~~
%%%%%
%
%%%%%
    %
%%%%%
~~~


### Example 2
*`number6("^")`*
~~~
^^^^^
^
^^^^^
^   ^
^^^^^
~~~


### Example 3
*`number9("(")`*
~~~
(((((
(   (
(((((
    (
    (
~~~


