public class Wheel {

    private final double radius;
    private final double pressure;
    private final String type;
    private final String brand;

    public Wheel(double radius, double pressure, String type, String brand) {
        this.radius = radius;
        this.pressure = pressure;
        this.type = type;
        this.brand = brand;
    }

    public double getRadius() {
        return radius;
    }

    public double getPressure() {
        return pressure;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", pressure=" + pressure +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
