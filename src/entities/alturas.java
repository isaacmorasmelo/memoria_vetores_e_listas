package entities;

public class alturas {
    private String name;
    private int old;
    private double height;

    public alturas(String name, int old, double height) {
        this.name = name;
        this.old = old;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
