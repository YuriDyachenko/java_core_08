package kurs;
/*
класс СТЕНА, реализует ПРЕПЯТСТВИЕ
*/
public class Wall implements Obstructive{
    private final int height;

    Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participle participle) {
        String name = String.format("   стена %dм", height);
        if (!(participle instanceof AbleToJump)) {
            System.out.printf("%s: не умеет, пропускает\n", name);
            return true;
        }
        int jumpLimit = ((AbleToJump) participle).getJumpLimit();
        if (height > jumpLimit) {
            System.out.printf("%s: не допрыгнул %d м\n", name, height - jumpLimit);
            System.out.println("      выбыл из соревнований");
            return false;
        }
        ((AbleToJump) participle).jump(name);
        return true;
    }
}
