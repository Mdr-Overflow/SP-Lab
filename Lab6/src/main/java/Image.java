import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Image implements Element {
    private final String imagineaCapitolului;
    private final List<Element> listaImagini;

    public Image(String name) {
        this.listaImagini=new ArrayList<>();
        this.imagineaCapitolului = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void print() {
        System.out.println("Image with name: " + imagineaCapitolului);
    }

    @Override
    public void add(Element element) {
        listaImagini.add(element);
    }

    @Override
    public void remove(Element element) {
        listaImagini.remove(element);

    }

    @Override
    public Element get(int indexulElementului) {
        return listaImagini.get(indexulElementului);
    }

    @Override
    public String getNumeleparagrafului() {
        return null;
    }
}