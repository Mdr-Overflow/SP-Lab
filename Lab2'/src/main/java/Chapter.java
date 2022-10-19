import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter {
    protected String name;
    Collection<SubChapter> subChapters = new ArrayList<SubChapter>() ;
    protected Book book;
    public Chapter(String name, Collection<SubChapter> subChapters) {
        this.name = name;
        this.subChapters = subChapters;
    }

    public Chapter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", subChapters=" + subChapters +
                '}';
    }

    public String print(){


        return this.toString();
    }

    public int createSubChapter(String string) {
        SubChapter subChapter = new SubChapter(string);
        this.subChapters.add(subChapter);
        return this.subChapters.stream().toList().indexOf(subChapter);

    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return this.subChapters.stream().toList().get(indexSubChapterOneOne);
    }
}
