public class Main {
    public static void main(String[] args) {
        EnemyPrototype goombaPrototype =  new EnemyPrototype("Goomba", 100);
        EnemyPrototype goombaClone = (EnemyPrototype) goombaPrototype.clone();

        goombaClone.setHp(50);

        System.out.println("HP do Goomba original: " + goombaPrototype.getHp());
        System.out.println("HP do Goomba clone: " + goombaClone.getHp());
    }
}