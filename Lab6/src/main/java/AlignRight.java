public class AlignRight implements AlignStrategy {
    public AlignRight() {

    }
    @Override
    public void render(Paragraph p) {
        System.out.print("##");
        System.out.print(p.getNumeleparagrafului());
        System.out.println();
    }
}