import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos numeros você vai digitar? ");
        int quantity = sc.nextInt();
        int pares = 0;

        int[] vect = new int[quantity];

        for (int i = 0; i < vect.length ; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.print("NUMEROS PARES: ");
        for (int i = 0; i < quantity ; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
                pares += 1;
            }
        }
        System.out.println();

        System.out.println("QUANTIDADE DE PARES = " + pares);
    }
}
