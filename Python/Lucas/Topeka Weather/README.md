# Topeka Typical Meteorological Year

In this problem we will explore data from a "Typical Meteorological Year" (<u>TMY</u>) weather file. These files can be used by farmers, weather forecasts, and climate modelers. Engineers also use data like this to design and analyze heating, ventilation, and air conditioning (HVAC) systems for buildings using sucj data for that location. Specifically, the data you will use comes from KU Civil, Environmental & Architectural Engineering Professor Brian Rock:

http://www.people.ku.edu/~hvacman/courses/TOPEKA.TMY

The data consists of hourly measurements of selected meteorological data from Topeka, KS for an entire "typical" year ($24 times 365 = 8760$ rows). There are five data fields per row:

| `HOY` | `pressure` | `Tdb` | `Twb` | `Tdp`

where

- `HOY` is an index representing the hour of the year (from 1 to 8760).
- pressure is the air pressure in pounds per square inch (psi).
- Tdb is the outdoor air temperature in degrees F (technically, the dry bulb temperature).
- Twb is the outdoor bulb temperature in degrees F
- Tdp is the outdoor dew point temperature in degrees F.

For this problem, we will be answering some questions about the outside air temperature and printing that data versus time.

1. What is the minimum outside air temperature? What is the maximum outside air temperature?
2. Use matplotlib to plot the outside air temperature versus the hour of the year. Label both axes and give your figure a title. Importantly, change the ticks on the x-axis to be the months of the year (JAN, FEB, ...) placed at the locations corresponding to (January 1, February 1, ...)

Here are some hints for this data set:

1. Use wget to load the data into your Colab space.
2. Load the data into a pandas dataframe using pd.read_csv
3. The data has no header, so add names as used above (you did this in LA B).
4. The data is separate by multiple spaces, so you should use these optional arguments: `sep=" ", skipinitialspace=True`

5. Use `describe()` to find the minimum and maximum outside air temperatures.
6. You can plot from pandas dataframes easily using a pattern like this: `plt.plot("HOY", "Tdb", data=df)`

7. You can change figure size using a pattern like this: `plt.figure(figsize=(16,9))`

8. Use `plt.savefig('TMY.jpg')` to save your figure.
9. Look at the documentation for [xticks](https://matplotlib.org/stable/api/_as_gen/matplotlib.pyplot.xticks.html) to see how to set tick locations and names.