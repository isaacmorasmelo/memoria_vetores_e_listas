import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos elementos vai ter o vetor?");
        double quantity = sc.nextInt();


        double[] vect = new double[(int) quantity];

        for (int i = 0; i < quantity; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        double sum = 0;

        for (int i = 0; i < quantity; i++){
            sum += vect[i];
        }
        double media = sum/quantity;

        System.out.printf("media do vetor: %.2f\n", media);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i = 0; i < quantity; i++){
            if(vect[i]<media){
                System.out.println(vect[i]);
            }
        }
    }
}
