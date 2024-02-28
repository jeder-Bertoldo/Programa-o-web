public class Galinha extends Animal implements Oviparo {
    @Override
    void nascer() {
        System.out.println("A galinha nasceu.");
    }

    void cacarejar() {
        System.out.println("A galinha cacareja: Cocoricó!");
    }

    @Override
    public void botarOvos() {
        System.out.println("A galinha bota ovos.");
    }

    void voar() {
        System.out.println("A galinha tenta voar, mas não muito alto.");
    }
}
