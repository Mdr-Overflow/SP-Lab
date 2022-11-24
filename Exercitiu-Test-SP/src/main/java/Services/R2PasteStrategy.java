package Services;

import java.util.Random;

public class R2PasteStrategy implements PasteStrategy {
    private final Double Time;

    public R2PasteStrategy(String atributAditional) {
        Random rand = new Random();
        Time = Math.random() + rand.nextDouble();
    }

    @Override
    public Double getTime() {
        return this.Time;
    }
}
