public class Table extends Element {
    protected String title ;
    protected  SubChapter subChapter;
    public Table(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Table{" +
                "title='" + title + '\'' +
                '}';
    }



    public String print(){
        return this.toString();
    }



}
