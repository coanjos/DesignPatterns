public class NintendoManufacturer extends GameManufacturer {
    public NintendoManufacturer(Game game) {
        super(game);
    }
    @Override
    void insertGame() {
        System.out.println("Inserting " + game.getName());
    }
}
