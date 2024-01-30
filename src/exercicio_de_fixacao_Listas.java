import entities.Listas;

import java.util.ArrayList;
import java.util.List;
import entities.Listas;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class exercicio_de_fixacao_Listas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;int Id;double salary;double percentage;

        System.out.print("How many employees will be registered? ");
        int quantity = sc.nextInt();
        List<Listas> list = new ArrayList<>();
        System.out.println();

        for (int i = 0; i < quantity; i++){
            System.out.println("Emplyoee #" + (i+1) + ":");
            System.out.print("Id: ");
            Id = sc.nextInt();
            sc.nextLine();
            System.out.print("name: ");
            name = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextDouble();
            System.out.println();
            list.add(new Listas(Id,name,salary));
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Listas search = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);


        if (search == null){
            System.out.println("This id does not exist!");
        }else {
            System.out.print("Enter the percentage: ");
            percentage = sc.nextDouble();
            search.increasySalary(percentage);
        }
        System.out.println();
        System.out.println("List of employees: ");
        for (Listas i : list){
            System.out.println(i.getId() + ", " + i.getName() + ", " + i.getSalary());
        }

    }
}
