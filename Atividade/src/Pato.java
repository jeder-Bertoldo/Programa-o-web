public class Pato extends Animal implements Oviparo, Nadador {
    @Override
    void nascer() {
        System.out.println("O pato nasceu.");
    }

    void grasnar() {
        System.out.println("O pato grasna: Quack!");
    }

    @Override
    public void botarOvos() {
        System.out.println("O pato bota ovos.");
    }

    @Override
    public void nadar() {
        System.out.println("O pato está nadando.");
    }


    void voar() {
        System.out.println("O pato voa bem.");
    }
}

