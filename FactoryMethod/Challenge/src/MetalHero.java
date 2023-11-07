public interface MetalHero {
    void transformar();
}

class Jaspion implements MetalHero {
    @Override
    public void transformar() {
        System.out.println("Gigante Guerreiro Daileon!");
    }
}

class Sharivan implements MetalHero {
    @Override
    public void transformar() {
        System.out.println("Raio Solar!");
    }
}