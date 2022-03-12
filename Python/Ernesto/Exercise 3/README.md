# Exercise 3 - Logic

## Story

Four people come to a river in the night. There is a narrow bridge, but it can only hold two people at a time. They have one torch and, because it's night, the torch has to be used when crossing the bridge.

Alice can cross in 1 minute, Bruce in 2 minutes, Carla will take 9 minutes and David, 10 minutes. The fastest the team can cross the bridge is 17 minutes:

~~~
Alice & Brian cross (2 mins) Total = 2 mins        
Alice crosses (1 mins) Total = 3 mins
Carla & David cross (10 mins) Total = 13 mins      
Brian crosses (2 mins) Total = 15 mins
Alice & Brian cross (2 mins) Total = 17 mins  
~~~

## Task

Write a Python program that confirms the result shown above. Use print statements where necessary to produce a table of steps. Use the following tuple as the starting condition of the program: `team = (("Alice", 1), ("Brian", 2), ("Carla", 9), ("David", 10))`. Finally, test your program by confirming that if the team is joined by Eve, who takes 8 minutes to cross, the new fastest time for the entire team to cross the bridge is 26 minutes.