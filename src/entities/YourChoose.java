package entities;

import java.util.Scanner;

public class YourChoose extends RandomChoose {
    private String choose;

    public YourChoose(String choose) {
        this.choose = choose;
    }

    public YourChoose(String pedra, String papel, String tesoura, String choose) {
        super(pedra, papel, tesoura);
        this.choose = choose;
    }

    RandomChoose AIchoose = new RandomChoose();
    String randomChoice = AIchoose.AIchooseJokenpo();

    public String getJokenpoResult(String choose) {
        if (choose.equals("Pedra") && randomChoice.equals("Tesoura") ||
                choose.equals("Tesoura") && randomChoice.equals("Papel") ||
                choose.equals("Papel") && randomChoice.equals("Pedra")) {
            return "Sua escolha foi: " + choose + ", " + "E a da AI foi: " + randomChoice + "." + " Então você venceu";
        } else if (choose.equals(randomChoice)) {
            return "Sua escolha foi: " + choose + ", " + "E a da AI foi: " + randomChoice + "." + " Empate!";
        } else {
            return "Sua escolha foi: " + choose + ", " + "E a da AI foi: " + randomChoice + "." + " Você perdeu!";
        }
    }

}
