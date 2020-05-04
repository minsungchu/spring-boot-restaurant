package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestaurantTest {

    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant(100L, "cloud factory", "hongdae");
        assertEquals(restaurant.getId(), 100L);
        assertEquals(restaurant.getName(), "cloud factory");
        assertEquals(restaurant.getAddress(), "hongdae");
    }

    @Test
    public void information(){
        Restaurant restaurant = new Restaurant(100L, "cloud factory", "hongdae");
        assertEquals(restaurant.getInformation(), "cloud factory in hongdae");
    }

}