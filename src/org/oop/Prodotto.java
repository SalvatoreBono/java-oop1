package org.oop;

import java.util.Random;

public class Prodotto {
    Random random = new Random();
    public int codice;
    private String nome;
    private String descrizione;
    public double prezzo;
    private final double iva = 0.22;

    public Prodotto(String nome, String descrizione, double prezzo) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.codice = generateCode();
    }
    public double getPriceWithIva(){
        return prezzo + prezzo * iva;
    }

    public int generateCode(){
        int randomCode= random.nextInt(10000000);
        return randomCode;
    }

    public String getCodeAndName(){
        String strCode = Integer.toString(codice);
        if (strCode.length() < 8 ){
            for (int i = 0; i < strCode.length() ; i++) {
            return  "0" + codice +"-"+nome;
            }
        }
        return codice + "-"+ nome;
    }
}
