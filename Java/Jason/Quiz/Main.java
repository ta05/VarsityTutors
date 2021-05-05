public class Main {
    public static void main(String[] args) {
        char[] myAnswers = { 'A', 'B', 'C', 'D', 'B', 'B', 'C', 'C', 'A', 'B' };
        Quiz mathQuiz = new Quiz(myAnswers);

        mathQuiz.gradeQuiz();

        mathQuiz.getScore();
    }
}
