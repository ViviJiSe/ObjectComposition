public class Transmission {

    private final String generalType;
    private final String specificType;

    public Transmission(String generalType, String specificType) {
        this.generalType = generalType;
        this.specificType = specificType;
    }

    public String getGeneralType() {
        return generalType;
    }

    public String getSpecificType() {
        return specificType;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "generalType='" + generalType + '\'' +
                ", specificType='" + specificType + '\'' +
                '}';
    }
}
