package Models;

public class PizzaProxy implements PizzaInterface, Comanda, Vizitee {
    private final Double maxTime ;
    private final String Restaurant;
    private Pizza realPizza;
    private final String name;
    private final String atributAditional;

    public PizzaProxy(Double maxTime, String restaurant, String name, String atributAditional) {
        this.maxTime = maxTime;
        Restaurant = restaurant;
        this.name = name;
        this.atributAditional = atributAditional;
        this.realPizza = PizzaLoader(name);


    }


    public Pizza PizzaLoader(String Name){
        double time = 0;

        Pizza realPizza = new Pizza(time,Name, Restaurant, atributAditional);
        if (realPizza.getTime() < maxTime)
        return realPizza;
        else return null;
    }

    @Override
    public void print() {

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
        vizitor.vizitPizzaProxy(this, getCost());
        vizitor.vizitPizza(this.realPizza,getCost());
    }

    @Override
    public Double getCostComanda() {
        return this.realPizza.getCostComanda();
    }

    @Override
    public Double getTime() {
        return null;
    }

    @Override
    public Double getCost() {
        return (double) 0;
    }

    @Override
    public String toString() {
        return "PizzaProxy{" +
                "maxTime=" + maxTime +
                ", Restaurant='" + Restaurant + '\'' +
                ", realPizza=" + realPizza +
                ", name='" + name + '\'' +
                ", atributAditional='" + atributAditional + '\'' +
                '}';
    }
}
