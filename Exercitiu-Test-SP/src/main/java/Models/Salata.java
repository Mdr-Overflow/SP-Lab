package Models;


import Services.SalataStrategyFactory;

import java.util.Random;

public class Salata  implements Comanda,SalataInterface , Vizitee{
    private final SalataStrategyFactory salataFactory;
    private Double Time;
    private final String Restaurnat;
    private final String Name;
    private final String AtributAditional;
    private Double cost = (double) 0;

    public Salata(Double time, String name, String Restaurant, String atributAditional) {
        this.Time = time;
        this.Name = name;
        this.Restaurnat = Restaurant;
        AtributAditional = atributAditional;
        salataFactory = new SalataStrategyFactory(AtributAditional, Restaurant, atributAditional);
        this.cost = getCost();
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
        vizitor.vizitSalata(this, this.cost);
    }

    @Override
    public Double getCostComanda() {
        return getCost();
    }

    @Override
    public Double getTime() {
        return this.Time;
    }

    @Override
    public Double getCost() {

        return 3.;
    }
}
