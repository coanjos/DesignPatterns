public class HandHeldGame implements Game{
    String name;
    public HandHeldGame(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
