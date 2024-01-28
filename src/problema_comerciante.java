import entities.comerciante;

import java.util.Locale;
import java.util.Scanner;

public class problema_comerciante {
    public static void main(String[] args) {
        String name = "JORGE";
        double precoCompra = 0; double precoVenda;

        double lucroMenorQue10porcento = 0;
        double lucroEntre10e20porcento = 0;
        double lucroAcimaDe20porcento = 0;
        double valorTotalDaCompra = 0;
        double valorTotalDeVenda = 0;
        double lucroTotal = 0;



        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Serão digitados dados de quantos produtos? ");
        int quantity = sc.nextInt();
        comerciante[] vect = new comerciante[quantity];

        for (int i = 0; i < vect.length; i++){
            System.out.println("produto " + (i+1));
            sc.nextLine();
            System.out.print("nome: ");
            name = sc.nextLine();
            System.out.print("Preço da Compra: ");
            precoCompra = sc.nextDouble();
            System.out.print("Preço da Venda: ");
            precoVenda = sc.nextDouble();

            valorTotalDaCompra += precoCompra;
            valorTotalDeVenda += precoVenda;

            if (precoVenda - precoCompra < precoCompra * 0.1){
                lucroMenorQue10porcento += 1;
            } else if (precoVenda - precoCompra < precoCompra * 0.2){
                lucroEntre10e20porcento += 1;
            } else {
                lucroAcimaDe20porcento += 1;
            }

            vect[i] = new comerciante(name,precoCompra,precoVenda);
        }

        lucroTotal = valorTotalDeVenda - valorTotalDaCompra;

        System.out.println("lucro abaixo de 10% = " + lucroMenorQue10porcento);
        System.out.println("lucro entre 10% e 20% = " + lucroEntre10e20porcento);
        System.out.println("lucro acima de 20% = " + lucroAcimaDe20porcento);

        System.out.printf("valor total da compra = %.2f\n", valorTotalDaCompra);
        System.out.printf("valor total da venda = %.2f\n", valorTotalDeVenda);
        System.out.printf("Lucro Total = %.2f", lucroTotal);
    }
}
