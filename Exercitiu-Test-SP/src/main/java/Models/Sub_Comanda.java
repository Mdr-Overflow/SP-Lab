package Models;

import java.util.ArrayList;
import java.util.List;

public class Sub_Comanda implements Comanda, Vizitee{

    private final List<Comanda> SubComenzi;
    private final String NumeComanda;
    private Double cost = (double) 0;

    public Sub_Comanda(String numeComanda) {
        NumeComanda = numeComanda;
        SubComenzi = new ArrayList<>();

    }

    @Override
    public void print() {
        System.out.println(this.NumeComanda);
        for (Comanda comanda : this.SubComenzi){
            comanda.print();

        }

    }

    @Override
    public void add(Comanda comanda) {
        this.SubComenzi.add(comanda);
    }

    @Override
    public void remove(Comanda comanda) {
        this.SubComenzi.remove(comanda);
    }

    @Override
    public Comanda get(int i) {
        return this.SubComenzi.get(i);
    }

    @Override
    public void accept(Vizitor vizitor) {
        this.cost = 0.; // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! DACA NU FACI ASTA O SA RAMANA VALOAREA

        for (Comanda comanda : SubComenzi){
            comanda.accept(vizitor);
            this.cost += comanda.getCostComanda();
            System.out.println(comanda.getCostComanda() +  " sdsds");
        }
        vizitor.vizitSub_Comanda(this,this.cost);
    }


    @Override
    public Double getCostComanda() {
        for (Comanda comanda : SubComenzi) {
            this.cost += comanda.getCostComanda();
            System.out.println("In for " + comanda.toString() );
        }

        return this.cost;
    }

}
