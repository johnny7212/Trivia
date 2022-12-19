import java.util.Random;

public class TriviaGame {
    private static int userStreak = 0;
    private static int userTotal = 0;
    private static int numCorrect = 0;

    public static void trivia() {
        Random random = new Random();

        for (int i = 0; i < Questions.questions.length; i++){
            System.out.println("Question #" + (i+1));
            System.out.println(Questions.questions[i].);
            String answer = TriviaDriver.scanner.nextLine();
            if (answer.equals(Questions.questions[i].)){
                System.out.println("Correct!");
                userStreak++;
                numCorrect++;
                userTotal += Questions.;
            } else {
                System.out.println("Incorrect!");
                userStreak = 0;
            }
            System.out.println("Current Points: " + userTotal + "\n Current Streak: " + userStreak);
        }
        double getScore = userTotal / 50;
        System.out.println("Overall Stats: " +
                "\n You got " + numCorrect + " questions out of 12 correct!" +
                "\n Congrats! You got a " + getScore + "% score!");
    }


    public static void main(String[] args) {
        trivia();
    }
}
