public class Pinguim extends Animal implements Oviparo, Nadador {
    @Override
    void nascer() {
        System.out.println("O pinguim nasceu.");
    }

    @Override
    public void botarOvos() {
        System.out.println("O pinguim bota ovos.");
    }

    @Override
    public void nadar() {
        System.out.println("O pinguim nada habilidosamente.");
    }
}

