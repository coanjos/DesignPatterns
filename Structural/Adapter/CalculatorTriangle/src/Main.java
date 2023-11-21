public class Main {
    public static void main(String[] args) {
        System.out.println("Using the adapter pattern, fi \n");

        Triangle t = new Triangle(20, 10);

        CalculatorInterface calculatorAdapter = new CalculatorAdapter(t);

        System.out.println("Area of Triangle is: " + calculatorAdapter.getArea(null));

    }
}