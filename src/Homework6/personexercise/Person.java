package Homework6.personexercise;

public class Person {
    private String name;
    private int age;

    boolean defaultField;

    private boolean privateField;

    protected boolean protectedField;

    public boolean publicField;

    public void someMethod() {
        defaultField = true;
        privateField = false;
        protectedField = false;
        publicField = true;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 2) {
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}