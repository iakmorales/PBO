package quiz.no1;

abstract class DamageableObject extends GameObject {
    int maxHealth;
    int health;

    boolean isDead() {
        return health <= 0;
    }

    void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " menerima " + damage + " damage.");
        if (isDead()) {
            onKilled();
        }
    }

    abstract void onKilled();
}
