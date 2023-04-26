# StepTracker

This question involves the implementation of a fitness tracking system that is represented by the `StepTracker` class. A `StepTracker` object is created with a parameter that represents the number of steps that must be taken for a day to be considered *active*

The `StepTracker` class provides a constructor and the following methods.
- `addDailySteps`, which accumulates information about steps, in readings taken once per day
- `activeDays`, which returns the number of active days
- `averageSteps`, which returns the average number of steps per day, calculated by dividing the total number of steps taken by the number of days tracked


The following table contains a sample code execution sequence and the corresponding results.

| **Statements and Expressions** | **Value Returned<br>(blank if no<br>value)** | **Comment** |
| :----------------------------- | :----------------------------------: | :---------- |
| `StepTracker tr = new StepTracker(10000);` | | Days with at least 10,000 steps are considered active. Assume that the parameter is positive. |
| `tr.activeDays();` | `0` | No data have been recorded yet. |
| `tr.averageSteps();` | `0.0` | When no step data have been recorded, the `averageSteps` method returns `0.0`. |
| `tr.addDailySteps(9000);` | | This is too few steps for the day to be considered active. |
| `tr.addDailySteps(5000);` | | This is too few steps for the day to be considered active. |
| `tr.activeDays();` | `0` | No day had at least 10,000 steps. |
| `tr.averageSteps();` | `7000.0` | The average number of steps per day is (14000 / 2). |
| `tr.addDailySteps(13000);` | | This represents an active day. |
| `tr.activeDays();` | `1` | Of the three days for which step data were entered, one day had at least 10,000 steps. |
| `tr.averageSteps();` | `9000.0` | The average number of steps per day is (27000 / 3). |
| `tr.addDailySteps(23000);` | | This represents an active day. |
| `tr.addDailySteps(111);` | | This is too few steps for the day to be considered active. |
| `tr.activeDays();` | `2` | Of the five days for which step data were entered, two days had at least 10,000 steps. |
| `tr.averageSteps();` | `10222.2` | The average number of steps per day is (51111 / 5). |

Write the complete `StepTracker` class, including the constructor and any required instance variables and methods. Your implementation must meet all specifications and conform to the example.