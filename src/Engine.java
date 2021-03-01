public class Engine {
    /*
    POJO
     */

    private final int cylinders;
    private final int displacement;
    private final int horsepower;
    private final int torque;
    private final String manufacturer;
    private final String model;

    public Engine(int cylinders, int displacement, int horsepower, int torque, String manufacturer, String model) {
        this.cylinders = cylinders;
        this.displacement = displacement;
        this.horsepower = horsepower;
        this.torque = torque;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getTorque() {
        return torque;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinders=" + cylinders +
                ", displacement=" + displacement +
                ", horsepower=" + horsepower +
                ", torque=" + torque +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
