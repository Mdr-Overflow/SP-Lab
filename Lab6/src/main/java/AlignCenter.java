public class AlignCenter implements AlignStrategy {
    public AlignCenter() {
    };
    @Override
    public void render(Paragraph p) {
        System.out.print("##");
        System.out.print(p.getNumeleparagrafului());
        System.out.print("##");
        System.out.println();
    }


}