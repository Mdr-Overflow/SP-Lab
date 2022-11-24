import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element {
    private final String numeleParagrafului;
    private final List<Element> listaParagrafe;
    private AlignStrategy a=null;

    public Paragraph(String numeleParagrafului) {
        this.numeleParagrafului = numeleParagrafului;
        this.listaParagrafe = new ArrayList<>();
    }

    void setAlignStrategy(AlignStrategy a)
    {
        this.a=a;
    }
    @Override
    public void print() {
        if(a!=null){
            a.render(this);
        }
        else
            System.out.println(this.numeleParagrafului);
    }

    @Override
    public void add(Element element) {
        listaParagrafe.add(element);
    }

    @Override
    public void remove(Element element) {
        listaParagrafe.remove(element);

    }

    @Override
    public Element get(int indexulElementului) {
        return listaParagrafe.get(indexulElementului);
    }

    @Override
    public String getNumeleparagrafului() {
        return this.numeleParagrafului;
    }
}