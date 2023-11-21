public interface MetalHero {
    void change();
    void callShip();
}

class Gavan implements MetalHero {
    @Override
    public void change() {
        System.out.println("Electroplate");
    }

    @Override
    public void callShip() {
        System.out.println("Dol");
    }
}