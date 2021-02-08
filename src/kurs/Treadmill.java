package kurs;

public class Treadmill implements Obstructive{
    private final double length;

    Treadmill(double length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participle participle) {
        String name = String.format("   беговая дорожка %.1f м", length);
        if (!(participle instanceof AbleToRun)) {
            System.out.printf("%s: не умеет, переход к следующему препятствию\n", name);
            return true;
        }
        double runLimit = ((AbleToRun) participle).getRunLimit();
        if (length > runLimit) {
            System.out.printf("%s: не добежал %.1f м\n", name,  length - runLimit);
            System.out.println("      выбыл из соревнований");
            return false;
        }
        System.out.printf("%s: пробежал\n", name);
        return true;
    }
}
