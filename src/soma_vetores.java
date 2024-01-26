import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos valores tem cada vetor? ");
        int quantity = sc.nextInt();

        int[] vect1 = new int[quantity];
        int[] vect2 = new int[quantity];
        int[] vect3 = new int[quantity];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < quantity; i++){
            vect1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < quantity; i++){
            vect2[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < quantity; i++){
            vect3[i] = vect2[i] + vect1[i];
            System.out.println(vect3[i]);
        }
    }
}
