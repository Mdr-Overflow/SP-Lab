public class AlignLeft implements AlignStrategy {
    public AlignLeft() {

    };
    @Override
    public void render(Paragraph p) {
        System.out.print(p.getNumeleparagrafului());
        System.out.print("##");
        System.out.println();
    }
}