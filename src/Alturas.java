import entities.alturas;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int quantity = sc.nextInt();
        int old;
        double avarage_height;
        int low_old = 100/quantity;
        int one = 0;
        double sum = 0;
        double height;

        alturas[] vect = new alturas[quantity];

        for (int i = 0; i < vect.length; i++){
            System.out.println("dados da " + (i + 1) + "a pessoa");
            System.out.print("nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("idade: ");
            old = sc.nextInt();
            System.out.print("altura: ");
            height = sc.nextDouble();

            vect[i] = new alturas(name, old, height);
        }

        for (int i = 0; i < quantity; i++){
            sum += vect[i].getHeight();
        }

        avarage_height = sum / quantity;

        System.out.printf("Altura média: %.2f\n" , avarage_height);

        for(int i = 0; i < quantity; i++){
            if (vect[i].getOld()<16){
                one += 1;
            }
        }

        low_old *= one;
        System.out.println("Pessoas com menos de 16 anos: " + low_old + "%");

        for(int i = 0; i < quantity; i++){
            if (vect[i].getOld() < 16){
                System.out.println (vect[i].getName());
            }
        }
    }
}
