/* Rewrite the following if statements 
*  Write the following as if statements
*/
public class Assignment1 {
    public static void main(String args[]) {
        String grade;
        int score = 99;

        if(score >= 90)
            grade = "A";
        else {
            if (score >= 80)
                grade = "B";
            else {
                if (score >= 75)
                    grade = "C";
                else {
                    if (score >= 70)
                        grade = "D";
                    else
                        grade = "F";
                }
            }
        }
        System.out.println("Your score was a " + score + "\nGrade: " + grade);
    }
}
