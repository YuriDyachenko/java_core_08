package kurs;
/*
класс РОБОТ, реализует УЧАСТНИКА и только ВОЗМОЖНОСТЬ БЕГАТЬ, для разнообразия
*/
public class Robot implements AbleToRun, Participle {
    private final String name;
    private final int runLimit;

    public Robot(String name, int runLimit) {
        this.name = name;
        this.runLimit = runLimit;
    }

    @Override
    public String toString() {
        return String.format("Робот %s: могу пробежать %dм", name, runLimit);
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
