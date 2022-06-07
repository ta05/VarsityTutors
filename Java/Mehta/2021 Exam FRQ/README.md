## Question 1

This question involves the `WordMatch` class, which stores a secret string and provides methods thatcompare other strings to the secret string. You will write two methods in the `WordMatch` class.

~~~java
public class WordMatch {
    /**The secret string.*/
    private String secret;
    
    /**Constructs a WordMatch object with the given secret string of lowercase letters.*/
    public WordMatch(String word) {
        /*implementation not shown*/
    }
    
    /** Returns a score for guess,as described in part(a).
     * Precondition:0 < guess.length() <= secret.length()
     */
    
    public int scoreGuess(String guess) { 
        /*to be implemented in part(a)*/
    }
    
    /** Returns the better of two guesses, as determined by scoreGuess and the rules for a tie-breaker that are described in part(b)
     * Precondition: guess1 and guess2 contain all lowercase letters. guess1 is not the same as guess2.
     */
    
    public String findBetterGuess(String guess1, String guess2) {
        /*to be implemented in part(b)*/
    }
}
~~~

### (a)

Write the `WordMatch` method `scoreGuess`. To determine the score to be returned, `scoreGuess` finds the number of times that `guess`. Occurrences of `guess` may overlap within `secret`.

Assume that the length of `guess` is less than or equal to the length of `secret` and that `guess` is not an empty string.

The following examples show declarations of a `WordMatch` object. The tables show the outcome of some possible calls to the `scoreGuess` method.

`WordMatch game = new WordMatch("mississippi");`

| **Value of** `guess` | **Number of Substring Occurrences** | **Score Calculation**: (**Number of Substring Occurrences**) x (**Square of the Length of** `guess`) | **Return Value of** `game.scoreGueass(guess)` |
|:-----:|:-------:|:-------:|:--------:|
| `"i"` | 4 | `4 * 1 * 1 = 4` | `4` |
| `"iss"` | 2 | `2 * 3 * 3 = 18` | `18` |
| `"issipp"` | 1 | `1 * 6 * 6 = 36` | `36` |
| `"mississippi"` | 1 | `1 * 11 * 11 = 121` | `121` |

`WordMatch game = new WordMatch("aaaabb");`

| **Value of** `guess` | **Number of Substring Occurrences** | **Score Calculation**: (**Number of Substring Occurrences**) x (**Square of the Length of** `guess`) | **Return Value of** `game.scoreGueass(guess)` |
|:-----:|:-------:|:-------:|:--------:|
| `"a"` | 4 | `4 * 1 * 1 = 4` | `4` |
| `"aa"` | 3 | `3 * 2 * 2 = 12` | `12` |
| `"aaa"` | 2 | `2 * 3 * 3 = 18` | `18` |
| `"aabb"` | 1 | `1 * 4 * 4 = 16` | `16` |
| `"c"` | 1 | `0 * 1 * 1 = 0` | `0` |

Complete the `scoreGuess` method.

~~~java
/** Returns a score for guess, as described in part(a).
  * Precondition:  0 < guess.length() <= secret.length()
  * */

`public int scoreGuess(String guess)`
~~~

### (b)

Write the `WordMatch` method `findBetterGuess`, which returns the better guess of its two `String` parameters, `guess1` and `guess2`. If the `scoreGuess` method returns different values for `guess1` and `guess2`, then the guess with the higher score is returned. If the `scoreGuess` method returns the same value for `guess1` and `guess2`, then the alphabetically greater guess is returned.

The following example shows a declaration of a `WordMatch` object and the outcomes of some possible calls to the `scoreGuess` and `findBetterGuess` methods.

`WordMatch game = new WordMatch("concatenation");`

| **Method Call** | **Return Value** | **Explanation** |
| :---- | :-----: | :--- |
| `game.scoreGuess("ten");` | `9` | `1 * 3 * 3` |
| `game.scoreGuess("nation");` | `36` | `1 * 6 * 6` |
| `game.findBetterGuess("ten", "nation");` | `"nation"` | Since `scoreGuess` returns `36` for `"nation"` and `9` for `"ten"`, the guess with the greater score, `"nation"`, is returned. |
| `game.scoreGuess("con");` | `9` | `1 * 3 * 3` |
| `game.scoreGuess("cat");` | `9` | `1 * 3 * 3` |
| `game.findBetterGuess("con", "cat");` | `"con"` | Since `scoreGuess` returns `9` for both `"con"` and `"cat"`, the alphabetically greater guess, `"con"`, is returned. |

