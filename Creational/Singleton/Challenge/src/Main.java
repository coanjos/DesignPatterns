public class Main {
    public static void main(String[] args) {

        System.out.println("Escolhendo uma música de menu para o jogo com singleton: ");

        Singleton s = Singleton.getInstance();

        s.setSong("Humming the bass");
    }
}