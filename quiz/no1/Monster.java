package quiz.no1;

class Monster extends DamageableObject {
    int threatLevel;
    String color;

    void makeNoise() {
        System.out.println(name + " mengeluarkan suara mengerikan!");
    }

    @Override
    void onKilled() {
        System.out.println("Monster " + name + " terbunuh! Level ancaman: " + threatLevel);
        despawn();
    }
}
