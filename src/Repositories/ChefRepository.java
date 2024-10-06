package Repositories;

import Models.Chef;
import Models.ChefLevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ChefRepository implements Repository<Chef> {

    private Map<Long, Chef> chefMap;
    private static long id = 0;

    public ChefRepository() {
        chefMap = new HashMap<>();
        // create dummy chef
        Chef chef1 = new Chef();
        chef1.setChefLevel(ChefLevel.COMMIS);
        chef1.setEmail("chef1@gmail.com");
        chef1.setName("Dev Swami");
        chef1.setPhoneNumber("9876543210");
        save(chef1);

        Chef chef2 = new Chef();
        chef2.setChefLevel(ChefLevel.HEAD);
        chef2.setEmail("chef2@gmail.com");
        chef2.setName("Anand Swami");
        chef2.setPhoneNumber("98765432");
        save(chef2);

    }

    @Override
    public Chef save(Chef chef) {
        if(chef.getId() == 0) {
            chef.setId(++id);
        }
        chefMap.put(chef.getId(), chef);
        return chef;
    }

    @Override
    public Optional<Chef> getById(long id) {
        return Optional.ofNullable(chefMap.get(id));
    }
}
