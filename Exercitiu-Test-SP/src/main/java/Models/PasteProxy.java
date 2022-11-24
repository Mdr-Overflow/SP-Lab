package Models;

public class PasteProxy implements PasteInterface, Comanda, Vizitee{
    private final Double maxTime ;
    private final String Restaurant;
    private Paste realPaste;
    private final String name;
    private final String atributAditional;

    public PasteProxy(Double maxTime, String restaurant, String name, String atributAditional) {
        this.maxTime = maxTime;
        Restaurant = restaurant;
        this.name = name;
        this.realPaste = PasteLoader(name);
        this.atributAditional = atributAditional;
    }


    public Paste PasteLoader(String Name){
        double time = 0;

        Paste realPaste = new Paste(time,Name, Restaurant, atributAditional);
        if (realPaste.getTime() < maxTime)
            return realPaste;
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
        vizitor.vizitPasteProxy(this,getCost());
        vizitor.vizitPaste(this.realPaste,getCost());
    }

    @Override
    public Double getCostComanda() {
        return this.realPaste.getCostComanda();
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

