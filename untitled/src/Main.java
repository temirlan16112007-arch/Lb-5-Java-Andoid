public class Main {

    // Метод для создания героев и возврата их в виде массива
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(250, 20, "Critical Damage");
        Hero hero2 = new Hero(300, 25); // Использование второго конструктора
        Hero hero3 = new Hero(200, 15, "Teleportation");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }

    public static void main(String[] args) {
        // Создание экземпляра босса и задание ему свойств через сеттеры
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        // Распечатка информации о боссе
        System.out.println("Boss information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense: " + boss.getDefenseType());
        System.out.println("-----------------------------------");

        // Получение массива героев из метода createHeroes
        Hero[] allHeroes = createHeroes();

        // Распечатка информации о всех героях через цикл
        System.out.println("Hero information:");
        for (int i = 0; i < allHeroes.length; i++) {
            System.out.println("Hero" + (i + 1) + ":");
            System.out.println("Health: " + allHeroes[i].getHealth());
            System.out.println("Damage: " + allHeroes[i].getDamage());
            System.out.println("Superpower: " + allHeroes[i].getSuperpower());
            System.out.println();
        }
    }
}