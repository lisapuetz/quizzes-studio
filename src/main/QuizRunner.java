package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion( "What does a dog say?\nA: Bark\nB: Quack", "A");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        CheckBoxQuestion myCheckBoxQ = new CheckBoxQuestion("Select all that apply. Which animals can fly?\nA: Penguins\nB: Parrots\nC: Doves", "B,C");
        myQuiz.addQuestion(myCheckBoxQ);

        TrueFalseQuestion myTrueFalseQ = new TrueFalseQuestion("True or false, doves can fly?", "True");
        myQuiz.addQuestion(myTrueFalseQ);

        myQuiz.runQuiz();
    }
}
