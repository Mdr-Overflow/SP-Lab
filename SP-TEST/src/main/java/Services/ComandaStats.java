package Services;

import Models.*;

import javax.swing.*;

public class ComandaStats implements Vizitor {
    Double costTotal = (double) 0;
    Double costPizza = (double) 0;
    Double costPaste = (double) 0;
    Double costSalata = (double) 0;

    @Override
    public void vizitSub_Comanda(Sub_Comanda sub_comanda, Double cost) {
        System.out.println("Am vizitat " + sub_comanda.toString());
        costTotal+=cost;
    }

    @Override
    public void vizitPizza(Pizza pizza, Double cost) {
        System.out.println("Am vizitat " + pizza.toString());
        costPizza+=pizza.getCostComanda();

    }

    @Override
    public void vizitPaste(Paste paste, Double cost) {
        System.out.println("Am vizitat " + paste.toString());
        costPaste+= paste.getCostComanda();


    }

    @Override
    public void vizitSalata(Salata salata, Double cost) {
        System.out.println("Am vizitat " + salata.toString());
        costSalata+= salata.getCostComanda();


    }



    public void getStats() {
        System.out.println("Total : " + costTotal);
        System.out.println("Pizza : " + costPizza);
        System.out.println("Salate : " + costSalata);
        System.out.println("Paste : " + costPaste);

    }
}