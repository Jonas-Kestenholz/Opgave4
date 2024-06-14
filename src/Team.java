import java.util.List;

public class Team implements Player {
    // Medlemsvariabel for holdets navn
    private String name;
    // Liste over spillere på holdet, hvor hver spiller implementerer Player-interface
    protected List<Player> players;

    // Konstruktør der initialiserer navn og liste over spillere
    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    // Implementering af getName() fra Player-interface
    @Override
    public String getName() {
        return name;
    }

    // Implementering af getPoints() fra Player-interface
    // Beregner og returnerer summen af pointene for alle spillerne på holdet
    @Override
    public double getPoints() {
        double totalPoints = 0;
        for (Player player : players) {
            totalPoints += player.getPoints();
        }
        return totalPoints;
    }

    // Implementering af addPoints() fra Player-interface
    // Fordeler pointene jævnt mellem alle spillerne på holdet
    @Override
    public void addPoints(double points) {
        double pointsPerPlayer = points / players.size();
        for (Player player : players) {
            player.addPoints(pointsPerPlayer);
        }
    }

    // Overskriver toString() for at give en strengrepræsentation af holdet
    // Inkluderer holdets navn og de samlede point
    @Override
    public String toString() {
        return "Name: " + name + ", points: " + getPoints();
    }
}