package org.oop;

public class Main {
    public static void main(String[] args) {
    Prodotto prodotto1 = new Prodotto("Zaino Puma", "Unisex",14.99);
    System.out.println("Il codice del tuo prodotto è: "+prodotto1.codice);
    System.out.println("Prezzo senza iva: "+ String.format("%.2f",prodotto1.prezzo)+"€");
    System.out.println("Prezzo con iva: "+String.format("%.2f",prodotto1.getPriceWithIva() )+"€");
    System.out.println(prodotto1.getCodeAndName());

    Prodotto prodotto2 = new Prodotto("Power Bank", "Tascabile",20);
    System.out.println("Il codice del tuo prodotto è: "+prodotto2.codice);
    System.out.println("Prezzo senza iva: "+ String.format("%.2f",prodotto2.prezzo)+"€");
    System.out.println("Prezzo con iva: "+String.format("%.2f",prodotto2.getPriceWithIva() )+"€");
    System.out.println(prodotto2.getCodeAndName());
    }
}
