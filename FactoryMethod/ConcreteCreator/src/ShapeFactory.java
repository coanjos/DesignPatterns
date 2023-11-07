public class ShapeFactory {
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case null:
                System.out.println("Shape is null");
                return null;
            case "CIRCLE":
                System.out.println("Shape is CIRCLE");
                return new Circle();
            case "RECTANGLE":
                System.out.println("Shape is RECTANGLE");
                return new Rectangle();
            case "SQUARE":
                System.out.println("Shape is SQUARE");
                return new Square();
            default:
                System.out.println("Shape is unknown");
                return null;
        }
    }
}
