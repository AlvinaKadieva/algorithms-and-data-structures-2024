package task3;

public class Ship implements Nameable {
    private final String name;

    public Ship(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}