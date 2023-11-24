public class Main {
    public static void main(String[] args) {
        GameManufacturer nintendoManufacturer = new NintendoManufacturer(new HandHeldGame("Tetris"));

        nintendoManufacturer.insertGame();
        nintendoManufacturer.playGame();

        GameManufacturer sonyManufacturer = new SonyManufacturer(new ConsoleGame("Metal Gear Solid"));

        sonyManufacturer.insertGame();
        sonyManufacturer.playGame();
    }
}