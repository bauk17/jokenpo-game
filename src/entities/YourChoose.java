package entities;

import java.util.Scanner;

public class YourChoose extends RandomChoose {
    private String choose;

    public YourChoose(String choose) {
        this.choose = choose;
    }

    public YourChoose(String rock, String paper, String scissor, String choose) {
        super(rock, paper, scissor);
        this.choose = choose;
    }

    RandomChoose AIchoose = new RandomChoose();
    String randomChoice = AIchoose.AIchooseJokenpo();

    public String getJokenpoResult(String choose) {
        if (choose.equals("Rock") && randomChoice.equals("Scissor") ||
                choose.equals("Scissor") && randomChoice.equals("Paper") ||
                choose.equals("Paper") && randomChoice.equals("Rock")) {
            return "Your choice were: " + choose + ", " + "and AI's choice was: " + randomChoice + "."
                    + " Well, YOU WIN!";
        } else if (choose.equals(randomChoice)) {
            return "Your choice were: " + choose + ", " + "and AI's choice was: " + randomChoice + "." + " DRAW!";
        } else {
            return "Your choice were: " + choose + ", " + "and AI's choice was " + randomChoice + "." + " YOU LOSE!";
        }
    }

}
