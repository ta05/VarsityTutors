# FRQ Lights Out

The lights out game is played on a grid of size *m* by *n*. At the start of the game, squares are randomly chosen to be **on** or *off*. When a sqare is activated, the light on that square and the four surrounding squares will toggle on or off. THe goal of the game is to **turn all lights off** in as few moves as possible.

~~~java
public class Board {
    /** The lights on the board where true represents on and false represents off
     */
    private boolean[][] lights;

    /**
     * Constructs a Board object, with nRows rows and nCols columns
     * Precondition nRows > 0 and nCols > 0
     * Postcondition each light is randomly set to on or off
     */
    public Board(int nRows, int nCols)
    {/* to be implemented in part a*/}

    /** Changes the status of lights and then returns the number of lights that remain on
     * given that square at rowNum and column colNum was pressed
     * Precondition - rowNum and colNum are valid indices in lights
     */
    public int pushButton(int rowNum, int colNum)
    {/* to be implemented in part b */}

    // There may be additional instance variables, constructors, and method not shown
}
~~~

## Part a

Write the constructor for the `Board` class, which initializes lights such that each light is randomly asigned to be on or off.

~~~java
/**
 * Constructs a Board object, with nRows rows and nCols columns
 * Precondition nRows > 0 and nCols > 0
 * Postcondition each light is randomly set to on or off
 */
public Board(int nRows, int nCols)
~~~

## Part b

Complete the method `pushButton`, which changes the status of the button pushed, as well as the adjacent buttons.

### Example

Given the following lights:

|| 0 | 1 | 2 | 3 | 4 |
|-|:-:|:-:|:-:|:-:|:-:|
|**0**|true|false|false|true|false|
|**1**|true|true|false|false|true|
|**2**|false|false|true|true|true|
|**3**|false|false|false|false|true|
|**4**|true|false|true|false|false|

`pushButton(0, 3)` will change the lights to

|| 0 | 1 | 2 | 3 | 4 |
|-|:-:|:-:|:-:|:-:|:-:|
|**0**|true|false|true|false|true|
|**1**|true|true|false|true|true|
|**2**|false|false|true|true|true|
|**3**|false|false|false|false|true|
|**4**|true|false|true|false|false|

And then return `13`.

~~~java
/** Changes the status of lights and then returns the number of lights that remain on
 * given that square at rowNum and column colNum was pressed
 * Precondition - rowNum and colNum are valid indices in lights
 */
public int pushButton(int rowNum, int colNum)
~~~
