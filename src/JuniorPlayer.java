public class JuniorPlayer implements Player {
    // Medlemsvariabel for spillerens navn
    private String name;
    // Medlemsvariabel for spillerens point
    private double points;

    // Konstruktør der initialiserer navn og sætter point til 0
    public JuniorPlayer(String name) {
        this.name = name;
        this.points = 0;
    }

    // Implementering af getName() fra Player-interface
    @Override
    public String getName() {
        return name;
    }

    // Implementering af getPoints() fra Player-interface
    @Override
    public double getPoints() {
        return points;
    }

    // Implementering af addPoints() fra Player-interface
    // Tilføjer point til spillerens samlede point med en 1.5 gange multiplier
    @Override
    public void addPoints(double points) {
        this.points += points * 1.5;
    }

    // Overskriver toString() for at give en strengrepræsentation af spilleren
    // Inkluderer spillerens navn og point
    @Override
    public String toString() {
        return "Name: " + name + ", points: " + points;
    }
}