abstract class GameManufacturer {
    protected Game game;

    protected GameManufacturer(Game game) {
        this.game = game;
    }

    abstract void insertGame();

    public void playGame() {
        System.out.println("Playing the game: " + game.getName());
    }
}
