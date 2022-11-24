package Models;

public class Pizza implements Comanda,PizzaInterface, Vizitee {


    private final String Restaurnat;
    private final String Name;
    private  Double cost = (double) 0;

    public Pizza(String name, String Restaurant) {

        this.Name = name;
        this.Restaurnat = Restaurant;


    }


    @Override
    public void print() {
        System.out.println("Pizza " +this.Name);
    }

    @Override
    public void add(Comanda comanda) {

    }

    @Override
    public void remove(Comanda comanda) {

    }

    @Override
    public Comanda get(int i) {
        return null;
    }

    @Override
    public void accept(Vizitor vizitor) {
        vizitor.vizitPizza(this, this.cost);
    }

    @Override
    public Double getCostComanda() {
        return getCost();
    }


    @Override
    public Double getCost() {
        double rand = 1;
        return rand;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "Restaurnat='" + Restaurnat + '\'' +
                ", Name='" + Name + '\'' +
                ", cost=" + cost +
                '}';
    }
}