# Fines

In this program you will write two methods

## fine

The fine method accepts *speed_limit*, *my_speed* and *zone* parameters where the *zone* will be None by default. Calculate and return the fine based on the following conditions. By default, the fine assessed will be $6 for each mph over the speed limit. If in a residential or school zone, the fine assessed will be $7 for each mph over the speed limit, and if in a work zone, the fine assessed will be $8 for each mph over the speed limit plus an additional $200 fine. If the driver is over the limit by 20 mph or more, then they are just assessed a $350 fine regardless of zone. Driving under the speed limit is also dangerous, and the driver is assessed a flat $30 fine for driving under the speed limit.

## demerit

The demerit method accepts *speed_limit* and *my_speed* parameter. Calculate and return the demerit points based on the following conditions:

- 3 point demerit if 1-9 mph over the speed limit
- 4 point demerit if 10-19 mph over the speed limit
- 6 point demerit if 20 or more mph over the speed limit