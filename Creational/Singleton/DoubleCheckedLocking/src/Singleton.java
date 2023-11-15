public class Singleton {
    private volatile static Singleton uniqueInstance = null;

    private int data = 0;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }

    public void setData(int dataInput) {
        data = dataInput;
    }

    public int getData() {
        return data;
    }
}
