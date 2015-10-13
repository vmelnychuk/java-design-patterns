
import static org.junit.Assert.assertEquals;

import com.google.gson.Gson;
import creation.EntityBuilder;
import model.CarEntity;
import model.PartEntity;
import model.ServiceEntity;
import org.junit.Test;

public class AppTest {
    @Test
    public void carEntityTest() {
        assertEquals( new CarEntity("Opel", "TT", "2C3KA53G18H320807"),
                EntityBuilder.parse("{\"brand\": \"Opel\", \"model\": \"TT\", \"vin\": \"2C3KA53G18H320807\"}"));
    }

    @Test
    public void partEntityTest() {
        assertEquals(new PartEntity("BMW", "M3", 123456),
                EntityBuilder.parse("{\"brand\": \"BMW\", \"model\": \"M3\", \"id\": \"123456\"}"));
    }

    @Test
    public void serviceEntityTest() {
        assertEquals(new ServiceEntity("Porsche", "911", "clean"),
                EntityBuilder.parse("{\"brand\": \"BMW\", \"model\": \"M3\", \"service\":\"clean\"}"));
    }
}