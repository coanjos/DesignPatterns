public class EnemyPrototype implements Prototype{
    private String name;
    private int hp;

    public EnemyPrototype(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public Prototype clone() {
        return new EnemyPrototype(this.name, this.hp);
    }
}
