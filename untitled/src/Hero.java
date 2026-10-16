public class Hero {
    private int health;
    private int damage;
    private String superpower;

    // Конструктор, принимающий все поля
    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    // Конструктор, принимающий только здоровье и урон
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superpower = "None";
    }

    // Геттеры для всех полей
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}