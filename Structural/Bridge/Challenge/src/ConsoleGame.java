public class ConsoleGame implements Game{
    String name;

    public ConsoleGame(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
