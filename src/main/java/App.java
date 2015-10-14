import creation.EntityBuilder;
import model.CarEntity;
import model.ServiceEntity;

public class App {
    public static void main(String[] args) {
        ServiceEntity serviceEntity =  EntityBuilder.parse(
                       "{\"brand\": \"Opel\"," +
                        "\"model\": \"TT\"," +
                        "\"service\": \"clean\" }");
        System.out.println(serviceEntity.toString());
    }
}