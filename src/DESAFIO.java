import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import entities.TaxPayer;
import java.util.Scanner;

import static com.sun.tools.attach.VirtualMachine.list;

public class DESAFIO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double rendaAnualSalarial; double rendaAnualDeServicos;
        double rendaAnualDaCapital; double gastosComMedicos;
        double gastosEscolares; double sum; int a = 1;

        System.out.print("Quantos contribuintes você vai digitar? ");
        int quantity = sc.nextInt();
        TaxPayer TaxPayer = new TaxPayer();
        List<TaxPayer> list = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Digite os dados do" + (i+1) +"o contribuinte:");

            System.out.print("Renda anual com salário: ");
            rendaAnualSalarial = sc.nextDouble();

            System.out.print("Renda anual com prestação de serviço: ");
            rendaAnualDeServicos = sc.nextDouble();

            System.out.print("Renda anual com ganho de capital: ");
            rendaAnualDaCapital = sc.nextDouble();

            System.out.print("Gastos médicos: ");
            gastosComMedicos = sc.nextDouble();

            System.out.print("Gastos educacionais: ");
            gastosEscolares = sc.nextDouble();


            list.add(new TaxPayer(rendaAnualSalarial,rendaAnualDeServicos,rendaAnualDaCapital,gastosComMedicos,gastosEscolares));
        }

        for(TaxPayer i : list){
            System.out.println("Resumo do " + a + "o contribuinte:");
            System.out.printf("Imposto bruto total: %s%n", i.grossTax());
            System.out.printf("Abatimento: %s%n", i.taxRebate());
            System.out.printf("Imposto devido: %s%n", i.netTax());
            a++;
        }
    }
}
