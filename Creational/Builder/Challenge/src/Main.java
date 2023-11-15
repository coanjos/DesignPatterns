public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        BuilderInterface pegasusClothBuilder = new PegasusCloth();
        director.construct(pegasusClothBuilder);
        Product pegasusCloth = pegasusClothBuilder.build();
        pegasusCloth.show();

        BuilderInterface dragonClothBuilder = new DragonCloth();
        director.construct(dragonClothBuilder);
        Product dragonCloth = dragonClothBuilder.build();
        dragonCloth.show();
    }
}