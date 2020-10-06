/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import util.FileIO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author wangcong
 */
public class CarRepository {

    private static final List<Car> CAR_LIST = new ArrayList<>();
    private static final Map<String, Car> SERIAL_NO_2_CAR = new HashMap<>();

    static {
        getFromCSV();
    }

    public static void save() {
        FileIO.writeFile(CAR_LIST);
    }

    public static int update(Car car) {
        if (!SERIAL_NO_2_CAR.containsKey(car.getSerialNumber())) {
            return 0;
        }
        for (int i = 0; i < CAR_LIST.size(); i++) {
            if (CAR_LIST.get(i).getSerialNumber().equals(car.getSerialNumber())) {
                CAR_LIST.set(i, car);
            }
        }
        save();
        return 1;
    }

    public static List<Car> getCarList() {
        return CAR_LIST;
    }

    public static Set<String> getBrands() {
        return CAR_LIST.stream().map(Car::getBrand).collect(Collectors.toCollection(TreeSet::new));
    }

    public static Car selectBySerialNum(String serialNum) {
        return SERIAL_NO_2_CAR.get(serialNum);
    }

    public static Set<String> getCities() {
        return CAR_LIST.stream().map(Car::getCity).collect(Collectors.toCollection(TreeSet::new));
    }

    public static Set<String> getManufacturers() {
        return CAR_LIST.stream().map(Car::getManufacturers).collect(Collectors.toCollection(TreeSet::new));
    }

    private static void getFromCSV(){
        CAR_LIST.addAll(FileIO.readFile());
        SERIAL_NO_2_CAR.putAll(CAR_LIST.stream().collect(Collectors.toMap(Car::getSerialNumber, car -> car)));
    }
}
