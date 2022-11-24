package Services;

import java.util.Random;

public class R1SalataStrategy implements SalataStrategy{
    private final Double Time;

    public R1SalataStrategy(String atributAditional) {
        Random rand = new Random();
        Time = Math.random() + rand.nextDouble();
    }

    @Override
    public Double getTime() {
        return this.Time;
    }
}