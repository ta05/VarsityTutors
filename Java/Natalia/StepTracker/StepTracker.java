public class StepTracker {
    private int stepThreshold;
    private int totalSteps;
    private int totalDays;
    private int activeDays;

    public StepTracker(int steps) {
        stepThreshold = steps;
        totalSteps = totalDays = activeDays = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;
        if (steps >= stepThreshold) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        return totalDays == 0 ? 0 : totalSteps/totalDays;
    }
}
