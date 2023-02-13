# ArrayList Methods II

## twoTimes

Create a static method that:
- takes in a single parameter - an `ArrayList<Integer>`
- returns a new `ArrayList<Integers>`

This method should create a new `ArrayList<Integer>` that contains every value of the `ArrayList` parameter repeated twice.

### Sample

`twoTimes([1,5,3,7])` -> `[1,1,5,5,3,3,7,7]`

## removeEveryOther

Create a static method that:
- takes in a single parameter - an `ArrayList<String>`
- returns nothing

The method should take the `ArrayList` parameter and modify it by removing every other element in the list, starting with removing the 0th element.

### Sample

If `list` = `["hi", "yo", "sup", "yolo", "boop"]` and `removeEveryOther(list)` is called, `list` = `["yo", "yolo"]`

## repeatAll

Create a static method that:
- takes in a single parameter - an `ArrayList<Boolean>`
- returns nothing

This method should modify its `ArrayList` parameter by repeating its `ArrayList` values.

### Sample

If `list` = `[true, false, false]` and `repeatAll(list)` is called, `list` = `[true, false, false, true, false, false]`

## appendPosSum

Create a static method that:
- takes in a single parameter - an `ArrayList<Integer>`
- returns an `ArrayList<Integer>`

This method should create a new `ArrayList<Integer>`, add only the positive integers to the new `ArrayList`, sum the positive integers in the new `ArrayList` and add the sum as the last element.

### Sample

`appendPosSum([1, 2, 3, -4, 5])` -> `[1, 2, 3, 5, 11]`

## search

Create a static method that:
- takes in a two parameters - an `ArrayList<String>` and a `String`
- returns `String`

This method will look for an element within `ArrayList` that contains value of the `String` parameter. If it finds an element, the method needs to return the entire element value. If an instance is not found, return: `"search failed"`

### Sample

- `search(["one apple", "two orange", "four banana"], "four")` -> `"four banana"`
  - `search(["hello", "world"], "goodbye")` -> `"search failed"`

## removeInstances

Create a static method that:
- takes in a two parameters - an `ArrayList<Integer>` and an `int`
- returns `ArrayList<Integer>`

This method gets an `ArrayList<Integer>` and an `int` number. It will return a new `ArrayList` that contains all the numbers in the original `ArrayList` parameter but removes all instances of the number parameter.

### Sample

`removeInstances([1,1,1,2,3,1,4])` -> `[2,3,4]`