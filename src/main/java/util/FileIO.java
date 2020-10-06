package util;

import business.Car;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class FileIO {

    //private CarList carList;

    public static ArrayList<Car> readFile(String filename) {
        ArrayList<Car> data = new ArrayList<>();
        try (BufferedReader inline = new BufferedReader(new FileReader(filename))) {
            String inputline;
            String[] fieldNames;
            while ((inputline = inline.readLine()) != null) {
                fieldNames = inputline.split(",");
                Car car = new Car();
                car.setSerialNumber(fieldNames[0]);
                car.setStatus(fieldNames[1]);
                car.setBrand(fieldNames[2]);
                car.setYear(fieldNames[3]);
                car.setSeatNumber(Integer.parseInt(fieldNames[4]));
                car.setModelNumber(fieldNames[5]);
                car.setManufacturers(fieldNames[6]);
                car.setCity(fieldNames[7]);
                car.setMaintain(fieldNames[8]);
                car.setUpdateTime(fieldNames[9]);
                data.add(car);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

    //temporary
    public static Date stringToDate(String time) {
        DateFormat format = new SimpleDateFormat("dd-MM-yyyy");//日期格式
        Date date = null;
        try {
            date = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
