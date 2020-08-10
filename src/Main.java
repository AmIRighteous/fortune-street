import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Welcome to Fortune Street! First, tell me about yourself.");
        System.out.println("What is your name?: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("What color do you want to be?: ");
        String color = s.nextLine();
        Player p = new Player(name, color, 100, Player.PlayerType.USER);
        p.printStats();
//        System.out.println("Here's your stats: ");
//        System.out.println("Name - " + p.getName());
//        System.out.println("Color - " + p.getColor());
//        System.out.println("Coins - " + p.getCoins());
//        System.out.println("Type - " + p.getType());
    }
}
