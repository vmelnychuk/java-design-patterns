package creation;

import com.google.gson.Gson;
import model.*;

import java.util.HashMap;
import java.util.Map;

public abstract class EntityBuilder {

    private static Map<String, Class<? extends Entity>> keys = new HashMap<>();
    private static Map<Class<? extends Entity>, EntityBuilder> builder = new HashMap<>();

    static {
        keys.put("vin",CarEntity.class);
        keys.put("id",PartEntity.class);
        keys.put("service",ServiceEntity.class);

        builder.put(CarEntity.class, new EntityBuilder() {
            @Override
            public Entity build(String json) {
                return(new Gson()).fromJson(json, CarEntity.class);
            }
        });
        builder.put(PartEntity.class, new EntityBuilder() {
            @Override
            public Entity build(String json) {
                return(new Gson()).fromJson(json, PartEntity.class);
            }
        });
        builder.put(ServiceEntity.class, new EntityBuilder() {
            @Override
            public Entity build(String json) {
                return(new Gson()).fromJson(json, ServiceEntity.class);
            }
        });
    }

    public abstract Entity build(String json);

    public static <R extends Entity>R parse(String json) {
        Map parametersMap  = (new Gson()).fromJson(json, Map.class);
        for(Map.Entry<String,Class<? extends Entity>> entry : keys.entrySet()){
            if(parametersMap.containsKey(entry.getKey())){
                return (R)builder.get(entry.getValue()).build(json);
            }
        }
        return null;
    }
}
