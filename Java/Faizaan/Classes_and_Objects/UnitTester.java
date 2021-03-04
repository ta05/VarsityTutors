public class UnitTester {
    public static void main(String[] args) {
        Unit player = new Unit("Boyd", "Fighter", 30, 4, 8, 5);
        Unit enemy = new Unit("Matthew", "Thief", 28, 5, 7, 2);

        System.out.println(player + "\n");
        System.out.println(enemy + "\n");

        int turn = 0;
        while (player.isAlive() && enemy.isAlive()) {
            turn++;
            System.out.println("Battle " + turn);
            player.fight(enemy);
            if (player.isAlive() && enemy.isAlive())
                enemy.fight(player);

            System.out.println(player.getName() + " " + player.getHP() + "/" + player.getMaxHP());
            System.out.println(enemy.getName() + " " + enemy.getHP() + "/" + enemy.getMaxHP());
            System.out.println();
        }
        
        System.out.println(player.isAlive() ? player.getName() + " won the battle!" : enemy.getName() + " won the battle!");

    }
}
