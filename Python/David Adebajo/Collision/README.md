# Traffic Collision

For Assignment 4, it is your job to help the traffic collision experts at the Department of Motor Vehicles. You must read in a .csv file of values, calculate the velocities of vehicles before collisions, and store the results in two separate .txt files.

## Part 1

Two trucks collide in an icy intersection. Truck 1 has a mass of 3000kg, and is traveling at an unknown velocity and is heading West [W] before the collsion and Truck 2 has a mass of 2250kg and is traveling at 12m/s North [N] before the collision. The collision lasts for 0.5 seconds. After the collision, the two tricks slide alongside together at a velocity of 10m/s North-West [NW]. What is the velocity of Truck 1 before the collision? Solve the problem with the three steps of parametric modelling. We only care about velocity in m/s, and you will not need to do any calculations related to the angles (simply solve for the variables you are looking for using the provided equations; the directions can be used in your diagram), and you do not have to worry about real world factors such as drag.

Hint: You may want to calculate the momentum of the two vehicles together first.

**p<sub>t</sub> = m<sub>t</sub>v<sub>t</sub>  
p<sub>1</sub> = m<sub>1</sub>v<sub>1</sub>  
p<sub>2</sub> = m<sub>2</sub>v<sub>2</sub>  
m<sub>t</sub>: mass of both vehicles  
v<sub>t</sub>: velocity of both vehicles  
p<sub>t</sub>: momentum of both trucks  
p<sub>1</sub>: momentum of Truck 1  
p<sub>2</sub>: momentum of Truck 2  
m<sub>1</sub>: mass of Truck 1  
v<sub>1</sub>: velocity of Truck 1  
m<sub>2</sub>: mass of Truck 2  
v<sub>2</sub>: velocity of Truck 2**

## Part 2

Program the function you developed in Part 1. Assume that truck 1 is always moving West and truck 2 is always moving North, and that they always head North-West after the collision (i.e. the only that will change are the specific parameters). The function should have the following parameters: Truck 1's mass, Truck 2's mass and velocity, and the velocity of the collision. The returned value is the velocity that Truck 1 was traveling before the collision. Test your function using the values used in your calculation in Part 1.

## Part 3

Update your program to read in various collisions from a .csv file whose filename is typed in by the user (a sample csv file has been provided). The order of values in this csv are as follows: Collision ID, Truck 1's mass, Truck 2's mass, Truck 2's velocity, and the velocity of the collision. Open this file to make sure you understand its contents.

For each collision, calculate the velocity in m/s of the Truck 1 and store it into RawVelocity.txt in a `\n` delimited list (that is one calculation per line).

Assume that the speed limit before the intersection is 50km/hr. Report the Collision ID and the velocity of Truck 1 in km/hr if the truck was driving over the speed limit before the collision. For these speeding vehicles, write to the file the cost of the speeding ticket which is calculated (velocity - speed limit) * 12.50. The collisions should be ordered by the amount that Truck 1 is over the speed limit (ascending order). This is all recorded in a file called **Vehicle1SpeedingTickets.txt**.

Additionally you should provide messages that indicate when you have completed writing details to each of the file and when your program has completed to let the user know. See the sample at the bottom.

Hint: you may want to use a list and/or dictionary for ordering the output.

**Each Entry of Vehicle1SpeedingTickets.txt should look like:**

`In Collision ID#1003A: The Vehicle was hoing 60km/hr and will be charged: $125.00.`

**You must use the format operator to print the above message to the output file. Money amounts must be rounded correctly and display exactly 2 decimal places.**

**For the provided Collisions.csv file given, the contents of the two files created by your program should be:**

Raw Velocity.txt

~~~
16.0153m/s
44.8058m/s
13.0516m/s
59.1608m/s
~~~

Vehicle1SpeedingTickets.txt:

~~~
In Collision ID#1468D: The Vehicle was going 107km/hr and will be charged $712.50.
In Collision ID#8654Z: The Vehicle was going 119km/hr and will be charged $862.50.
~~~