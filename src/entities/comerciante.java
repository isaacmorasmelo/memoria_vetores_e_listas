package entities;

public class comerciante {
    private String name;
    private double purchase;
    private double sale;

    public comerciante(String name, double purchase, double sale) {
        this.name = name;
        this.purchase = purchase;
        this.sale = sale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPurchase() {
        return purchase;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }
}
