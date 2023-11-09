public class FactoryProducer {
    public static TokusatsuFactory getFactory(String type) {
        if (type.equalsIgnoreCase("JASPION")) {
            return new InvestigatorJaspion();
        } else if (type.equalsIgnoreCase("GAVAN")) {
            return new SpaceSheriffGavan();
        }

        return null;
    }
}
