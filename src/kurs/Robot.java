package kurs;

public class Robot implements AbleToRun {
    private final String name;
    private final double runLimit;

    public Robot(String name, double runLimit) {
        this.name = name;
        this.runLimit = runLimit;
    }

    @Override
    public String toString() {
        return String.format("Робот %s: могу пробежать %.1f м", name, runLimit);
    }

    @Override
    public double getRunLimit() {
        return runLimit;
    }
}
