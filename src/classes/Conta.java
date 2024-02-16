package classes;



public abstract class Conta {

    public int numero;
    public String dono;
    private double saldo;
    public double limite;

    public void depositar(double valor){
        System.out.println("Vem da mãe");
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
        }else{
            System.out.println("saldo insuficiente");
        }
    }

    public double consultarSaldo(){
        //System.out.println("O saldo do " + dono + " é " + saldo);
        return saldo;
    }

}
