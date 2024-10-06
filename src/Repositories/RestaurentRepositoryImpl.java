package Repositories;

import Models.Cuisine;
import Models.Restaurant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class RestaurentRepositoryImpl implements Repository<Restaurant> {

    private Map<Long, Restaurant> restaurantMap;
    private static long id = 0;



    public RestaurentRepositoryImpl() {
        restaurantMap = new HashMap<>();

        // put some dummy Restaurants inside repository
        Restaurant restaurant1 = new Restaurant();
        restaurant1.setAddress("Bansur, Alwar");
        restaurant1.setName("Taj");

        // set cuisines
        restaurant1.setCuisines(Arrays.asList(Cuisine.INDIAN, Cuisine.CHINESE));


    }

    public Restaurant save(Restaurant restaurant) {
        if(restaurant.getId() == 0) restaurant.setId(++id);
        restaurantMap.put(restaurant.getId(), restaurant);
        return restaurant;
    }

    public Optional<Restaurant> getById(long id) {
        return Optional.ofNullable(restaurantMap.get(id));
    }
}
