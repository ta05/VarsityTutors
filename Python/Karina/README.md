# Lab 4

## Problem 3 - Toll

Toll roads have different fees based on the time of day and day of the week. Write a function `calc_toll()` that has three parameters: the current hour of time (int), whether the time is morning (boolean), and whether the day is a weekend (boolean). The function returns the correct toll fee (float) based on the chart below.  


**Weekday Tolls**  

- Before 7:00 am: $1.15
- 7:00 am to 9:59 am: $2.95
- 10:00 am to 2:59 pm: $1.90
- 3:00 pm to 7:59 pm: $3.95
- 8:00 pm and after: $1.40

**Weekend Tolls**  

- Before 7:00 am: $1.05
- 7:00 am to 7:59 pm: $2.15
- 8:00 pm and after: $1.10

Ex: The function calls below, with the given arguments, will return the following toll fees:  

- `calc_toll(8, True, False)` returns `2.95`
- `calc_toll(1, False, False)` returns `1.90`
- `calc_toll(3, False, True)` returns `2.15`
- `calc_toll(5, True, True)` returns `1.05`