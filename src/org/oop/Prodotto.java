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
        // Stringa formattata in modo da avere zeri a sinistra fino a raggiungere una lunghezza di 8 caratteri.
        String formattedCode = String.format("%08d", codice);
        return formattedCode + "-"+ nome;
    }
}
