
import java.util.Locale;
import java.util.Scanner;

public class problema_negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos numeros você vai digitar? ");
        int quantity = sc.nextInt();
        double[] vect = new double[quantity];

        for (int i = 0; i < vect.length ; i++){
            System.out.print("digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double[] negativo = new double[turn];

        System.out.println("Numeros Negativos: ");
        for (int i = 0; i < quantity ; i++){
            for(int turn = 0; vect[i]<0; turn++){
                negativo[turn] = vect[i];
                System.out.println(negativo[turn]);
            }
        }
    }
}
