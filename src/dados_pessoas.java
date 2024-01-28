import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
    public static void main(String[] args) {
        double alturaMulheres = 0;
        double numeroMulheres = 0;
        double mediaAlturaMulheres = 0;

        int numeroHomens = 0;

        double altura;
        double menorAltura = 10.0;
        double maiorAltura = 0;

        char genero;


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("quantas pessoas serão digitadas? ");
        int quantity = sc.nextInt();

        int[] vect = new int[quantity];

        for (int i = 0; i< vect.length; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa");
            altura = sc.nextDouble();

            System.out.print("Genero da " + (i + 1) + "a pessoa");
            genero = sc.next().charAt(0);

            if (genero == 'F') {
                numeroMulheres += 1;
                alturaMulheres += altura;
            } else if (genero == 'M') {
                numeroHomens += 1;
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
            } else if (altura < menorAltura) {
                menorAltura = altura;
            }
        }
            mediaAlturaMulheres = alturaMulheres/numeroMulheres;

            System.out.printf("Menor Altura = %.2f\n", menorAltura);
            System.out.printf("Maior Altura = %.2f\n", maiorAltura);
            System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
            System.out.println("Numero de Homens = \n" + numeroHomens);
    }
}
