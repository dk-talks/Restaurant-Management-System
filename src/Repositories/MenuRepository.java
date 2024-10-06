package Repositories;

import Models.Dish;
import Models.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MenuRepository implements Repository<Menu>{

    private Map<Long, Dish> menuMap = new HashMap<>();
    private static long id = 0;

    @Override
    public Menu save(Menu menu) {
        return null;
    }

    @Override
    public Optional<Menu> getById(long id) {
        return Optional.empty();
    }
}
