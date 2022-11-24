package Services;

import java.util.Random;

public class R1PasteStrategy implements PasteStrategy{
    private final Double Time;

    public R1PasteStrategy(String atributAditional) {
        Random rand = new Random();
        Time = Math.random() + rand.nextDouble();
    }

    @Override
    public Double getTime() {
        return this.Time;
    }
}
