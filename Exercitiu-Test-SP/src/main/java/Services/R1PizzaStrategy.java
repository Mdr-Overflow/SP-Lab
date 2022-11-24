package Services;

import java.util.Random;

public class R1PizzaStrategy implements PizzaStrategy {
   private final Double Time;



    public R1PizzaStrategy(String atributAditional) {
        Random rand = new Random();
        Time = Math.random() + rand.nextDouble();

    }

    public Double getTime() {
        return Time;
    }
}
