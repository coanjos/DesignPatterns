public interface Hero {
    void change();
    void fight();
}

class Gavan implements Hero {

    @Override
    public void change() {
        System.out.println("Electro Plate!");
    }

    @Override
    public void fight() {
        System.out.println("Z BEAM!");
    }
}

class Jaspion implements Hero {

    @Override
    public void change() {
        System.out.println("JASPION TRANSFORMAR");
    }

    @Override
    public void fight() {
        System.out.println("JASPION LUTA");
    }
}

