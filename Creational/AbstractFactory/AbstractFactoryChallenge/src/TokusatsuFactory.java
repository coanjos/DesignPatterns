public interface TokusatsuFactory {
    Hero getHero();
    RobotShip getRobotShip();
}

class InvestigatorJaspion implements TokusatsuFactory {

    @Override
    public Hero getHero() {
        return new Jaspion();
    }

    @Override
    public RobotShip getRobotShip() {
        return new Daileon();
    }
}

class SpaceSheriffGavan implements TokusatsuFactory {

    @Override
    public Hero getHero() {
        return new Gavan();
    }

    @Override
    public RobotShip getRobotShip() {
        return new ElectroBeastDol();
    }
}
