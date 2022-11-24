package Services;

import Models.Salata;

public class SalataStrategyFactory {
    private final String Restaurant;
    private Double Time;
    private final String atributAditional;

    public SalataStrategyFactory(String atributAditional, String restaurant, String aditional) {

        Restaurant = restaurant;
        this.atributAditional = atributAditional;
    }

    SalataStrategy create(){
        SalataStrategy salataStrategy = null;
        if (this.Restaurant.equals("R1")) salataStrategy = new R1SalataStrategy(atributAditional);
        else  salataStrategy = new R2SalataStrategy(atributAditional);
        return salataStrategy;
    }

}
