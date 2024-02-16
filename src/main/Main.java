package main;


import classes.Conta;
import classes.ContaCorrente;
import classes.ContaEstudante;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente1 = new ContaCorrente();
        contaCorrente1.dono = "Ana";
        contaCorrente1.numero = 2;
        contaCorrente1.limite = 1000;
        contaCorrente1.depositar(50);
        contaCorrente1.sacar(10);
        double saldoCC = contaCorrente1.consultarSaldo();
        System.out.println(saldoCC);

        ContaEstudante contaEstudante1 = new ContaEstudante();
        contaEstudante1.numero = 3;
        contaEstudante1.dono = "Pedro";
        contaEstudante1.limite = 50;
        contaEstudante1.depositar(10);
        contaEstudante1.sacar(5);
        double saldoEstudante = contaEstudante1.consultarSaldo();
        System.out.println(saldoEstudante);

    }
}