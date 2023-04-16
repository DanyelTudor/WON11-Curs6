package Interfaces2;

public class Rebel implements Person {
    private int age;
    private String name;

    public Rebel(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}