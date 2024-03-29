package org.oop;

import java.util.Random;

public class Prodotto {
    Random random = new Random();
    private String strCode = "";
    //conversione stringa in int
    public int codice = Integer.parseInt(getCode());
    private String nome;
    private String descrizione;
    public double prezzo;
    private final double iva = 0.22;

    public Prodotto(String nome, String descrizione, double prezzo) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }
    public double getPriceWithIva(){
        return prezzo + prezzo * iva;
    }

    public String getCode(){
        //for basato sul numero random
        for (int i = 0; i < random.nextInt(8); i++) {
            //genero numero random, converto in stringa e concateno
            strCode += Integer.toString(random.nextInt(8));
        }
        return strCode;
    }
    public String getCodeAndName(){
        if (strCode.length() < 8){
            String strCodeWithName = 0 +"-"+ nome;
            return strCodeWithName;
        }else {
            String strCodeWithName = strCode +"-"+ nome;
            return strCodeWithName;
        }
    }
}
