package application;

import java.util.Scanner;

import entities.RandomChoose;
import entities.YourChoose;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Faça sua escolha entre: Pedra, papel e tesoura");
        String choose = sc.nextLine();

        YourChoose player = new YourChoose(choose);
        String gameResult = player.getJokenpoResult(choose);
        System.out.println(gameResult);
        sc.close();
    }
}