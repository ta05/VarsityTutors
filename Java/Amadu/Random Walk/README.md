# Loops And Conditionals

## 3. Random Walk

A Java programmer begins walking aimlessly. At each time step, she takes one step in a random direction (either north, south, east, or west), each with a probability of 25%. She stops once she is at Manhattan distance *r* from the starting point. How many steps will the random walker take? The process is known as two-dimensional walk.

Write a program `RandomWalker.java` that takes an integer command-line argument `r` and simulates the motion of a random walk until the random walker is at Manhattan distance `r` from the starting point. Print the coordinates at each step of the walk (including the starting and ending points treating the starting point as (0,0)). Also print the total number of steps taken.