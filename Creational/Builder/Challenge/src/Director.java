public class Director {
    BuilderInterface clothBuilder;

    public void construct(BuilderInterface builder) {
         clothBuilder = builder;
         clothBuilder.addArms();
         clothBuilder.addHelmet();
         clothBuilder.addLegs();
         clothBuilder.addTorso();
    }
}
