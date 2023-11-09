public interface RobotShip {
    void land();
}

class Daileon implements RobotShip {
    @Override
    public void land() {
        System.out.println("GIGANTE GUERREIRO DAILEON");
    }
}

class ElectroBeastDol implements RobotShip {

    @Override
    public void land() {
        System.out.println("ELECTRO BEAST");
    }
}
