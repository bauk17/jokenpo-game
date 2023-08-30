package entities;

public class RandomChoose {
    private String rock = "Rock";
    private String paper = "Paper";
    private String scissor = "Scissor";

    public RandomChoose() {

    }

    public RandomChoose(String rock, String paper, String scissor) {
        this.rock = rock;
        this.paper = paper;
        this.scissor = scissor;
    }

    public String AIchooseJokenpo() {
        int randomNumber = (int) (Math.random() * 3);
        switch (randomNumber) {
            case 0:
                return rock;
            case 1:
                return paper;
            case 2:
                return scissor;
            default:

                return "";
        }
    }
}
