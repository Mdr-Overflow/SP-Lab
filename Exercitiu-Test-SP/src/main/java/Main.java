import Models.*;
import Services.ComandaStats;

public class Main {

    public static void main(String[] args) throws Exception {

        Sub_Comanda sub_comanda = new Sub_Comanda("Marea Comanda");
        PizzaProxy pizzaProxy = new PizzaProxy(10.,"R1","Prosciuto","Sos Picant");
        PasteProxy pasteProxy = new PasteProxy(3.,"R2","Fabreze","Cuisoare");
        sub_comanda.add(pizzaProxy);
        ComandaStats stats = new ComandaStats();
        sub_comanda.accept(stats);

        sub_comanda.print();
        stats.getStats();

        sub_comanda.add(pasteProxy);
        sub_comanda.print();

        ComandaStats stats2 = new ComandaStats();
        sub_comanda.accept(stats2);
        stats2.getStats();

        sub_comanda.remove(pizzaProxy);
        sub_comanda.print();

        ComandaStats stats3 = new ComandaStats();
        sub_comanda.accept(stats3);
        stats3.getStats();



        System.out.println("FINAL");
    }
}