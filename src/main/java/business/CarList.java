/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import util.FileIO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author wangcong
 */
public class CarList {

    private static final List<Car> CAR_LIST = new ArrayList<>();

    static {
        getFromCSV();
    }

    public static List<Car> getCarList() {
        return CAR_LIST;
    }

    public static Set<String> getBrands() {
        return CAR_LIST.stream().map(Car::getBrand).collect(Collectors.toCollection(TreeSet::new));
    }

    public static Set<String> getCities() {
        return CAR_LIST.stream().map(Car::getCity).collect(Collectors.toCollection(TreeSet::new));
    }

    public static Set<String> getManufacturers() {
        return CAR_LIST.stream().map(Car::getManufacturers).collect(Collectors.toCollection(TreeSet::new));
    }

    private static void getFromCSV(){
        CAR_LIST.addAll(FileIO.readFile("CarInfo.csv"));
    }
}
