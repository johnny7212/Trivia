public class Questions {

    String question;
    String answer;
    int pointVal;

    public Questions(String question, String answer, int pointVal) {
        this.question = question;
        this.answer = answer;
        this.pointVal = pointVal;
    }

    public static String [] questions = {
            new Questions("What game did mario first appear in?(5)", "Donkey Kong", 5).toString(),
            new Questions("What year is the first game believed to have been created(5)", "1958", 5).toString(),
            new Questions("What is the best-selling console that is said to have sold 155 million worldwide?(4)", "Playstation 2", 4).toString(),
            new Questions("What video game was promoted in a commercial featuring the song “Happy Together” by the Turtles?(5)", "Super Smash Brothers",5).toString(),
            new Questions("What orange furry character was a mascot for Playstation?(3)", "Crash Bandicoot",3).toString(),
            new Questions("What is the highest selling X-box game?(3)", "Halo 2",3).toString(),
            new Questions("What year was the first X-box console released?(3)", "2001",3).toString(),
            new Questions("Which fighting game was released first, Street Fighter or Tekken?(3)", "Street Fighter",3).toString(),
            new Questions("What handheld gaming system is the best-selling of all time?(2)", "Nintendo Ds",2).toString(),
            new Questions("What’s the most expensive video game ever produced [$1000]?(4)", "Star Citizen",4).toString(),
            new Questions("What was the last Sega console?(5)", "Sega Dreamcast",5).toString(),
            new Questions("Who is Jack Mitchell’s best friend in “Call of Duty: Advanced Warfare?”(8)", "Will Irons",8).toString()

    };

    public String getQuestion(){
        return question;
    }
    public String getAnswer() {
        return answer;
    }
    public int getPointVal(){
        return pointVal;
    }

}
