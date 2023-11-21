public interface SuperSentai {
    void change();
    void assembleRobot();
}

class Jetman implements SuperSentai {

    @Override
    public void change() {
        System.out.println("Cross changer!");
    }

    @Override
    public void assembleRobot() {
        System.out.println("Jetman Robot");
    }
}
