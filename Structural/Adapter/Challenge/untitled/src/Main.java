public class Main {
    public static void main(String[] args) {
        MetalHero gavan = new Gavan();
        gavan.change();
        gavan.callShip();

        System.out.println("***");

        SuperSentai jetman = new Jetman();
        jetman.change();
        jetman.assembleRobot();

        System.out.println("***");

        SuperSentai metalHeroAdapter = new MetalHeroAdapter(gavan);
        metalHeroAdapter.change();
        metalHeroAdapter.assembleRobot();

    }
}