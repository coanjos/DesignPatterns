// the challenge consists of creating two objects that implement the same interface using a factory
// in the original example, it was duck an tiger, but I'm using metal heroes

public class Main {
    public static void main(String[] args) {
        final MetalHeroFactory metalHeroFactory = new MetalHeroFactory();

        MetalHero jaspion = metalHeroFactory.getMetalHero("JASPION");
        jaspion.transformar();

        MetalHero sharivan = metalHeroFactory.getMetalHero("SHARIVAN");
        sharivan.transformar();
    }
}