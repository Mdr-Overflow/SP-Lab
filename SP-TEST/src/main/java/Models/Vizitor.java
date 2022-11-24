package Models;

import Models.*;


public interface Vizitor {
    void vizitSub_Comanda(Sub_Comanda sub_comanda, Double cost);
    void vizitPizza(Pizza pizza, Double cost);
    void vizitPaste(Paste paste, Double cost);
    void vizitSalata(Salata salata, Double cost);

}