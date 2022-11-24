package Models;

public class SalataProxy implements SalataInterface, Comanda, Vizitee {
    private final Double maxTime ;
    private final String Restaurant;
    private Salata realSalata;
    private final String name;
    private final String atributAditional;


    public SalataProxy(Double maxTime, String restaurant, String name, String atributAditional) {
        this.maxTime = maxTime;
        Restaurant = restaurant;
        this.name = name;
        this.realSalata = SalataLoader(name);
        this.atributAditional = atributAditional;
    }


    public Salata SalataLoader(String Name){
        double time = 0;

        Salata realSalata = new Salata(time,Name, Restaurant, atributAditional);
        if (realSalata.getTime() < maxTime)
            return realSalata;
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
        vizitor.vizitSalataProxy(this,getCost());
        vizitor.vizitSalata(this.realSalata,getCost());
    }

    @Override
    public Double getCostComanda() {
        return this.realSalata.getCostComanda();
    }

    @Override
    public Double getTime() {
        return null;
    }

    @Override
    public Double getCost() {
        return (double) 0;
    }
}
