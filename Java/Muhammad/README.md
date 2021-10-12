# Get Flag

## Overview

`getFlag(int size, char color1, char color2, char color3)` returns a String where a triangle appears on the left side of the diagram, followed by horizontal lines. For example, calling getFlag(9, 'R', '.', 'Y') will return the following String:


`R............................................`  
`RRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`RRRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`RRRRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`RRRRRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`RRRRRRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`RRRRRRRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`RRRRRRRRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`RRRRRRRRR....................................`  
`RRRRRRRRR....................................`  
`RRRRRRRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`RRRRRRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`RRRRRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`RRRRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`RRRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`RRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`RYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY`  
`R............................................`


The diagram has a number of rows that corresponds to **size * 2** and a number of columns that corresponds to **size * 5**. The first and last row will use `color2` (except for the first character that will use `color1`). THe center two rows will use `color1` and the rest, `color3`. The triangle will rely on `color1` and will have a number of rows corresponding to **size * 2**. If the **size** parameter is less than three, the method will return null and will not generate any diagram. For this method, you can assume the colors are valid. The method MUST NOT rely on System.out.println().