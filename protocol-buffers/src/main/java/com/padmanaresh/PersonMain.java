package com.padmanaresh;

import com.padmanaresh.Person.Address;
import com.padmanaresh.Person.Builder;
import com.padmanaresh.util.Date;

public class PersonMain {
    public static void main(String[] args) {
        System.out.println("This is person main class");
        Builder personBuilder = Person.newBuilder();
        Person person = personBuilder.setFirstName("Padma")
                     .setMiddleName("Naresh")
                     .setLastName("Motupalli")
                     .setAge(26)
                     .setHeight(180)
                     .addPhoneNumbers("9988776655")
                     .addPhoneNumbers("8899776644")
                     .setEyeColorValue(3)
                     .setDateOfBirth(Date.newBuilder()
                                            .setDay(27)
                                            .setMonth(06)
                                            .setYear(1986).build())
                     .addAddresses(Address.newBuilder()
                                   .setAddressLine1("Hyderabad")
                                   .setAddressLine2("Telangana")
                                   .setZipCode("500084")
                                   .setCountry("India").build())
                     .addAddresses(Address.newBuilder()
                                   .setAddressLine1("East Godavari")
                                   .setAddressLine2("Andhra Pradesh")
                                   .setZipCode("533253")
                                   .setCountry("India").build())
                     
                     .build();

        System.out.println("Created Person object is \\n" + person);
    }


}
