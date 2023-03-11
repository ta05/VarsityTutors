# Assignment 5 - Dictionaries and File Input/Output

## Question 1

Purpose: To practice the concept of dictionary as a database

Degree of Difficulty: Moderate.

Write a function called `read_citydata` that takes as parameter(s):

- a string indicating the name of a city data file

This function should return a database (i.e. a dictionary-of-dictionaries) that stores all of the City data in a format that we will describe further below.

### Input File Format

The data file for this question looks like this:

~~~
Holiday Park,Ward 2,Spanish,English,French,Ukrainian,Cree,German
North Park,Ward 1,Tagalog,Ukrainian,French,German,English
~~~

Each line of the file contains all of the data for a single neighborhood. The first item on the line is always the neighborhood’s name; names are guaranteed to be unique. The second item is always the neighborhood’s ward, which in the example above, is Ward 2. Following that are one or more languages which are spoken in that neighborhood. So there are residents in Holiday Park that speak Spanish, English, French, Ukrainian, Cree, or German. Note that the language names CAN contain spaces. All of the data items on a each line are separated by commas.

### Database Format

Your function should open the file given as a parameter and read the data from it into a database. The keys for this database will be neighborhood names, and the values will be records (i.e another dictionary) for the matching neighborhood.

First, the `read_citydata` function should create an empty dictionary to be the overall database.

Then, for each neighborhood from the input file, create one record (i.e. one dictionary) with the following fields:

- The neighborhood’s name, as a string.

- The ward, as a string.

- The spoken languages, as a list of strings.

This record should then be added to the database, using the neighborhood’s name as a key.

Once all of the records have been added, the function should return the database dictionary.


## Question 2

Purpose: To practice iterating over data

Degree of Difficulty: Easy.

Write a function called `find_wards` which takes as parameter(s):

- A dictionary in the format of the city database as described in Q1

This function should construct and return a list of all the different wards. Each entry in the list should be unique; in other words, don’t add the same ward twice. For the input file you were given, the resulting list should be (though not necessarily in this order):

~~~
[’Ward 1’, ’Ward 9’, ’Ward 5’, ’Ward 2’, ’Ward 3’, ’Ward 4’, ’Ward 6’, ’Ward 8’, ’Ward 7’, ’Ward 10’]
~~~

Also, note that this function must not change the city database in any way.


## Question 3

Purpose: To practice iterating over nested compound data and accessing different dictionary fields

Degree of Difficulty: Easy.

Write a function called `ward_neighborhoods` which takes as parameter(s):

- A dictionary in the format of the city database as described in Q1

- The name of a ward, as a string

The function should construct and return a list containing the neighborhoods that can be found in a particular ward. For example, for the input file you were given, if the ward is "Ward 2", the resulting list should be (though not necessarily in this order):

~~~
[’Meadowgreen’, ’Westmount’, ’Pleasant Hill’, ’Caswell Hill’, ’Montgomery Place’, ’King George’, ’Holiday Park’, ’Riversdale’]
~~~

Also, note that this function must not change the city database in any way.


## Question 4

Purpose: To practice summarizing data from a dictionary

Degree of Difficulty: Moderate.

Write a function called `count_languages` which takes as parameter(s):

- A dictionary in the format of the city database as described in Q1

- A list of neighborhood names (as strings)

This function should construct and return a dictionary where each key is a language (e.g. English or French, etc...) and the value for that key is the number of neighborhoods of that speak that language in a given list. For example, using the sample list of all of the neighborhoods from "Ward 2" (see Q3 to see that list), the resulting dictionary should be:

~~~
{’Sino-Tibetan languages’: 2, ’Chinese’: 1, ’Mandarin’: 1, ’Arabic’: 1, ’Bengali’: 1, ’French’: 5, ’English’: 8, ’German’: 4, ’Cree’: 6, ’Tagalog’: 4, ’Ukrainian’: 5, ’Spanish’: 2, ’Cantonese’: 1}
~~~

Also, note that this function must not change the city database or the given list of neighborhood names in any way.


## Question 5

Purpose: To practice solving a problem by calling multiple functions; to practice passing data results between functions

Degree of Difficulty: Easy if you did everything right so far

Now it’s time to put all your functions together to print out a summary report of the number of neighborhoods that speak unique languages in each ward.

In the main part of your program, write code that will print to the console the name of each ward, the TOTAL number of different neighborhoods that can be found in that ward, followed by the counts for number of neighborhoods for each spoken language in that ward. For example, the format for your output might look something like this:

~~~
Ward 1 contains 10 neighborhoods. Below are the languages spoken in the Ward and the number of neighborhoods where that language is spoken.

{’Russian’: 1, ’Telugu’: 1, ’Hindi’: 1, ’Urdu’: 2, ’Chinese’: 1, ’Mandarin’: 1, ’Arabic’: 3, ’German’: 8, ’French’: 8, ’English’: 10, ’Bengali’: 1, ’Cree’: 2, ’Tagalog’: 5, ’Punjabi’: 1, ’Gujarati’: 1, ’Ukrainian’: 6}

Ward 2 contains 8 neighborhoods. Below are the languages spoken in the Ward and the number of neighborhoods where that language is spoken.

{’Sino-Tibetan languages’: 2, ’Chinese’: 1, ’Mandarin’: 1, ’Arabic’: 1, ’Bengali’: 1, ’French’: 5, ’English’: 8, ’German’: 4, ’Cree’: 6, ’Tagalog’: 4, ’Ukrainian’: 5, ’Spanish’: 2, ’Cantonese’: 1}
~~~

There will be more wards, but we’re only showing two here to save space.

To do this, you will need to make use of all of the functions you have written so far and make good use of their inputs and outputs. If you’ve done everything correctly, this part of your program won’t require a lot of code: just a few function calls and a single for-loop should be enough.