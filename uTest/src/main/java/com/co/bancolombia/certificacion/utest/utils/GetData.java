package com.co.bancolombia.certificacion.utest.utils;

import com.co.bancolombia.certificacion.utest.models.RegisterData;
import com.co.bancolombia.certificacion.utest.models.RegisterDevices;
import com.co.bancolombia.certificacion.utest.models.RegisterLocation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class GetData {

    private static AtomicReference<AtomicReferenceArray<String>> readData() throws IOException {
        AtomicReference<AtomicReferenceArray<String>> attributes = new AtomicReference<>(new AtomicReferenceArray<>(new String[0]));
        List<String> lines = Files.readAllLines(Paths.get("src/test/resources/files/data.csv"));
        lines.forEach(line -> {
            attributes.set(new AtomicReferenceArray<>(line.split(";")));
        });

        return attributes;
    }

    public static RegisterData getDataUSer() throws IOException {
        AtomicReference<AtomicReferenceArray<String>> attributes = readData();
        String name = attributes.get().get(0);
        String lastName = attributes.get().get(1);
        String email = attributes.get().get(2);
        String birthday = attributes.get().get(3);
        String birthMonth = attributes.get().get(4);
        String birthYear = attributes.get().get(5);
        return new RegisterData(name, lastName, email, birthday, birthMonth, birthYear);
    }

    public static RegisterLocation getDataLocation() throws IOException {
        AtomicReference<AtomicReferenceArray<String>> attributes = readData();
        String city = attributes.get().get(6);
        String zip = attributes.get().get(7);
        String country = attributes.get().get(8);

        return new RegisterLocation(city, zip, country);
    }

    public static RegisterDevices getDataDevices() throws IOException {
        AtomicReference<AtomicReferenceArray<String>> attributes = readData();
        String brand = attributes.get().get(9);
        String devices = attributes.get().get(10);
        String os = attributes.get().get(11);
        String password = attributes.get().get(12);

        return new RegisterDevices(brand, devices, os, password);
    }


}
