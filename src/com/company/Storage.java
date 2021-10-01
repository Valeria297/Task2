package com.company;

import com.company.Cars.Car;
import com.company.Cars.CarBMW;
import com.company.Cars.JaguarCar;
import com.company.Cars.JeepCar;
import com.company.Enums.Models;

import java.util.ArrayList;

public class Storage {
    protected ArrayList<Object> storage = new ArrayList<>();

    public void storage() {
        System.out.println("Storage: " + storage);
    }

    public void addStorage(Object object) {
        storage.add(object);
    }

    public void deleteFromStorage(Object object) {
        Object ob = new Object();
        for (Object ob1 : storage) {
            if (ob1.equals(object)) {
                ob = ob1;
            }
        }
        storage.remove(ob);
    }

    public void checkCar(Car car) {
        Object ob = new CarBMW();

        for (int i = 0; i < storage.size(); i++) {
            if (!car.compareCars(car, storage.get(i))) {
                storage.add(car);
            } else {
                storage.get(i);
            }
        }
    }

}
