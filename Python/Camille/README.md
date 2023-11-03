# Problem 2: Tiling

In this problem, you're given a collection of tiles as numbers, for example, [1,2,3]. You're given a space to fit the tiles (linearly), for example 6. Your function, using recursion, gives all the possible patterns where the tiles add exactly to the fit. For example:

~~~py
n = 6
v = [1, 2, 3]
print(tiles(n, v, [[i] for i in v]))
for i in tiles(n, v, [[i] for i in v]):
    print(sum(i), end="")
~~~

produces:

~~~
[[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 2], [1, 1, 1, 2, 1], [1, 1, 2, 1, 1], [1, 2, 1, 1, 1], [2, 1, 1, 1, 1], [1, 1, 1, 3], [1, 1, 3, 1], [1, 3, 1, 1], [3, 1, 1, 1], [1, 1, 2, 2], [1, 2, 1, 2], [1, 2, 2, 1], [2, 1, 1, 2], [2, 1, 2, 1], [2, 2, 1, 1], [1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1], [2, 2, 2], [3, 3]]
666666666666666666666666
~~~

All the possible configurations and all equal 6. For numbers [1,2] and size = 4, we have:

~~~
[[1, 1, 1, 1], [1, 1, 2], [1, 2, 1], [2, 1, 1], [2, 2]]
44444
~~~

The function tiles takes n (the total size), v (the different numbers), and the starter tiles. When approaching this problem, you should inspect the output - it is helpful with reference to what the recursion does.