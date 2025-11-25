package quiz.no1;

class Player extends DamageableObject {
    int score;
    int livesRemaining;

    @Override
    void onKilled() {
        livesRemaining--;
        System.out.println("Player " + name + " mati! Sisa nyawa: " + livesRemaining);
        if (livesRemaining <= 0) {
            despawn();
        }
    }
}