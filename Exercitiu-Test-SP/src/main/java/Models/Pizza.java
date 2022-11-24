package Models;

import Services.PizzaStrategy;
import Services.PizzaStrategyFactory;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Pizza implements Comanda,PizzaInterface, Vizitee {
    private final PizzaStrategyFactory pizzaFactory;
    private PizzaStrategy pizzaStrategy;
    private Double Time;
    private final String Restaurnat;
    private final String Name;
    private final String AtributAditional;
    private  Double cost = (double) 0;

    public Pizza(Double time, String name, String Restaurant, String atributAditional) {
        this.Time = time;
        this.Name = name;
        this.Restaurnat = Restaurant;
        AtributAditional = atributAditional;
        pizzaFactory = new PizzaStrategyFactory(AtributAditional, Restaurant, atributAditional);

        pizzaStrategy = pizzaFactory.create();
        this.Time = pizzaStrategy.getTime();
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
        vizitor.vizitPizza(this, this.cost);
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
        double rand = 1;
        return rand;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaFactory=" + pizzaFactory +
                ", pizzaStrategy=" + pizzaStrategy +
                ", Time=" + Time +
                ", Restaurnat='" + Restaurnat + '\'' +
                ", Name='" + Name + '\'' +
                ", AtributAditional='" + AtributAditional + '\'' +
                ", cost=" + cost +
                '}';
    }
}
