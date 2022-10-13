import java.util.ArrayList;
import java.util.Collection;

public class Book {
    protected String title;
    protected Author author;
    public TableOfContents tableOfContents;
    public Collection<Chapter> Chapters = new ArrayList<Chapter>();


    public Book(String title, Author author, TableOfContents tableOfContents, Collection<Chapter> chapters) {
        this.title = title;
        this.author = author;
        this.tableOfContents = tableOfContents;
        Chapters = chapters;
    }

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }


    public void addAuthor(Author author) {

    }

    public int createChapter(String string) {
        Chapter chapter = new Chapter(string);
        this.Chapters.add(chapter);
        return this.Chapters.stream().toList().indexOf(chapter);
    }

    public Chapter getChapter(int indexChapterOne) {
        return this.Chapters.stream().toList().get(indexChapterOne);
    }
}
