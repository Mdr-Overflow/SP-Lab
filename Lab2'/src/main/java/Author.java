import java.util.ArrayList;
import java.util.Collection;

public class Author {
    protected String name;
    Collection<Book> Books = new ArrayList<Book>();

    public Author(String name, Collection<Book> books) {
        this.name = name;
        Books = books;
    }

    public Author(String name) {
        this.name = name;
    }

    public String print(){



        return this.toString();
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", Books=" + Books +
                '}';
    }

}
