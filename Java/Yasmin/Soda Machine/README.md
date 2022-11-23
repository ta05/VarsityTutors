# Soda Machine

## `SodaMachine.java`

Write a class called `SodaMachine` that has an instance variable for the total money in the machine. The class should also have variables for the number of each type of soda product available in the machine.


Write a method called `makePurchase` in `SodaMachine.java` that takes in the type of soda and amount. If the user does not have enough money, tell them they do not have enough money. If they do have enough money, give them the drink, their change (if any) and decrement the appropriate variables. Additionally, preset the number of soda products in the machine, so that if there were only 2 Sprite cans in the machine, and those two have already been purchased, tell the user that the machine is sold out of Sprite.

## `Main.java`

In the `Main` class, create a `SodaMachine` object. Check the total money in the machine. If the amount is less than $2.00, display a message that the customer must enter exact change. Otherwise, the machine will be able to give out change.

The customer will feed in a series of quarters, dimes, and nickels into the machine via user input. Call the `makePurchase` method.

After each purchase, ask the customer if they would like to make another purchase.

