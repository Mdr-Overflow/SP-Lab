@SuppressWarnings("ClassCanBeRecord")
public class Author {
    private final String numeleAutorului;

    public Author(String numeleAutorului) {
        this.numeleAutorului = numeleAutorului;
    }

    public void print() {
        System.out.println("Author: " + numeleAutorului);
    }
}