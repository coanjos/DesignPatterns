
public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();

        Color color = colorFactory.getColor("RED");
        color.fill();
    }
}