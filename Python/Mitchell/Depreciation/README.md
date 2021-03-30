# Depreciation

Businesses depreciate the value of assetsover several years. If a business purchases a car for $30,000, the car loses value each year. The depreciation schedule determines how fast the asset depreciates.


Businessess use many methods to calculate depreciation. Two common methods are:


**Straight line**. Each year the item loses 1/n of its original value. *n* is the epcected life of the item in years.


**Double-declining balance**. Each year the item loses 2/n of its value at the start of the year. In the final year, the item loses all remaining value.


Prompt the user for 

- An item description
- The estimated life of the item (in years)
- The depreciation method

Calculate and display the depreciation schedule:

## Examples

 - Input

`Description of the item: Computer`

`Cost of the item: 1500`

`Estimated life of the item in whole years: 5`

`Depreciation method (1 - straight line, 2 - double-declining balance): 1`

- Output

`Depreciation schedule for: Computer`

`Year   Begin       Dep     End`
`0      1500.00     0.00    1500.00`
`1      1500.00     300.00  1200.00`
`2      1200.00     300.00  900.00`
`3      900.00      300.00  600.00`
`4      600.00      300.00  300.00`
`5      300.00      300.00  0.00`


 - Input

`Description of the item: Computer`

`Cost of the item: 1500`

`Estimated life of the item in whole years: 5`

`Depreciation method (1 - straight line, 2 - double-declining balance): 2`

- Output

`Depreciation schedule for: Computer`

`Year   Begin       Dep     End`
`0      1500.00     0.00    1500.00`
`1      1500.00     600.00  900.00`
`2      900.00      360.00  540.00`
`3      540.00      216.00  324.00`
`4      324.00      129.60  194.40`
`5      194.40      194.40  0.00`