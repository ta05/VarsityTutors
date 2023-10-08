Use slicing and indexing (or any method you choose) to accomplish the follwing:

Given a list of `nm`, make a new list `middle` which incldues all the same elements as `nm`, but excludes everything before the first "x", and everything after the last one.

If there are zero or one "x"s in `nm`, then the new list should be empty.

## Example

~~~
nm = ['a', 'x', 4, 6, 'x', 7]   # middle should be [4, 6]
nm = ['a', 'x', 'x', 'x']       # middle should be ['x']
nm = [6, 'x']                   # middle should be []
nm = ['x', 1, 'a', 'X', 'x', ]  # middle should be [1, 'a', 'X']
~~~