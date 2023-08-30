package application;

import java.util.Scanner;

import entities.RandomChoose;
import entities.YourChoose;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Make your choice between: Rock, Paper, Scissor");
        String choose = sc.nextLine();

        YourChoose player = new YourChoose(choose);
        String gameResult = player.getJokenpoResult(choose);
        System.out.println(gameResult);
        sc.close();
    }
}