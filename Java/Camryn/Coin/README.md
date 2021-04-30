# Coin

## Coin Class

Write a Coin class which has an int mint year, an int value and a String country attribute. And create the following methods for it.

- `public Coin`: The constructor accepts an int year, int value and a String country parameter and assigns them to the corresponding attributes of the class.

- `public int getYear`: Returns the mint year.


## Coin Collection

Write a Coin class which has an ArrayList of Coins  coins attribute. Create the following methods.

- `public CoinCollection`: The constructor accepts an int[] years, an int[] value and a String[] countries as parameters and creates Coins that are placed in the coins ArrayList.

- `public boolean isRare`: The method accepts an int year as a parameter and returns true if any of the coins in the collection have a mint year prior to the year parameter, and false if no coin was minted prior to the year.