public class Hero {
    private int hp;
    private int damage;
    private String power;

    public Hero(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public String getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Hero: " +
                "hp=" + hp +
                ", damage=" + damage +
                ", power=" + power + "";
    }

    public Hero(int hp, int damage, String power) {
        this.hp = hp;
        this.damage = damage;
        this.power = power;

    }



}
