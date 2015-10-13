package model;

public class CarEntity extends Entity {
    private String vin;

    public CarEntity(String brand, String model, String vin) {
        super(brand, model);
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return super.toString() + " CarEntity{" +
                "vin='" + vin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarEntity carEntity = (CarEntity) o;

        return vin.equals(carEntity.vin);

    }

    @Override
    public int hashCode() {
        return vin.hashCode();
    }
}
