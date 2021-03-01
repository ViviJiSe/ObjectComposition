public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine(4,
                1600,
                120,
                150,
                "TicoCars",
                "GalloPinto"
        );

        Transmission transmission = new Transmission(
                "Automatic",
                "CVT"
        );

        Wheel[] wheels = new Wheel[4];

        for (int wheelNumber = 0; wheelNumber < wheels.length; ++wheelNumber) {
            wheels[wheelNumber] = new Wheel(18, 40, "track", "Tico Llantas");
        }

        Car ticoCar = new Car(engine, transmission, wheels);

    }

}
