# Problem 1

Complete the functions below, where example arguments are also shown below. **Note that the solutions for the functions should only require one line of cose, and must use only list comprehension or map/lambda expressions as the problem specifies.**  

- `sel_sqrt(a,b)`: This function is given integers `a` and `b` where `a < b`. It then returns a list containing the following computed values for integers `i` between `a` and `b`: the square roout of `i` if `i` is odd, and 2 * `i` if `i` is even. **Use list comprehension for this function**.  
- `inchtomtuple_lc(h_list)`: Using list comprehension, this function is given a list of heights in inches, and it returns a list of tuples, where the first element in each tuple is a height in inches, and the second element of the tuple is the height in meters. Note that there are 0.0254 meters per inch. **Be sure to round the height in meters to 4 decimal places.**  
- `inchtomtuple_map(h_list)`: This function should do the same as above, but it should only use the map function and a lambda expression, instead of list comprehension.  

## Examples

- `sel_sqrt(1,10)` returns `[1.0, 4, 1.73, 8, 2.24, 12, 2.65, 16, 3.0, 20]`  
- `inchtomtuple_lc([40,50,60,70,80])` returns `[(40, 1.016), (50, 1.27), (60, 1.524), (70, 1.778), (80, 2.032)]`
- `inchtomtuple_map([40,50,60,70,80])` returns `[(40, 1.016), (50, 1.27), (60, 1.524), (70, 1.778), (80, 2.032)]`