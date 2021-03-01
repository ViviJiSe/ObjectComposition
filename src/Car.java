import java.util.Arrays;

public class Car {

    private Engine engine;
    private Transmission transmission;
    private Wheel[] wheels;
    private String brand;
    private String model;


    public Car(Engine engine, Transmission transmission, Wheel[] wheels) {
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.brand = brand;
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", transmission=" + transmission +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
