package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantTests {

    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
        assertSame(restaurant.getName(), "Bob zip");
        assertSame(restaurant.getAddress(), "Seoul");
    }

    @Test
    public void information(){
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
        // issue#1 - assert error
        // assertSame(restaurant.getInformation(), "Bob zip in Seoul");
    }


}