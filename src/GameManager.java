import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class GameManager {
    private ArrayList<Player> players;
    private ArrayList<Property> properties;
    private LinkedList<Space> spaces;

    public GameManager() {
        players = new ArrayList<>();
        //properties is set by the course
        initPlayers();
    }

    private void initPlayers() {
        System.out.println("Welcome to Fortune Street! First, tell me about yourself.");
        System.out.println("What is your name?: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("What color do you want to be? Your options are BLACK, GREEN, RED, BLUE, YELLOW. WHITE ORANGE, AND PURPLE: ");
        String color = s.nextLine();

    }

    enum Colors {
        BLACK,
        GREEN,
        RED,
        BLUE,
        YELLOW,
        WHITE,
        ORANGE,
        PURPLE
    }
}
