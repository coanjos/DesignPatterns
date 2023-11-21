public class CalculatorAdapter implements CalculatorInterface {
    Calculator calculator;
    Triangle t;

    public CalculatorAdapter(Triangle triangle) {
        t = triangle;
    }

    public double getArea(Rectangle r) {
        calculator = new Calculator();
        Rectangle rectangle = new Rectangle();
        rectangle.length = t.base;
        rectangle.width = 0.5 * t.height;

        return calculator.getArea(rectangle);
    }
}