Complete method `findBetterGuess`.

Assume that `scoreGuess` works as specified, regardless of what you wrote inpart (a). You must use `scoreGuess` appropriately to receive full credit.

~~~java
/** Returns the better of two guesses, as determined by scoreGuess and the rules for a tie-breaker that are described in part(b)
 * Precondition: guess1 and guess2 contain all lowercase letters. guess1 is not the same as guess2.
 * */

public String findBetterGuess(String guess1, String guess2)
~~~

## Question 3

A high school club maintains information about its members in a `MemberInfo` object. A `MemberInfo` object stores a club member's name, year of graduation, and whether or not the club member is in *good standing*. A member who is in good stading has fulfilled all the responsibilities of a membership.

A partial declaration of the `MemberInfo` class is shown below

~~~java
public class MemberInfo {

    /** Constructs a MemberInfo object for the club member with name name,
     * graduation year gradYear, and standing hasGoodStanding.
     * */
    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        /* implementation not shown */
    }

    /** Returns the graduation year of the club member. */
    public int gradYear() {
        /* implementation not shown */
    }

    /** Returns true if the member is in good stading and false otherwise. */
    public boolean inGoodStanding() {
        /* implementation not shown */
    }

    // There may be instance variables, constructors, and methods that are not shown.
}
~~~

The `ClubMembers` class maintains a list of current club members. The declaration of the `ClubMembers` class is shown below.

~~~java
public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    /** Adds new club members to memberList, as described in part (a)
     * Precondition: names is a non-empty array.
     * */
    public void addMembers(String[] names, int gradYear) {
        /* to be implemented in part (a) */
    }

    /** Removed members who have graduated and returns a list of members who have graduated
     * and are in good standing, as described in part (b)
     * */
    public ArrayList<MemberInfo> removeMembers(int year) {
        /* to be implemented in part (b) */
    }

    // There may be instance variables, constructors, and methods that are not shown.
}
~~~

### (a)

Write the `ClubMembers` method `addMembers`, which takes two parameters. The first parameter is a `String` array containing the names of new club members to be added. The second parameter is the graduation year of all the new club members. The method adds the new members to the `memberList` instance variable. The names can be added in any order. All members added are initially in good standing and share the same graduation year, `gradYear`.

Complete the addMembers method.

~~~java
/** Adds new club members to memberList, as described in part (a)
 * Precondition: names is a non-empty array.
 * */
public void addMembers(String[] names, int gradYear)
~~~

### (b)

Write the `ClubMembers` method `removeMembers`, which takes the following actions.
- Returns a list of all students who have graduated and are in good standing. A member has graduated if the member's graduation year is less than or equal to the method's `year` parameter. If no members meet these criteria, an empty list is returned.
- Removes from `memberList` all members who have graduates, regardless of whether or not they are in good standing.

The following example illustrates the results of a call to `removeMembers`

The `ArrayList memberList` <u>before</u> the method call `removeMembers(2018)`:

| `"SMITH, JANE" 2019 false` | `"FOX, STEVE" 2018 true` | `"XIN, MICHAEL" 2017 false` | `"GARCIA, MARIA" 2020 true` |
| :----: | :----: | :----: | :----: |

The `ArrayList memberList` <u>after</u> the method call `removeMembers(2018)`:

| `"SMITH, JANE" 2019 false` | `"GARCIA, MARIA" 2020 true` |
| :----: | :----: |

The `ArrayList memberList` <u>returned by</u> the method call `removeMembers(2018)`:

| `"FOX, STEVE" 2018 true` |
| :----: |

Complete the `removeMembers` method.

~~~java
/** Removed members who have graduated and returns a list of members who have graduated
 * and are in good standing, as described in part (b)
 * */
    public ArrayList<MemberInfo> removeMembers(int year)
~~~