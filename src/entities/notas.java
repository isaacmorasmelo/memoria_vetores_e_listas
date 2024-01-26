package entities;

public class notas {
    private double nota1;
    private double nota2;
    private String name;

    public notas(double nota1, double nota2, String name) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.name = name;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
