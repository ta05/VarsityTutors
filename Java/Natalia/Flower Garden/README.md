# Flower Garden

**Lab Goal:** This lab was designed to teach you more class and methods using `ArrayList` and `String`

## Lab Description

Create a class that stores and `ArrayList` of `Strings`. The `Strings` store two bits of indormations about flowers. They store a count and a name. You will need to use `parseInt`.

- `"14 daisy"` means there are 14 daisies.
- `"01 rose"` means there is 1 rose.

There are numerous methods. In order for this program to work correctly, several of the methods must call orther methods. For this problem, you will need to make a `FlowerGarden` class.

The first and only instance variable will be an `ArrayList<String>`. The `FlowerGarden` class will have one constructor that creates a new `ArrayList`. The `ArrayList` stores `Strings` that store Flower information. Each `String` has a count and a flower name.

The `FlowerGarden` class will have 8 methods.
- `addFlower` adds a new flower to the `ArrayList`.
- `findFlower` will return the position in the `ArrayList` where the flower is found.
- `getCount` method returns how many of the particular flower is in the garden.
- `getFlowerName` returns the flower name at a particular position.
- `maxFlower` method returns the name of the flower that exists the most in the garden.
- `inRange` checks to see if a value in a specified range.
- `toString` will return the `ArrayList` instance variable.

### Runner Code

~~~java
FlowerGarden fg = new FlowerGarden();
fg.addFlower("daisy");
fg.addFlower("rose");
fg.addFlower("poppy");
fg.addFlower("sunflower");
fg.addFlower("daisy");
System.out.println(fg);
System.out.println(fg.findFlower("daisy"));
System.out.println(fg.findFlower("orchid"));
System.out.println(fg.getCount("daisy"));
System.out.println(fg.getCount("orchid"));
System.out.println(fg.getFlowerName(0));
System.out.println(fg.getFlowerName(9));
System.out.println(fg.maxFlower());
fg.addFlower("daisy");
fg.addFlower("daisy");
fg.addFlower("rose");
fg.addFlower("poppy");
fg.addFlower("daisy");
fg.addFlower("lily");
fg.addFlower("lily");
fg.addFlower("gardenia");
fg.addFlower("rose");
fg.addFlower("poppy");
fg.addFlower("gardenia");
fg.addFlower("daisy");
fg.addFlower("lily");
System.out.println(fg);
System.out.println(fg.findFlower("lily"));
System.out.println(fg.findFlower("orchid"));
System.out.println(fg.getCount("daisy"));
System.out.println(fg.getCount("orchid"));
System.out.println(fg.getFlowerName(3));
System.out.println(fg.getFlowerName(15));
System.out.println(fg.maxFlower());
~~~

### Sample Output

~~~
[01 rose, 01 poppy, 01 sunflower, 02 daisy]
3
-1
2
0
rose
out of range
02 daisy
[01 sunflower, 03 rose, 03 poppy, 02 gardenia, 06 daisy, 03 lily]
5
-1
6
0
gardenia
out of range
06 daisy
~~~