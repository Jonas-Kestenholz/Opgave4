import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Bastards", new ArrayList<>());
        // Opret standard- og juniorspillere
        Player player1 = new StandardPlayer("Alice");
        Player player2 = new JuniorPlayer("Bob");

        // Opret et team med både standard- og juniorspillere
       


        team.players.add(player1);
        team.players.add(player2);



        // Tilføj point til spillere og team
        player1.addPoints(10);
        player2.addPoints(10);
        team.addPoints(20);




        // Udskriv spillerne og teamet
        System.out.println(player1); // Alice, points: 10.0
        System.out.println(player2); // Bob, points: 15.0 (10 * 1.5)
        System.out.println(team); // Team A, points: 45.0 (10.0 + 15.0 + 10.0 + 10.0)

        System.out.println("-----------");

        // Tilføj flere point til teamet
        team.addPoints(20);

        // Udskriv opdaterede points
        System.out.println(player1); // Alice, points: 20.0
        System.out.println(player2); // Bob, points: 30.0 (20 * 1.5)
        System.out.println(team); // Team A, points: 80.0 (20.0 + 30.0 + 20.0 + 20.0)
    }
}

// metode til at udksrive
//