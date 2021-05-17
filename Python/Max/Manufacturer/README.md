# Electronics Store

You will design a program that manages the inventory of an electronincs store. You need to use a number of concepts that you learned in class: including classes, dictionaries, input and output of comma delimited csv files.  

*Input*:

1. ManufacturerList.csv -- contains items listed by row. Each row contains an item ID, manufacturer name, item type and optionally a damaged indicator.
2. PriceList.csv -- contains items listed by row. Each row contains an item ID and the item price.
3. ServiceDatesList.csv -- contains items listed by row. Each rows contains an item ID and service date.  

Example ManufacturerList.csv, PriceList.csv and ServiceDatesList.csv are provided for reference. Your code will be expected to work with any group input files of the appropriate format. Manufacturer can and will likely be different as will the items. The code should determine the actual date when it is run and use that to determine the items that are past their service dates.

## Interactive Inventory Query Capability

Query the user of an item by asking for a manufacturer and item type. This should be one query on a single line.  
Print a message("No such item in inventory") if either the manufacturer or the item type are not in the inventory. Ignore any other words, so "nice Apple computer" is treated the same as "Apple computer".  
Print "Your item is: " with the item ID, manufacturer name, item type and price on one line. Do not provide items that are past their service date or damages. if there is more than one item, provide the most expensive item.  
Also print "You may also consider: " and print information about the same item type from another manufacturer that is closest in price to the recommended item. Only prints this if the same item from another manufacturer is in the inventory and is not damaged or past its service date.  
After output for one query, query the user again. Allow 'q' to quit.