import entities.alturas;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {
    public static void main(String[] args) {
        String name = "Jorge";int old;int maisVelho = 0;int p=0;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int quantity = sc.nextInt();
        alturas[] vect = new alturas[quantity];

        for (int i = 0; i < quantity; i++){
            System.out.println("dados da " + (i+1) + "a pessoa: ");
            sc.nextLine();
            System.out.println("Nome: ");
            name = sc.nextLine();
            System.out.println("idade: ");
            old = sc.nextInt();
            vect[i] = new alturas(name,old);
        }

        for (int i = 0; i < quantity; i++){
            if (vect[i].getOld() > maisVelho){
                maisVelho = vect[i].getOld();
                p = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + vect[p].getName());
    }
}
