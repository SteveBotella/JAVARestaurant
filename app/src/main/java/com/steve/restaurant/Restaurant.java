package com.steve.restaurant;

import java.util.List;

public class Restaurant {
    String name;

    List<RestaurantMenuItem> items;

    private class RestaurantMenuItem {
        String name;
        float price;
    }
}
