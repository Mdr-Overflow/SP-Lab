package Models;

public class Pizza implements Comanda, Vizitee {


    private final String Restaurnat;
    private final String Name;
    private  Double cost = (double) 0;

    public Pizza(String name, String Restaurant, Double cost) {

        this.Name = name;
        this.Restaurnat = Restaurant;
        this.cost = cost;

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
        return this.cost;
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