package kurs;
/*
класс КОТ, реализует УЧАСТНИКА и ВОЗМОЖНОСТИ БЕГАТЬ и ПРЫГАТЬ
*/
public class Cat implements AbleToRun, AbleToJump, Participle {
    private final String name;
    private final int runLimit;
    private final int jumpLimit;

    public Cat(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public String toString() {
        return String.format("Кот %s: могу пробежать %dм, перепрыгнуть %dм", name, runLimit, jumpLimit);
    }

    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public void jump(String what) {
        System.out.printf("%s: перепрыгнул\n", what);
    }

    @Override
    public int getRunLimit() {
        return runLimit;
    }

    @Override
    public void run(String what) {
        System.out.printf("%s: пробежал\n", what);
    }
}
