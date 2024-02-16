package classes;

public class ContaCorrente extends Conta{


    public boolean cartaoCredito;

    public void depositar(double valor){
        System.out.println("Vem da filha");
        super.depositar(valor+10);
    }


}
