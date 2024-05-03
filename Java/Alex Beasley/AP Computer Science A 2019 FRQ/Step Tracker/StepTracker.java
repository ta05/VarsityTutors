public class StepTracker {
    private int totalSteps;
    private int minStepsActiveDay;
    private int totalDays;
    private int activeDays;

    public StepTracker(int steps) {
        minStepsActiveDay = steps;
    }

    public void addDailySteps(int steps) {
        totalDays++;
        totalSteps += steps;
        if (steps >= minStepsActiveDay) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        return totalSteps / totalDays;
    }
}