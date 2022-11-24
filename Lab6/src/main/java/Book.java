import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class Book {
    private final String titluCartii;
    private final List<String> elementeleListei;
    private final List<Element> listaElemente;
    private final List<Author> listaAutori;

    public Book(String titlulCartii) {
        this.titluCartii = titlulCartii;
        this.elementeleListei = new ArrayList<>();
        this.listaElemente = new ArrayList<>();
        this.listaAutori = new ArrayList<>();
    }


    public void addAuthor(Author autorul) {
        listaAutori.add(autorul);
    }

    public void addContent(Element element) {
        listaElemente.add(element);
    }

    public void print() {
        System.out.println("Book: " + titluCartii + "\n");
        System.out.println("Authors: ");
        for (Author author : listaAutori) {
            author.print();
        }
        System.out.println();
        for (Element element : listaElemente) {
            element.print();
        }
    }
}