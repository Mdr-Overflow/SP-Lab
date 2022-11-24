package Services;

import java.util.Random;

public class R2PizzaStrategy implements PizzaStrategy{
    private final Double Time;

    public R2PizzaStrategy(String atributAditional) {
        Random rand = new Random();
        Time = Math.random() + rand.nextDouble();
    }

    public Double getTime() {
        return Time;
    }
}
