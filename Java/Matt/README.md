# Implementing a Priority Queue as a List - Covid Queue

## The Application

Your assignment is to write a Java program that simulates people standing in line to get a Covid
vaccination. The people are prioritized into three groups. Group 1 is front line medical workers.
They have the highest priority, given by the number 1. The second group, Group 2, is people 75
and older, with priority 2. The third group is people 65 and older, with priority 3.

## Implementation

Your program should implement a CovidQ class for this simulation. The CovidQ class will be a
kind of "priority queue" -- that is, a queue in which people have priorities. Like a regular queue,
people ordinarily enter the queue at the end, and the ones at the front of the queue get served
first -- but with one additional consideration. The queue is maintained such that all the priority 1
people get to line up in the front, the priority 2 people get to line up after the priority 1 people,
and the priority 3 people line up at the end.