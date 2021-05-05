# Quiz

Write a Quiz class with the following attributes:

- *solutions*: a char array that holds the correct answers to the quiz.
- *studentAnswers*: a char array that holds the student's answers to the quiz.
- *totalCorrect*: an int variable that holds the total number of correctly answered questions.
- *totalIncorrect*: an int variable that holds the total number of incorrectly answered questions.

The Quiz class also contains the following methods:

- `Quiz`: The constructor receives a char array and assigns the data to the *studentAnswers*
- `gradeQuiz`: The method compares student's answers with the correct answers and updates the *totalCorrect* and *totalIncorrect*
- `getTotalCorrect`: The method returns the total number of correctly answered questions
- `getTotalIncorrect`: The method returns the total number of incorrectly answered questions
- `getScore`: The method prints a string "Your score is {score in percentage}%"