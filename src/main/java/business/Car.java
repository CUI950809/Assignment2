/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 * @author wangcong
 */
public class Car implements Cloneable {
    private String serialNumber;
    private String brand;
    private int seatNumber;
    private String modelNumber;
    private String manufacturers;
    private String manufacturerYear;
    private String city;
    private String maintain;
    private String updateTime;
    private String status;

    @Override
    public Car clone() {
        Car copy = new Car();
        copy.setSerialNumber(this.getSerialNumber());
        copy.setBrand(this.getBrand());
        copy.setSeatNumber(this.getSeatNumber());
        copy.setModelNumber(this.getModelNumber());
        copy.setManufacturers(this.getManufacturers());
        copy.setManufacturerYear(this.getManufacturerYear());
        copy.setCity(this.getCity());
        copy.setMaintain(this.getMaintain());
        copy.setUpdateTime(this.getUpdateTime());
        copy.setStatus(this.getStatus());
        return copy;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String Manufacturers) {
        this.manufacturers = Manufacturers;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMaintain() {
        return maintain;
    }

    public void setMaintain(String maintain) {
        this.maintain = maintain;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getManufacturerYear() {
        return manufacturerYear;
    }

    public void setManufacturerYear(String manufacturerYear) {
        this.manufacturerYear = manufacturerYear;
    }
}
