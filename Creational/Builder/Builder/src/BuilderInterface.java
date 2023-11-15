public interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadLights();
    Product getVehicle();
}

class Car implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a car");
    }

    @Override
    public void insertWheels() {
        product.add("Four wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("Added two headlights");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}

class MotorCycle implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("Two wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("Added one headlight");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
