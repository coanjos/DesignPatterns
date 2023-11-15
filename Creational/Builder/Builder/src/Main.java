public class Main {
    public static void main(String[] args) {
        System.out.println("***Builder***\n");

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface bikeBuilder = new MotorCycle();

        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        director.construct(bikeBuilder);
        Product p2 = bikeBuilder.getVehicle();
        p2.show();
    }
}