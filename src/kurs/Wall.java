package kurs;

public class Wall implements Obstructive{
    private final double height;

    Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participle participle) {
        String name = String.format("   стена %.1f м", height);
        if (!(participle instanceof AbleToJump)) {
            System.out.printf("%s: не умеет, переход к следующему препятствию\n", name);
            return true;
        }
        double jumpLimit = ((AbleToJump) participle).getJumpLimit();
        if (height > jumpLimit) {
            System.out.printf("%s: не допрыгнул %.1f м\n", name, height - jumpLimit);
            System.out.println("      выбыл из соревнований");
            return false;
        }
        System.out.printf("%s: перепрыгнул\n", name);
        return true;
    }
}
