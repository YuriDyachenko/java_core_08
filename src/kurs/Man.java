package kurs;

public class Man implements AbleToRun, AbleToJump {
    private final String name;
    private final double runLimit;
    private final double jumpLimit;

    public Man(String name, double runLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public String toString() {
        return String.format("Человек %s: могу пробежать %.1f м, перепрыгнуть %.1f м", name, runLimit, jumpLimit);
    }

    @Override
    public double getRunLimit() {
        return runLimit;
    }

    @Override
    public double getJumpLimit() {
        return jumpLimit;
    }
}
