package Models;


public class Paste implements  Comanda,Vizitee{



    private final String Restaurnat;
    private final String Name;

    private  Double cost = (double) 0;

    public Paste( String name, String Restaurant, Double cost) {

        this.Name = name;
        this.Restaurnat = Restaurant;
        this.cost = cost;


    }

    @Override
    public String toString() {
        return "Paste{" +

                "Restaurnat='" + Restaurnat + '\'' +
                ", Name='" + Name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Paste" +this.Name);
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
        return this.cost;
    }





}