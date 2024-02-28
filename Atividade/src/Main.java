public class Main {

    public static void main(String[] args) {
        // Instancia os animais
        Gato gato = new Gato();
        Galinha galinha = new Galinha();
        Pato pato = new Pato();
        Pinguim pinguim = new Pinguim();

        // Chama os métodos de cada animal
        System.out.println("Gato:");
        gato.nascer();
       // gato.andar();
        gato.comer();
        gato.beber();
        gato.miar();
       // gato.correr();
        // Gatos não implementam nadar ou botar ovos explicitamente

        System.out.println("\nGalinha:");
        galinha.nascer();
     //   galinha.andar();
        galinha.comer();
        galinha.beber();
        galinha.cacarejar();
     //   galinha.correr();
        galinha.voar();
        galinha.botarOvos();

        System.out.println("\nPato:");
        pato.nascer();
      //  pato.andar();
        pato.comer();
        pato.beber();
        pato.grasnar();
      //  pato.correr();
        pato.nadar();
        pato.voar();
        pato.botarOvos();

        System.out.println("\nPinguim:");
        pinguim.nascer();
      //  pinguim.andar();
        pinguim.comer();
        pinguim.beber();
        pinguim.nadar();
        pinguim.botarOvos();
        // Pinguins não voam, então não há chamada para pinguim.voar()
    }
}
