public class SonyManufacturer extends GameManufacturer {

    public SonyManufacturer(Game game) {
        super(game);
    }
    @Override
    void insertGame() {
        System.out.println("Inserting " + game.getName());
    }
}
