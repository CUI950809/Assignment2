package util;

import business.Car;
import com.csvreader.CsvWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

    private static final String CAR_INFO_CSV = "CarInfo1.csv";

    public static ArrayList<Car> readFile() {
        ArrayList<Car> data = new ArrayList<>();
        try (BufferedReader inline = new BufferedReader(new FileReader(CAR_INFO_CSV))) {
            String inputline;
            String[] fieldNames;
            while ((inputline = inline.readLine()) != null) {
                fieldNames = inputline.split(",");
                Car car = new Car();
                car.setSerialNumber(fieldNames[0]);
                car.setStatus(fieldNames[1]);
                car.setBrand(fieldNames[2]);
                car.setManufacturerYear(fieldNames[3]);
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

    public static void writeFile(List<Car> carList) {
        CsvWriter csvWriter = new CsvWriter(CAR_INFO_CSV, ',', StandardCharsets.UTF_8);
        try {
            for (Car car : carList) {
                String[] record = {
                    car.getSerialNumber(),
                    car.getStatus(),
                    car.getBrand(),
                    car.getManufacturerYear(),
                    String.valueOf(car.getSeatNumber()),
                    car.getModelNumber(),
                    car.getManufacturers(),
                    car.getCity(),
                    car.getMaintain(),
                    car.getUpdateTime()};
                csvWriter.writeRecord(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        csvWriter.close();
    }
}
