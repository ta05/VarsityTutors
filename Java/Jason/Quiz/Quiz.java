public class Quiz {
    private char[] solutions = { 'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B' };
    private char[] studentAnswers;
    private int totalCorrect = 0;
    private int totalIncorrect = 0;

    // Constructor receives a char array and assigns the data to the studentAnswers
    public Quiz(char[] studentAns) {
        studentAnswers = new char[studentAns.length];
        for (int i = 0; i < studentAnswers.length; i++)
            studentAnswers[i] = studentAns[i];
    }

    // Constructor receives two char arrays: assigns the studentAns data to studentAnswers and the
    // solutions answers to solutions
    public Quiz(char[] studentAns, char[] solutions) {
        studentAnswers = new char[studentAns.length];
        for (int i = 0; i < studentAnswers.length; i++)
            studentAnswers[i] = studentAns[i];
        this.solutions = new char[solutions.length];
            for (int i = 0; i < solutions.length; i++)
            solutions[i] = solutions[i];
    }

    // The gradeQuiz method compares the student's answers to the solutions and updates the total
    // correct and incorrect answers
    public void gradeQuiz() {
        for (int i = 0; i < studentAnswers.length; i++) {
            if (studentAnswers[i] == solutions[i])
                totalCorrect++;
            else
                totalIncorrect++;
        }
    }
    
    public int getCorrect() {
        return totalCorrect;
    }

    public int getInorrect() {
        return totalIncorrect;
    }

    // Prints a string "Your score is ", the score in percentage as an integer and the string percent
    public void getScore() {
        System.out.printf("Your score is %.0f%%.", (totalCorrect * 100.0)/(totalCorrect + totalIncorrect));
    }
}
