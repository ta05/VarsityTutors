# Unit 3

## Remove Capitals

### Task

Write a function called `remove_capitals`. `remove_capitals` should accept one parameter, a `string`. It should return a `string` containing the original `string` with all the capital letters removed. Everything else should be in the same place.

### Examples

- `remove_capitals("A1B2C3D")` -> `"123"`
- `remove_capitals("WHAT")` -> `""`
- `remove_capitals("what")` -> `"what"`

### Note

Remember capital letters have ordinal numbers between 65 (A) and 90 (Z). You may use the `ord()` function to get a character's ordinal number

Your function should be able to handle strings with no capital letters (returns the original string) and strings with all capitals (returns an empty string). You may assume we'll only use regular characters (no emojis, formatting characters, etc.)

## Get Numerals

### Task

Write a function called `get_numerals`. `get_numerals` should accept one parameter, a `string`. It should return a `string` containing only the numberals from the original `string`: no letters, punctuation marks or spaces.

### Note

Remember, numerals have ordinal numbers between 48 (0) and 57 (9). You may use the `ord()` function to get a character's ordinal number.

Your function should be able to handle strings with all numerals (returns the original string) and strings with no numerals (returns an empty string). You may assume we'll only use regular characters (no emojis, formatting characters, etc.)

### Examples

- `get_numerals("A1B2C3D")` -> `"123"`
- `get_numerals("WHAT")` -> `""`
- `get_numerals("1984")` -> `"1984"`

## Determine Price

### Task

Write a function called `determine_price`. `determine_price` should accept three parameters, an `int original_price`, an `int days_since_release` and a `bool greatest_hits`. It should return an `int` representing the new price of the video game after the `days_since_release`. The price of the video game will be the `original_price` minus the loss which will be calculated as the number of full weeks since the games `days_since_release` multiplied by 2 if the games is not one of the `greatest_hits`. The minimum price that the game will be sold is $20.

### Examples

- `determine_price(25, 7, True)` -> `24`
- `determine_price(25, 7, False)` -> `23`
- `determine_price(25, 14, True)` -> `23`
- `determine_price(25, 28, True)` -> `21`
- `determine_price(25, 28, False)` -> `20`