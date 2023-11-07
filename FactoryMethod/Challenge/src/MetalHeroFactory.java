public class MetalHeroFactory {
    public MetalHero getMetalHero(String metalHeroType) {
        if (metalHeroType == null) {
            return null;
        } else if (metalHeroType.equalsIgnoreCase("JASPION")) {
            return new Jaspion();
        } else if (metalHeroType.equalsIgnoreCase("SHARIVAN")) {
            return new Sharivan();
        }

        return null;
    }
}
