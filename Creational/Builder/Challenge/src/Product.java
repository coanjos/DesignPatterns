import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\n Product completed: ");

        for (String part : parts) {
            System.out.println(part);
        }
    }
}
