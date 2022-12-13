import java.util.Scanner;

public class TriviaDriver {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("****Welcome to my video game trivia quiz!**** " +
                "\nYou will earn different amounts of points per question." +
                "\nWhat is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "! Lets begin. \n\n");


    }
}
