public class TriviaGame {
    private static int pointTotal = 50;
    public static int userTotal = 0;

    public static void trivia() {
        for (int i = 0; i < Questions.questions.length; i++){
            System.out.println(Questions.questions[i]);
            String answer = TriviaDriver.scanner.nextLine();
            if (answer.equals(Questions.answers[i])){
                System.out.println("Correct!");

                userTotal += Questions.answerPoints[i];
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println("Current Points: " + userTotal);
        }
    }

    public static void main(String[] args) {
        trivia();
    }
}
