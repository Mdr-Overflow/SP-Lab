package Services;

public class PasteStrategyFactory {



    private final String Restaurant;
    private Double Time;
    private final String atributAditional;

    public PasteStrategyFactory(String atributAditional, String restaurant, String atributAditional1) {
        Restaurant = restaurant;
        this.atributAditional = atributAditional;

    }

    PasteStrategy create(){
        PasteStrategy pasteStrategy = null;
        if (this.Restaurant.equals("R1")) pasteStrategy = new R1PasteStrategy(atributAditional);
        else  pasteStrategy = new R2PasteStrategy(atributAditional);
        return pasteStrategy;
    }

}
