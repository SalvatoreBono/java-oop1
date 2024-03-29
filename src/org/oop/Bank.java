package org.oop;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ciao Inserisci il tuo nome");
        String bankAccount = keyboard.nextLine();

        Conto conto1 = new Conto(bankAccount, 50);

        boolean exit = false;

        //fai questo finchè exit è true
        do {
            System.out.println(bankAccount +" hai 3 opzioni:");
            System.out.println("1 = Versare");
            System.out.println("2 = Prelevare");
            System.out.println("3 = Uscire");
            int bankOption = keyboard.nextInt();
            //se scegli il numero 1
            if (bankOption == 1){
                System.out.println("Quanto vuoi versare?");
                int money = keyboard.nextInt();
                conto1.addMoney(money);
                conto1.info();
                //se scegli il numero 2
            } else if (bankOption == 2) {
                System.out.println("Quanto vuoi prelevare?");
                int money = keyboard.nextInt();
                //se il tuo saldo è inferiore ai solddi da prelevare
                if (conto1.saldo < money){
                    System.out.println("Mi dispiace non puoi prelevare perchè il tuo conto andrà in negativo");
                } else {
                    conto1.removeMoney(money);
                }
                conto1.info();
            } else if (bankOption == 3) {
                exit = true;
                System.out.println("Sei uscito");
            }
        }while (!exit);

    }
}
