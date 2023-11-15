public class Singleton {
    private String song;
    private Singleton() {}
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return this.song;
    }

}
