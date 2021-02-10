package kurs;
/*
класс БЕГОВАЯ ДОРОЖКА, реализует ПРЕПЯТСТВИЕ
*/
public class Treadmill implements Obstructive{
    private final int length;

    Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participle participle) {
        String name = String.format("   беговая дорожка %dм", length);
        if (!(participle instanceof AbleToRun)) {
            System.out.printf("%s: не умеет, пропускает\n", name);
            return true;
        }
        int runLimit = ((AbleToRun) participle).getRunLimit();
        if (length > runLimit) {
            System.out.printf("%s: не добежал %d м\n", name,  length - runLimit);
            System.out.println("      выбыл из соревнований");
            return false;
        }
        ((AbleToRun) participle).run(name);
        return true;
    }
}
