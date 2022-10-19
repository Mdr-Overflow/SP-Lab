import java.util.ArrayList;
import java.util.Collection;

public class SubChapter {
    protected String name;
    protected Chapter chapter;
    Collection <Element> elements = new ArrayList<Element>();

    public SubChapter(String name) {
        this.name = name;
    }

    public SubChapter(String name, Chapter chapter, Collection<Element> elements) {
        this.name = name;
        this.chapter = chapter;
        this.elements = elements;
    }

    public String print(){
        return this.toString();
    }

    public void createNewParagraph(String string) {
    this.elements.add(new Paragraph(string));

    }

    public void createNewImage(String string) {
        this.elements.add(new Image(string));
    }

    public void createNewTable(String string) {
        this.elements.add(new Table(string));
    }
}
