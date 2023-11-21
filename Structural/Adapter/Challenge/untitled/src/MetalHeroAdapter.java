public class MetalHeroAdapter implements SuperSentai {
    private final MetalHero metalHero;

    public MetalHeroAdapter(MetalHero metalHero) {
        this.metalHero = metalHero;
    }

    @Override
    public void change() {
        metalHero.change();
    }

    @Override
    public void assembleRobot() {
        metalHero.callShip();
    }
}
