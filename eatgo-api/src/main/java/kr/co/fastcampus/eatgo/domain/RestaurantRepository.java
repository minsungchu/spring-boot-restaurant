package kr.co.fastcampus.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {

    private List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantRepository() {
        restaurants.add(new Restaurant(100L,"cloud factory","hongdae"));
        restaurants.add(new Restaurant(200L,"gimbob heaven","hongdae"));
    }

    public List<Restaurant> findAll() {

        return restaurants;
    }

    public Restaurant findById(Long id) {
        Restaurant restaurant = restaurants.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);
        return restaurant;
    }
}
