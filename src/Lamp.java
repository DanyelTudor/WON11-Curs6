public class Lamp {
    boolean lightState;
    private String color = "red";
    private int intensity;

    Lamp() {
        System.out.println("Starting construction of lamp");
        lightState = false;
        intensity = 5;
    }

    Lamp(String color, int intensity) {
        System.out.println("Starting construction of lamp " + color + " and intensity " + intensity);
        this.color = color;
        this.intensity = intensity;
    }

    public void turnOn() {
        System.out.println("Turning on with color " + color + " with intensity " + intensity);
        lightState = true;
    }

    public void turnOff() {
        System.out.println("Turning off");
        lightState = false;
    }

    public void increaseIntensity() {
        this.intensity++;
    }
}