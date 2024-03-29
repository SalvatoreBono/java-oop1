package org.oop;

import java.util.Random;

public class Conto {
    private int numeroDiConto;
    private String nomeDelProprietario;
    public double saldo;

    Random random = new Random();
    public Conto(String nomeDelProprietario, int saldo) {
        this.numeroDiConto = random.nextInt(1000);
        this.nomeDelProprietario = nomeDelProprietario;
        this.saldo = saldo;
    }

    public double addMoney(double money){
        return saldo += money;
    }
    public double removeMoney(double money){
        // se il tuo saldo è maggiore o uguale ai soldi allora preleva
        if (saldo >= money){
            return saldo-=money;
        }else {
           return saldo;
        }
    }
    public void info(){
        System.out.println(nomeDelProprietario +", nel tuo conto: "+ numeroDiConto +" hai un saldo di: " + saldo + "€");
    }
}
