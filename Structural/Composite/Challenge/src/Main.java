public class Main {
    public static void main(String[] args) {
        Condominio condominio = new Condominio("Condomínio Mario Bros");

        Bloco blocoLaranja = new Bloco("Bloco Laranja");
        Bloco blocoAzul = new Bloco("Bloco Azul");

        Apartamento apartamento1 = new Apartamento("1-1");
        Apartamento apartamento2 = new Apartamento("2-1");

        condominio.addBloco(blocoLaranja);
        condominio.addBloco(blocoAzul);

        blocoLaranja.addApartamento(apartamento1);
        blocoAzul.addApartamento(apartamento2);

        condominio.mostrarInfoEstrutura();
    }
}