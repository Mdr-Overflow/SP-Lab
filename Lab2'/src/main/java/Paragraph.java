public class Paragraph extends Element {
    protected String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String print(){
        return this.toString();
    }

}
