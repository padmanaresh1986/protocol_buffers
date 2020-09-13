package com.padmanaresh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.sound.sampled.SourceDataLine;

import com.padmanaresh.Person.Address;
import com.padmanaresh.Person.Builder;
import com.padmanaresh.util.Date;

public class PersonWriteToFilemain {

    public static void main(String[] args) throws IOException {
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

                     // writing protocol buffer message to file
                     FileOutputStream out = new FileOutputStream("person_messge.bin");
                     person.writeTo(out);
                     out.close();

                     System.out.println(" Written to file completed");

                     // read from protocol bugger file
                     FileInputStream in = new FileInputStream("person_messge.bin");
                     Person parseFrom = Person.parseFrom(in);
                     in.close();
                     System.out.println("This object parsed from binary file " + parseFrom);

    }
    
}
