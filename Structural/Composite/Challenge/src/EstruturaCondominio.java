import java.util.ArrayList;
import java.util.List;

public interface EstruturaCondominio {
    void mostrarInfoEstrutura();
}

class Condominio implements EstruturaCondominio {
    private String nome;

    public Condominio(String nome) {
        this.nome = nome;
    }
    private List<EstruturaCondominio> blocos = new ArrayList<>();

    public void addBloco(EstruturaCondominio estrutura) {
        this.blocos.add(estrutura);
    }

    @Override
    public void mostrarInfoEstrutura() {
        System.out.println(nome+ ": ");
        System.out.println("--");
        for (EstruturaCondominio bloco: blocos) {
            bloco.mostrarInfoEstrutura();
        }
    }
}

class Bloco implements EstruturaCondominio {
    private String nome;

    public Bloco(String nome) {
        this.nome = nome;
    }
    private List<EstruturaCondominio> apartamentos = new ArrayList<>();

    public void addApartamento(EstruturaCondominio estrutura) {
        this.apartamentos.add(estrutura);
    }

    @Override
    public void mostrarInfoEstrutura() {
        System.out.println(nome+ ": ");
        for (EstruturaCondominio apartamento: apartamentos) {
            apartamento.mostrarInfoEstrutura();
        }
        System.out.println("--");
    }
}

class Apartamento implements EstruturaCondominio {
    private String nome;

    public Apartamento(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrarInfoEstrutura() {
        System.out.println("apartamento: " +nome);
    }
}

