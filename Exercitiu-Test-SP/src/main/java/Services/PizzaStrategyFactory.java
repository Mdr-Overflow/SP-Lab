package Services;

public class PizzaStrategyFactory {
    private final String Restaurant;
    private Double Time;
    private final String atributAditional;

    public PizzaStrategyFactory(String atributAditional, String restaurant, String aditional) {

        Restaurant = restaurant;
        this.atributAditional = atributAditional;


    }

  public   PizzaStrategy create(){
        PizzaStrategy pizzaStrategy = null;
        if (this.Restaurant.equals("R1")) pizzaStrategy = new R1PizzaStrategy(atributAditional);
        else  pizzaStrategy = new R2PizzaStrategy(atributAditional);
        return pizzaStrategy;
    }

}
