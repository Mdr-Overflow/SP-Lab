package Models;


public class Paste implements PasteInterface, Comanda,Vizitee{


    private Double Time;
    private final String Restaurnat;
    private final String Name;

    private  Double cost = (double) 0;

    public Paste( String name, String Restaurant) {

        this.Name = name;
        this.Restaurnat = Restaurant;


        cost = getCost();
    }

    @Override
    public String toString() {
        return "Paste{" +
                "Time=" + Time +
                ", Restaurnat='" + Restaurnat + '\'' +
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
        return getCost();
    }


    @Override
    public Double getCost() {
        return 2.;
    }


}