import java.util.Locale;
import java.util.Scanner;

public class media_numeros_pares {
    public static void main(String[] args) {
        double sum = 0; double numeroPares = 0;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int quantity = sc.nextInt();
        int[] vect = new int[quantity];


        for (int i = 0; i < quantity; i++){
            System.out.println("digite um numero: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < quantity; i++){
            if (vect[i]%2 == 0){
                sum += vect[i];
                numeroPares += 1;
            }
        }

        double media = sum/numeroPares;

        System.out.println("media dos pares: " + media);
    }
}
