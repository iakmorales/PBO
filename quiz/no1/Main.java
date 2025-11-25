package quiz.no1;

public class Main {
    public static void main(String[] args) {
        Player p = new Player();
        p.name = "Hero";
        p.maxHealth = 100;
        p.health = 100;
        p.livesRemaining = 3;

        Monster m = new Monster();
        m.name = "Goblin";
        m.maxHealth = 50;
        m.health = 50;
        m.threatLevel = 2;

        // Demo
        m.makeNoise();
        m.takeDamage(60); // Monster mati
        p.takeDamage(120); // Player mati
    }
}