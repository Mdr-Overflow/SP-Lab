import Models.*;
import Services.ComandaStats;



public class Main {



    public static void main(String[] args) throws Exception {

        Sub_Comanda sub_comanda = new Sub_Comanda("Marea Comanda");
        Pizza pizza = new Pizza("Prosciuto","R1");
        Paste paste = new Paste("Fabreze","R2");
        Salata salata = new Salata("Coleslaw","KFC");
        sub_comanda.add(pizza);
        sub_comanda.add(salata);
        System.out.println("Salata adaugata :");
        salata.print();

        System.out.println();

        ComandaStats stats = new ComandaStats();
        sub_comanda.accept(stats);

        System.out.println();

        sub_comanda.print();
        stats.getStats();

        System.out.println();

        sub_comanda.add(paste);
        sub_comanda.print();

        System.out.println();

        ComandaStats stats2 = new ComandaStats();
        sub_comanda.accept(stats2);
        stats2.getStats();

        System.out.println();

        sub_comanda.remove(pizza);
        sub_comanda.print();

        System.out.println();

        ComandaStats stats3 = new ComandaStats();
        sub_comanda.accept(stats3);
        stats3.getStats();




    }
}