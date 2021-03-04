import java.lang.Math;

public class Unit {
    public String name;
    private String role;
    private int HP;
    private int level;
    private int maxHP;
    private int Atk;
    private int Def;
    private boolean isAlive;

    public Unit() {
        this.name = "";
        this.role = "Villager";
        this.maxHP = 10;
        this.HP = maxHP;
        this.level = 1;
        this.Atk = 0;
        this.Def = 0;
        this.isAlive = true;
    }

    public Unit(String name, String role, int hp, int lvl, int atk, int def) {
        this.name = name;
        this.role = role;
        this.maxHP = hp;
        this.HP = hp;
        this.level = lvl;
        this.Atk = atk;
        this.Def = def;
        this.isAlive = true;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public int getMaxHP() {
        return this.maxHP;
    }

    public int getHP() {
        return this.HP;
    }

    public int getAttack() {
        return this.Atk;
    }

    public int getDefense() {
        return this.Def;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHP(int hp) {
        this.HP = hp;
    }

    public void checkAlive() {
        if (this.HP == 0)
            isAlive = false;
    }

    public void levelUp() {
        this.level++;
        this.maxHP += (int) (Math.random() * 5 + 3);
        this.Atk += (int) (Math.random() * 3 + 1);
        this.Def += (int) (Math.random() * 3 + 1);
    }

    public void fight(Unit enemy) {
        enemy.setHP(Math.max(0, enemy.getHP() - Math.max(this.getAttack() - enemy.getDefense(), 0)));
        enemy.checkAlive();
        if (enemy.isAlive()) {
            this.setHP(Math.max(0, this.getHP() - Math.max(enemy.getAttack() - this.getDefense(), 0)));
            this.checkAlive();
        }
    }
    
    public String toString() {
        return name + " - " + role + "\n\n"
            + "Lvl " + level + "\n"
            + "HP " + HP + "/" + maxHP + "\n"
            + "Attack " + Atk + "\n"
            + "Defense " + Def;
    }
}
