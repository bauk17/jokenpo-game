package entities;

public class RandomChoose {
    private String pedra = "Pedra";
    private String papel = "Papel";
    private String tesoura = "Tesoura";

    public RandomChoose() {

    }

    public RandomChoose(String pedra, String papel, String tesoura) {
        this.pedra = pedra;
        this.papel = papel;
        this.tesoura = tesoura;
    }

    public String AIchooseJokenpo() {
        int randomNumber = (int) (Math.random() * 3);
        switch (randomNumber) {
            case 0:
                return pedra;
            case 1:
                return papel;
            case 2:
                return tesoura;
            default:

                return "";
        }
    }
}
