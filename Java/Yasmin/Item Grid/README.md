# FRQ Item Grid

This question uses two classes: an `Item` class that represents an item that has a name and value and an `ItemGrid` class that manages a two-dimensional array of items. A definition of the `Item` class is shown below.

~~~java
public class Item {
    private String name;
    private int value;

    public Item(String itemName, int itemValue) {
        name = itemName;
        value = itemValue;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
~~~

The `ItemGrid` class below uses the two-dimensional array grid to represent a group of `Item` objects.

~~~java
public class ItemGrid {

    private Item[][] grid;

    // Constructor not shown
    /** Returns true if xPos is a valid row index and yPos is a valid
    * column index and returns false otherwise.
    */

    public boolean isValid(int xPos, int yPos)
    { /* implementation not shown */ }

    /** Compares the item in row r and column c to the items to its
    * left and to its right. Returns the name of the item with
    * the greatest value, as described in part (a).
    * Precondition: r and c are valid indices
    */
    public String mostValuableNeighbor(int r, int c)
    { /* to be implemented in part (a) */ }

    /** Returns the average value of all the items in grid,
    * as described in part (b).
    */
    public double findAverage()
    { /* to be implemented in part (b) */ }
}
~~~

## Part a

Write the `mostValuableNeighbor` method, which compares the item in row `r` and column `c` to the items to its left and to its right. The method determines which of the three items has the greatest value and returns its name. If more than one of the values have a value that is greatest, then any of their names can be returned. If the item has no item to its left, it is compared only to the item to its right. If the item has no item to its right, it is compared only to the item to its left.

The helper method `isValid` has been provided. The `isValid` method returns `true` if `xPos` is a valid row index and `yPos` is a valid column index in the two-dimensional array grid, and returns `false` otherwise.

Assume that the `ItemGrid` object `ig` has been created such that the two-dimensional array grid contains the following item objects.

|| 0 | 1 | 2 | 3 |
|-|:-:|:-:|:-:|:-:|
|**0**|"acorn"<br>7|"book"<br>10|"carrot"<br>8|"desk"<br>9|
|**1**|"egg"<br>5|"flag"<br>8|"globe"<br>8|"harp"<br>9|
|**2**|"island"<br>7|"jacket"<br>19|"kale"<br>8|"lunch"<br>16|

The following table shows some examples of the behavior of the `mostValuableNeighbor` method.

| **Method Call** | **Return Value** | **Explanation** |
| :-------------- | :--------------: | :-------------- |
| `ig.mostValuableNeighbor(0, 2)` | `"book"` | The item at row `0`, column `2` (`"carrot"`) is compared with the items to its left and right (`"book"` and `"desk"`). Of the three items, `"book"` has the greatest value (`10`) |
| `ig.mostValuableNeighbor(1, 1)` | `"flag"` `"globe"` | The item at row `1`, column `1` (`"globe"`) is compared with the items to its left and right (`"egg"` and `"globe"`). Of the three items, both `"flag"` and `"globe"` have the greatest value (`8`), so either can be returned |
| `ig.mostValuableNeighbor(2, 0)` | `"jacket"` | The item at row `2`, column `0` (`"island"`) has no item to its left, so it is only compared with the item to its right (`"jacket"`). Of the two items, `"jacket"` has the greatest value (`19`) |
| `ig.mostValuableNeighbor(2, 3)` | `"lunch"` | The item at row `2`, column `3` (`"island"`) has no item to its right, so it is only compared with the item to its left (`"kale"`). Of the two items, `"lunch"` has the greatest value (`19`) |

Complete the `mostValuableNeighbor` method below. You must use `isValid` appropriately to receive full credit. Assume the grid has been initialized with at least three rows and three columns and contains no null elements.

~~~java
/** Compares the item in row r and column c to the items to its
* left and to its right. Returns the name of the item with
* the greatest value, as described in part (a).
* Precondition: r and c are valid indices
*/
public String mostValuableNeighbor(int r, int c)
~~~

# Part b

Write the `findAverage` method which returns the average value of all items in the grid. For example, for the `ItemGrid` object `ig` in part (a), the `findAverage` method should return 9.5, which is the average value of the twelve items in the 2D array.

~~~java
/** Returns the average value of all the items in grid,
* as described in part (b).
*/
public double findAverage()
~~~