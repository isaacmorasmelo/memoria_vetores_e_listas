import entities.notas;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {
        String name; double nota1; double nota2;double sum;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados? ");
        int quantity = sc.nextInt();

        notas[] notas = new notas[quantity];

        for (int i = 0; i < quantity; i++){
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
            name = sc.nextLine();
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();
            notas[i] = new notas(nota1,nota2,name);
        }

        System.out.println("alunos aprovados: ");
        for (int i = 0; i < quantity; i++){
            sum = (notas[i].getNota1()+ notas[i].getNota2())/2;
            if (sum>=6.0){
                System.out.println(notas[i].getName());
            }
        }
    }
}
