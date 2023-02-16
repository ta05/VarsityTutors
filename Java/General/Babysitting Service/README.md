# Babysitting Service

This question involves a system to maintain a babysitting service. Babysitters are represented by the following `Babysitter` class.

~~~java
public class Babysitter {
    /** Constructs a new Babysitter object */
    public Babysitter(String name, int exp)
    {   /* implementation not shown */  }

    /** Returns the name of this babysitter */
    public String getName()
    {   /* implementation not shown */  }

    /** Returns the number of years of experience of this babysitter */
    public int getYears()
    {   /* implementation not shown */  }

    // There may be instance variables, constructors, and methods that are not shown.
}
~~~

A babysitting service manages babysitters through a `BabysitterService` object which contains a list of babysitters. You will write two methods in the `BabysitterService` class.

~~~java
public class BabysitterService {
    /** A list of the babysitters available through this service
     * The list is guarantterd not to be null and to contain only non-null entries
     */
    private ArrayList<Babysitter> sitterList;

    /** Adds new babysitters to the list of babysitters, avoiding duplicates, as described in
     * part (a)
     */
    public void addNewSitters(String[] names)
    {   /* to be implemented in part (a) */  }

    /** Returns a list of babysitters for whom the babysitter charge for the given number of 
     * children and hours is within the given budget, as described in part (b)
     */
    public ArrayList<Babysitter> affordableSitters(double budget, int numChildren, int hours)
    {   /* to be implemented in part (b) */  }

    // There may be instance variables, constructors, and methods that are not shown.
}
~~~

## Part a

Write the `BabysitterService` method `addNewSitters`, which has a parameter an array of strings representing the names of new babysitters to be added to the service. The following actions are taken for each name in the array of babysitter names:

- If a babysitter with the name already appears in the `sitterList`, no action is taken.
- If a babysitter with the name is not found in `sitterList`, a new `Babysitter` object is created and added to the `sitterList`. The new babysitter has zero years of experience.

For example, assume that `smartSitter` has been declared as a `BabysitterService` object and `ArrayList sitterList` contains the following babysitters.

| "Joe" | "Holly" | "Jayna" |
| :---: | :-----: | :-----: |
| 3 | 1 | 2 |

Assume that `newNames` is a `String` arrat containing "Cora" and "Joe". Then the `ArrayList sitterList` after the method call `smartSitter.addNewSitters(newNames)` should contain the following babysitters:

| "Joe" | "Holly" | "Jayna" | "Cora" |
| :---: | :-----: | :-----: | :----: |
| 3 | 1 | 2 | 0 |

Complete method `addNewSitters`.

~~~java
    /** Adds new babysitters to the list of babysitters, avoiding duplicates, as described in
     * part (a)
     */
    public void addNewSitters(String[] names)
~~~

## Part b
Write the `BabysitterService` method `affordableSitters`. The method returns an `ArrayList` of babysitters for whom the babysitting charge would be an amount less than or equal to the specified budget for the given number of children and the given number of hours. The amount charged for babysitting services is calculated according to the following rules:

- A babysitter with no years of experience charges **$2** per child per hour.
- For every year of experience that a babysitter has up to four years of experience, the babysitter charges an additional **$1** per child per hour. There is a maximum total charge of **$6** per child per hour.

The following table provides some examples of the calculation of babysitting charges.

| **Years of Experience** | **Number of children** | **Number of Hours** | **Total Charge** |
| :---------------------: | :--------------------: | :-----------------: | :--------------: |
| 0 | 3 | 2 | **$2** x **3** children x **2** hours = **$12** |
| 3 | 3 | 2 | **$5** x **3** children x **2** hours = **$30** |
| 5 | 3 | 2 | **$6** x **3** children x **2** hours = **$36** |


Complete method `affordableSitters`.

~~~java
    /** Returns a list of babysitters for whom the babysitter charge for the given number of 
     * children and hours is within the given budget, as described in part (b)
     */
    public ArrayList<Babysitter> affordableSitters(double budget, int numChildren, int hours)
~~~