package model;

public class ServiceEntity extends Entity {
    private String service;
    public ServiceEntity(String brand, String model, String service) {
        super(brand, model);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return super.toString() + " ServiceEntity{" +
                "service='" + service + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceEntity that = (ServiceEntity) o;

        return service.equals(that.service);

    }

    @Override
    public int hashCode() {
        return service.hashCode();
    }
}
