# Orders

## Cookie Order

An organization raises money by selling boxes of cookies. A cookie order specifies the variety of cookie and the number of boxes ordered. The declaration of the `CookieOrder` class is shown below:

~~~java
public class CookieOrder
{
 /** Constructs a new CookieOrder object */
 public CookieOrder(String variety, int numBoxes)
 { /* implementation not shown */ }

 /** @return the variety of cookie being ordered
 */
 public String getVariety()
 { /* implementation not shown */ }

 /** @return the number of boxes being ordered
 */
 public int getNumBoxes()
 { /* implementation not shown */ }

 // There may be instance variables, constructors, and methods that are not shown.
}
~~~

The `MasterOrder` class maintains a list of the cookies to be purchased. The declaration of the `MasterOrder` class is shown below:

~~~java
public class MasterOrder
{
 /** The list of all cookie orders */
 private List<CookieOrder> orders;

 /** Constructs a new MasterOrder object */
 public MasterOrder()
 { orders = new ArrayList<CookieOrder>(); }

 /** Adds theOrder to the master order.
 *   @param theOrder the cookie order to add to the master order
 */
 public void addOrder(CookieOrder theOrder)
 { orders.add(theOrder); }

 /** @return the sum of the number of boxes of all of the cookie orders
 */
 public int getTotalBoxes()
 { /* to be implemented in part (a) */ }

 // There may be instance variables, constructors, and methods that are not shown.
}
~~~

### Part A

The `getTotalBoxes` method computes and returns the sum of the number of boxes of all cookie orders. If there are no cookie orders in the master order, the method returns `0`.

### Part B

The `removeVariety` method updates the master order by removing all of the cookie orders in which the variety of cookie matches the parameter `cookieVar`. The master order may contain zero or more cookie orders with the same variety as `cookieVar`. The method returns the total number of boxes removed from the master order.

For example, consider the following code segment:

~~~
MasterOrder goodies = new MasterOrder();
goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
goodies.addOrder(new CookieOrder("Shortbread", 5));
goodies.addOrder(new CookieOrder("Macaroon", 2));
goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
~~~

After the code segment has executed, the contents of the master order are as shown in the following table.

| "Chocolate Chip" | "Shortbread" | "Macaroon" | "Chocolate Chip" |
| :--------------: | :----------: | :--------: | :--------------: |
| 1 | 5 | 2 | 3 |

The method call `goodies.removeVariety("Chocolate Chip")` returns `4` because there were two Chocolate Chip cookie orders totaling 4 boxes. The master order is modified as shown below.

| "Shortbread" | "Macaroon" |
| :----------: | :--------: |
| 5 | 2 |

The method call `goodies.removeVariety("Brownie")` returns `0` and does not change the master order.

## Distribution and Weekly Orders

### Distribution Order

Create class `DistributionOrder`. A `DistributionOrder` has instance fields for the name of the company placing the order and a `MasterOrder` (which contains the other order details). Do you see the *composition* in this class? A `DistributionOrder` *has* a `MasterOrder`.

The constructor for this class takes in the company's name and order. This class should have accessor methods and a `toString`.

### Weekly Orders

Create class `WeeklyOrders`. This class uses an `ArrayList` (that is always sorted by the company name) to keep track of all the `DistributionOrders` placed. This class should have the following methods:
- `WeeklyOrders()`: allocates space for the `ArrayList`
- `void add(DistributionOrder d)`: When a new order is placed, it must be added to the list in the proper position so that the list is still alphabetized.
- `boolean alreadyPlacedOrder(String company)`: retruns `true` if the company has already placed an order and `false` if not.
- `int numberOfOrders(String company)`: returns the number of orders the company has placed.
- `int totalNumberOfBoxesOrdered(String company)`: returns the total number of boxes of cookies that have been ordered by the company during the week.
- `int totalNumberOfBoxesOrdered()`: returns the total number of boxes that have been ordered for the week.
- `void cancel(String cookieVariety)`: deletes any orders for `cookieVariety` in all of the orders.