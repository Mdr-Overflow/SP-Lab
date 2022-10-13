public class Image extends Element {
    protected String imageName;
    protected SubChapter subChapter;

    public Image(String imageName) {
        this.imageName = imageName;
    }



    public String print(){

        return this.toString();
    }
}
