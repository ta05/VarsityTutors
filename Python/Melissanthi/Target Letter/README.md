# Target Letter

## Background

Given a string `phrase` and a number `limi`, calculate which word in the phrase is the `target word`. The `target word` is defined as the first word in the `phrase` whose first two letters are in the first part of tha alphabet (from the first `limit` letters of the alphabet), and whose last two letters are in the last part of the alphabet (the last `limit` letters of the alphabet). If no such word in `phrase` matches this criteria, then the `target word` is the last word in the `phrase`. The `target letter` is definied as the first letter of the `target word`.

## Task

Return a string of numbers where each number corresponds to the position of the `target letter` in a word from the `phrase`. If the `target letter` is not in a word, then use the number -1. Separate the numbers in the string with a blank space.

## Examples

- `calculate("horticultural hospitalities improbability kindheartedly", 20)` -> `"4 4 0 1"`
  -  Note that the first 20 letters of the alphabet are 'a' through 't' and the last 20 letters of the alphabet are 'g' through 'z'.
  - Consider the first word "horticultural". The first 2 letters are 'h' and 'o' and are both from the first 20 letters of the alphabet. The last two letters are 'a' and 'l'. The letter 'a' is **NOT** in the last 20 letters of the alphabet. This is not the target word.
  - Consider the second word "hospitalities". The first 2 letters are 'h' and 'o' and are both from the first 20 letters of the alphabet. The last two letters are 'e' and 's'. The letter 'e' is **NOT** in the last 20 letters of the alphabet. This is not the target word.
  - Consider the third word "improbability". The first 2 letters are 'i' and 'm' and are both from the first 20 letters of the alphabet. The last two letters are 't' and 'y' and are both from the last 20 letters of the alphabet. This is the target word.
  - The target letter is the first letter of the target word: "i".
  - From each word in phrase, find the first position of "i" in that word and put those positions in a string with blanks between the numbers
    - "i" is in position 4 in "horticultural"
    - "i" is in position 4 in "hospitalities"
    - "i" is in position 0 in "improabability"
    - "i" is in position 1 in "kindheartedly"
  - Returns the string "4 4 0 1"