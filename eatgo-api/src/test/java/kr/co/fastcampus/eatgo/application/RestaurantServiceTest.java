package kr.co.fastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestaurantServiceTest {

    private RestaurantService restaurantService;
    private RestaurantRepository restaurantRepository;
    private MenuItemRepository menuItemRepository;


    @BeforeEach // Test 1이 실행되기전에 실행되고, Test 2가 실행회디 전에 다시 실행된다. 즉, 각 테스트 실행전에 한번씩 실행된다.
    public void setUp(){
        restaurantRepository = new RestaurantRepositoryImpl();
        menuItemRepository = new MenuItemRepositoryImpl();

        restaurantService = new RestaurantService(restaurantRepository, menuItemRepository);
    }

    @Test
    public void getRestaurants() {
        List<Restaurant> restaurants = restaurantService.getRestaurants();

        Restaurant restaurant = restaurants.get(0);

        assertEquals(restaurant.getId(), 1004L);
    }

    @Test
    public void getRestaurant(){
        Restaurant restaurant = restaurantService.getRestaurant(1004L);

        assertEquals(restaurant.getId(), 1004L);

        MenuItem menuItem = restaurant.getMenuItems().get(0);

        assertEquals(menuItem.getName(), "Kimchi");
    }

}