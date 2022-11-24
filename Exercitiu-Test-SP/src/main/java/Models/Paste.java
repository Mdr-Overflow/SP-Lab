package Models;

import Services.PasteStrategyFactory;

import java.util.Random;


public class Paste implements PasteInterface, Comanda,Vizitee{

    private final PasteStrategyFactory pasteFactory;
    private Double Time;
    private final String Restaurnat;
    private final String Name;
    private final String AtributAditional;
    private  Double cost = (double) 0;

    public Paste(Double time, String name, String Restaurant, String atributAditional) {
        this.Time = time;
        this.Name = name;
        this.Restaurnat = Restaurant;
        AtributAditional = atributAditional;
        pasteFactory = new PasteStrategyFactory(AtributAditional, Restaurant, atributAditional);
        cost = getCost();
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
        vizitor.vizitPaste(this,cost);


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
        return 2.;
    }


}
