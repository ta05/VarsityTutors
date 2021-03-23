# Black Jack

## Card To Value

Write a function that accepts a parameter string *card* which represents a playing card and returns the value of that card (as an int). The string numbers "2" through "9" are worth their own numerical value. Tens "T", Jacks "J", Queens "Q" and Kings "K" are all worth 10. Aces "A" can be worth 1 or 11, but for this function, an Ace is worth 11.

- `card_to_value("5")` returns `5`
- `card_to_value("K")` returns `10`
- `card_to_value("A")` returns `11`

## Hard Score

Write a function that accepts a parameter string *hand* which represents a hand of playing cards where each character in the string represents a *card* and returns the total value of the hand. Aces are worth 11.

- `hard_score("J25")` returns `17`
- `hard_score("5528")` returns `20`
- `hard_score("AQ")` returns `21`

## Soft Score

Write a function that accepts a parameter string *hand* which represents a hand of playing cards where each character in the string represents a *card* and returns the total value of the hand. The first Ace is worth 1. All subsequent Aces are worth 11.

- `soft_score("A8A")` returns `20`
- `soft_score("55A28")` returns `21`
- `soft_score("AQ")` returns `11`