import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("quantos numeros você vai digitar? ");
        int quantity = sc.nextInt();
        double[] vect = new double[quantity];

        for (int i = 0; i < quantity; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }
        System.out.print("VALORES = ");

        for (int i = 0; i < quantity; i++){
            System.out.print(vect[i] + " ");
        }

        System.out.println();

        double sum = 0;
        for(int i = 0; i < quantity; i++){
            sum += vect[i];
        }

        System.out.println("SOMA = " + sum);

        double media = sum/quantity;

        System.out.println("MEDIA = " + media);
    }
}
