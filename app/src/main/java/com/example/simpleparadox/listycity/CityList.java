package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Return the size of city list
     * @return
     * size of city list
     */
    public int countCities(){
        return cities.size();
    }

    /**
     * Delete the city from the list if it is there
     * @param city
     *  A city to delete
     */
    public void deleteCity(City city){
        try{
            cities.remove(city);
        }
        catch (Exception e){
            System.out.println("Exception caught. Message: "+e.toString());
        }
    }

}
