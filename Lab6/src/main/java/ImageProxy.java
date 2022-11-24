public class ImageProxy implements Element, Picture{
    private final String imagineaProxy;
    private int dimensiune;
    private Image imagine;

    public ImageProxy(String imagineaProxy) {
        this.imagineaProxy = imagineaProxy;
    }

    public Image loadImage()
    {
        if(imagine==null){
            imagine=new Image(imagineaProxy);
        }
        return imagine;
    }
    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int indexulElementului) {
        return null;
    }

    @Override
    public String getNumeleparagrafului() {
        return null;
    }
}