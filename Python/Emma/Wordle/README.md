# Wordle

## Part 2

### **Step 3**

#### **Task**

Write a function called `write_word_length_files` which takes three arguments: a `list` of unique word dictionaries, a desired word length, and an output file name. The function `write_word_length_files` should find all word dictionaries in the list of unique word dictionaries that have a word length matching the length argument to the function. Then write all the of the word dictionaries for words with the proper length to the output file, with the header "word,word_type" followed by all word dictionaries in the form "*word*,*word_type*" followed by all word dictionaries in the form "*word*,*word_type*" You **must not** use the `len()` function. Instead, you mus utilize the `word_length` key in each of the word_dictionaries.

#### **Function**

- **Name**: `write_word_length_files`

- **Arguments**:
  - list of unique word dictionaries - `list`
  - desired word length - `int`
  - output filename - `str`

- **Output**: `None`

#### **Example**

~~~py
unique_word_dicts = [
    {'word': 'care', 'word_type': 'unknown', 'word_length': 4},
    {'word': 'learn', 'word_type': 'verb', 'word_length': 5},
    {'word': 'people', 'word_type': 'verb', 'word_length': 6},
    {'word': 'way', 'word_type': 'noun', 'word_length': 3},
    {'word': 'care', 'word_type': 'pronoun', 'word_length': 4},
    {'word': 'people', 'word_type': 'unknown', 'word_length': 6},
    {'word': 'care', 'word_type': 'verb', 'word_length': 4},
    {'word': 'way', 'word_type': 'verb', 'word_length': 3},
    {'word': 'people', 'word_type': 'pronoun', 'word_length': 6},
]


write_word_length_files(unique_word_dicts, 6, "length_6_words.csv")
# Creates a file "length_6_words.csv" and fill it with the following contents:

```
word,word_type
people,verb
people,unknown
people,pronoun
```
~~~

## Part 4

### **Step 1**

#### **Task**

Write a function called `filter_by_length_and_type` which takes three arguments: a list of word dictionaries, a word length, and a word type. The function should create and return a new list of word dictionaries consisting entirely of words whose length and type match the word length and word type passed as arguments.

You **must not** use the `len()` function in `filter_by_length_and_type`. Instead, get the length of each word using the `word_length` key.

#### **Function**

- **Name**: `filter_by_length_and_type`

- **Arguments**:
  - list of unique word dictionaries - `list`
  - desired word length - `int`
  - word type - `str`

- **Output**: list of word dictionaries for words whose length and type match the word length and word type arguments - `list`

#### **Example**

~~~py
unique_word_dicts = [
    {'word': 'care', 'word_type': 'unknown', 'word_length': 4},
    {'word': 'learn', 'word_type': 'verb', 'word_length': 5},
    {'word': 'people', 'word_type': 'verb', 'word_length': 6},
    {'word': 'way', 'word_type': 'noun', 'word_length': 3},
    {'word': 'care', 'word_type': 'pronoun', 'word_length': 4},
    {'word': 'people', 'word_type': 'unknown', 'word_length': 6},
    {'word': 'care', 'word_type': 'verb', 'word_length': 4},
    {'word': 'way', 'word_type': 'verb', 'word_length': 3},
    {'word': 'people', 'word_type': 'pronoun', 'word_length': 6},
]


filter_by_length_and_type(unique_word_dicts, 4, "verb")
# Returns: [{'word': 'care', 'word_type': 'verb', 'word_length': 4}]
~~~

## Part 4

### **Step 2**

#### **Task**

Write a function called `get_random_word` which takes one argument: a list of word dictionaries. The function `get_random_word` should select a random word dictionary from the list, and then return the string word in that word dictionary.

You might find the `random.choice` function helpful in your implementation.

#### **Function**

- **Name**: `get_random_word`

- **Arguments**:
  - list of word dictionaries - `list`

- **Output**: a single, randomly selected word - `str`

#### **Example**

~~~py
unique_word_dicts = [
    {'word': 'care', 'word_type': 'unknown', 'word_length': 4},
    {'word': 'learn', 'word_type': 'verb', 'word_length': 5},
    {'word': 'people', 'word_type': 'verb', 'word_length': 6},
    {'word': 'way', 'word_type': 'noun', 'word_length': 3},
    {'word': 'care', 'word_type': 'pronoun', 'word_length': 4},
    {'word': 'people', 'word_type': 'unknown', 'word_length': 6},
    {'word': 'care', 'word_type': 'verb', 'word_length': 4},
    {'word': 'way', 'word_type': 'verb', 'word_length': 3},
    {'word': 'people', 'word_type': 'pronoun', 'word_length': 6},
]

get_random_word(unique_word_dicts)
# Might return: "care"
~~~