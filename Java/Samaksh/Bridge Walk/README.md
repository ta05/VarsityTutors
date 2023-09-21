# Brigde Walk

## Objective:

Learn about the Java syntax for methods, conditionals, output and the primitive data types.

In this problem a person is placed at the center of a 7-meter long bridge (as an initial example, bridge size will change later). Each step, the person moves 1 meter either forward or backward at random.

You will complete the following methods to help simulate the above problem:

1. `void display(int step, int location, int size)` This method will putput a bridge with the person represented by an `*`. Here is what the bridge should look like at the start... `Step 0: |---*---|` This should be done with a couple of for loops. The `step` parameter states what the step the user in on, `location` indicates the position on the bridge, `size` is the size of the bridge.
2. `int calculateLocation(int location)` This method will return the new bridge location for the person after randomly moving left or right. `location` is the current spot of teh person on the bridge.
3. `int oneSimulation(int size, boolean print)` This method will perform the Bridge Walk simulation. The person is in the middle spot of a bridge size, `size`. The `print` variable tells if you should display the bridge or not. The method should start at step 0 and loop until the person falls off the bridge, displaying each bridge step as the person moves, and returning the final number of steps.
4. `double bridgeSimulation(int size)` This function takes a bridge of `size` as its parameter and runs 50 simulations of the Bridge Walk and returns the average number of steps needed to fall off.
5. `main` should promt the user for a bridge size, and then run the simulation. This will display many bridges before finally reporting the average results.

**Here is what a sample run of this program should look like:**

~~~
Welcome to The Bridge Walk

This program will run 50 trials on a requested bridge size and report back the average number of steps needed to fall off. Only input odd numbers please or you will get nothing. The first trial is shown with the illustration, the rest are not shown.

What size bridge would you like to test (3-21 recommend): 7      
Step: 0 |---*---|
Step: 1 |----*--|
Step: 2 |---*---|
Step: 3 |--*----|
Step: 4 |---*---|
Step: 5 |--*----|
Step: 6 |---*---|
Step: 7 |----*--|
Step: 8 |---*---|
Step: 9 |----*--|
Step: 10 |-----*-|
Step: 11 |------*|
Step: 12 |-----*-|
Step: 13 |----*--|
Step: 14 |---*---|
Step: 15 |----*--|
Step: 16 |---*---|
Step: 17 |----*--|
Step: 18 |---*---|
Step: 19 |--*----|
Step: 20 |-*-----|
Step: 21 |--*----|
Step: 22 |---*---|
Step: 23 |--*----|
Step: 24 |---*---|
Step: 25 |----*--|
Step: 26 |-----*-|
Step: 27 |----*--|
Step: 28 |---*---|
Step: 29 |----*--|
Step: 30 |-----*-|
Step: 31 |----*--|
Step: 32 |-----*-|
Step: 33 |------*|
Step: 34 |-----*-|
Step: 35 |------*|
Step: 36 |-------|

They fell off.
The average number of steps was: 16.0

Thank you for using my program.
~~~