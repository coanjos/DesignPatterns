public interface BuilderInterface {
    void addHelmet();
    void addArms();
    void addLegs();
    void addTorso();
    Product build();
}

class PegasusCloth implements BuilderInterface {
    private final Product product = new Product();

    @Override
    public void addHelmet() {
        product.add("Adding Pegasus helmet");
    }

    @Override
    public void addArms() {
        product.add("Adding Pegasus arms");
    }

    @Override
    public void addLegs() {
        product.add("Adding Pegasus legs");
    }

    @Override
    public void addTorso() {
        product.add("Adding Pegasus torso");
    }

    @Override
    public Product build() {
        return product;
    }
}

class DragonCloth implements BuilderInterface {
    private final Product product = new Product();

    @Override
    public void addHelmet() {
        product.add("Adding Dragon helmet");
    }

    @Override
    public void addArms() {
        product.add("Adding Dragon arms");
    }

    @Override
    public void addLegs() {
        product.add("Adding Dragon legs");
    }

    @Override
    public void addTorso() {
        product.add("Adding Dragon torso");
    }

    @Override
    public Product build() {
        return product;
    }
}