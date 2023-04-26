# GameSpinner

This question involves the creation and use of a spinner to generate random numbers in a game. A `GameSpinner` object represents a spinner with a given number of sectors, all equal in size. The `GameSpinner` class supports the following behaviors.

- Creating a new spinner with a specified number of sectors.
- Spinning a spinner and reporting the result
- Reporting the length of the *current run*, the number of consecutive spins that are the same as the most recent spin

The following table contains a sample code execution sequence and the corresponding results.

| **Statements and Expressions** | **Value Returned<br>(blank if no<br>value)** | **Comment** |
| :----------------------------- | :----------------------------------: | :---------- |
| `GameSpinner g = new GameSpinner(4);` | | Creates a new spinner with four sectors. |
| `g.currentRun();` | 0 | Returns the length of the current run. The length of the current run is initially `0` because no spins have occurred. |
| `g.spin();` | 3 | Returns a random integer between `1` and `4`, inclusive. In this case, `3` is returned. |
| `g.currentRun();` | 1 | The length of the current run is `1` because there has been one spin of `3` so far. |
| `g.spin();` | 3 | Returns a random integer between `1` and `4`, inclusive. In this case, `3` is returned. |
| `g.currentRun();` | 2 | The length of the current run is `2` because there have been two `3`s in a row. |
| `g.spin();` | 4 | Returns a random integer between `1` and `4`, inclusive. In this case, `4` is returned. |
| `g.currentRun();` | 1 | The length of the current run is `1` because the spin of `4` is different from the value of the spin in the previous run of two `3`s. |
| `g.spin();` | 3 | Returns a random integer between `1` and `4`, inclusive. In this case, `3` is returned. |
| `g.currentRun();` | 1 | The length of the current run is `1` because the spin of `3` is different from the value of the spin in the previous run of one `4`. |
| `g.spin();` | 1 | Returns a random integer between `1` and `4`, inclusive. In this case, `1` is returned. |
| `g.spin();` | 1 | Returns a random integer between `1` and `4`, inclusive. In this case, `1` is returned. |
| `g.spin();` | 1 | Returns a random integer between `1` and `4`, inclusive. In this case, `1` is returned. |
| `g.currentRun();` | 3 | The length of the current run is `3` because there have been three consecutive `1`s since the previous run of one `3`. |