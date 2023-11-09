public class Main {
    public static void main (String[] args) {

        TokusatsuFactory factory1 = FactoryProducer.getFactory("JASPION");
        TokusatsuFactory factory2 = FactoryProducer.getFactory("GAVAN");

        if (factory1 != null) {
            Hero jaspion = factory1.getHero();
            RobotShip daileon = factory1.getRobotShip();

            jaspion.change();
            jaspion.fight();

            daileon.land();
        }

        if (factory2 != null) {
            Hero gavan = factory2.getHero();
            RobotShip electroBeastDol = factory2.getRobotShip();

            gavan.change();
            gavan.fight();

            electroBeastDol.land();
        }
    }
}
