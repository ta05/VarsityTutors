# Twenty One

## Task

Write a program to play the dice game Twenty One against the computer. The object of the game is to get a score of 21 or come close to 21 without exceeding 21.

The game is played with two dice and the player goes first: each time the player rolls the dice the number is added to his/her score. When the score reaches 14 the player switches to a single die. The player can roll as many times as s/he likes or may stop on any score less than 22. If a player gets a score more than 21, s/he loses.

Next the computer goes: if the player has busted (scores over 21) the computer wins. Otherwise, the computer continues rolling as long as its score is lower than or equal to the player's score and less than 22. If the computer beats the player's score it wins. If the computer's score exceeds 22, it loses.

Your program should repeat the game as often as the player would like and report the number of player wins and losses.

## Advice

This program is challenging because there are many decisions that it has to make to manage various situations as the player and computer roll the dice. The best strategy is to go slow and build up the program piece by piece. Start with rolling two dice for the player to get an initial score. Just get that part of the program to work. When that is working, **THEN** move onto the part that checks for a score over 22. Don't worry about the single die roll just yet. When both of these are working, then work on the part that handles switching to a single die.

## Sample Output

~~~
Player rolls...
Roll (y/n)?: y
You rolled 6. Player score is 6.
Roll (y/n)?: y
You rolled 10. Player score is 16.
Roll (y/n)?: y
You rolled 6. Player score is 22.
Computer wins.
Play again (y/n)? y
Player rolls...
Roll (y/n)?: y
You rolled 6. Player score is 6.
Roll (y/n)?: y
You rolled 8. Player score is 14.
Roll (y/n)?: y
You rolled 1. Player score is 15.
Roll (y/n)?: y
You rolled 5. Player score is 20.
Roll (y/n)?: n
Computer rolls...
Computer rolls 10. Computer score is 10.
Computer rolls 9. Computer score is 19.
Computer rolls 4. Computer score is 23.
Player wins.
Play again (y/n)? y
Player rolls...
Roll (y/n)?: y
You rolled 9. Player score is 9.
Roll (y/n)?: y
You rolled 6. Player score is 15.
Roll (y/n)?: y
You rolled 1. Player score is 16.
Roll (y/n)?: y
You rolled 2. Player score is 18.
Roll (y/n)?: n
Computer rolls...
Computer rolls 7. Computer score is 7.
Computer rolls 5. Computer score is 12.
Computer rolls 5. Computer score is 17.
Computer rolls 3. Computer score is 20.
Computer wins.
Play again (y/n)? y
Player rolls...
Roll (y/n)?: y
You rolled 9. Player score is 9.
Roll (y/n)?: y
You rolled 4. Player score is 13.
Roll (y/n)?: y
You rolled 12. Player score is 25.
Computer wins.
Play again (y/n)? y
Player rolls...
Roll (y/n)?: y
You rolled 4. Player score is 4.
Roll (y/n)?: y
You rolled 4. Player score is 8.
Roll (y/n)?: y
You rolled 10. Player score is 18.
Roll (y/n)?: n
Computer rolls...
Computer rolls 3. Computer score is 3.
Computer rolls 5. Computer score is 8.
Computer rolls 6. Computer score is 14.
Computer rolls 6. Computer score is 20.
Computer wins.
Play again (y/n)? n
Player record (W-L): 1-4
~~~