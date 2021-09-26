package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

     public Quiz() {}

    public void addQuestion(Question question) {
         this.questions.add(question);
    }

    public void runQuiz() {
         for (Question question : questions) {
             System.out.println(question.getTheQuestion());
             String userAnswer = this.getUserAnswer();
             boolean userGotQuestionCorrect = question.checkAnswer(userAnswer);
             if (userGotQuestionCorrect) {
                 this.numberOfQuestionsCorrect++;
             }
         }
         double percentCorrect = ((double) this.numberOfQuestionsCorrect/(double) this.questions.size()) * 100;
         System.out.println("Grade: " + percentCorrect + "%");
    }

    public String getUserAnswer() {
         String userAnswer = scanner.nextLine();
         return userAnswer;
    }
}
