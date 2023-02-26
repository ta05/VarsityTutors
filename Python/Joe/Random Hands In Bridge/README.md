# CS355 Program 1

## Background

### Random Hands in Bridge

Usually between games in the card game bridge, the deck of 52 cards is shuffled three times, thinking that this will produce a randomly ordered deck, so that hands dealt will be randomly ordered. Sets of four hands produced using exactly three shuffles usually have suits ordered with four cards of one suit and three cards of the other suits, so this result is not surprising.

### Completely Random Hands

Several experiments using computer experiments to produce completely random hands have been conducted, and most of them do not produce the same results as exactly three shuffles. Most sets of hands produced by randomly generated ordering of the deck have different numbers of cards in each suit, so that 4-4-2-1 or 5-5-3-0 results are much more common. There are various explanations for why three shuffles may or may not produce very random hands.

## Assignment

### Analysis

Using a deck of cards numbered -, shuffle the cards fifteen times using several different methods described below to produce a permutation of the original deck. Calling the original order i and the new deck y<sub>i</sub>, calculate the correlation coefficient for each of the fifteen runs.

THe correlation coefficient is a measure of how related two sets of numbers are. If r = 0 or if r is close to 0, then the two variables are completely independent. If r = 1, then the i values and the y<sub>i</sub> values are all equal, i = y<sub>i</sub>. If r  = -1, then the y values are backward, so that i = y<sub>n-i</sub> where n - 1 is the number of cards in the deck.

### First Run

Given a deck of cards `cards` with 52 entries, produce a new deck by dividing the deck into two pieces, `cards[1-26]` and `cards[27-52]`, then picking out `card[1]` and then `card[27]`, followed by `card[2]` and then `card[28]` etc.

Do this 15 times, calculating the value of r for each shuffle, and answer the following questions:

1. Plot r with respect to the number of times shuffled. After how many shuffles are the cards in the most random order? (When is r at a minimum value?)
2. Do the cards return to their original order? After how many runs?
3. Is a total of 15 runs enough to return to the original order?
4. If nor, does it appear that the cards will return to their original order in a relatively small number of shuffles?

### Second Run

In the **First Run**, the first card will always be 1 and the last card will always be 52. Change the shuffling so that the first card in the next deck is `card[27]`, the second card is `card[1]`, etc. so that the last two cards are `card[52]` followed by `card[26]`. Answer the same questions as in the **First Run**.

### Third Run

Repeat the **First Run** with a deck of cards of 104 members.

### Fourth Run

Repeat the **Second Run** with a deck of 104 members