package com.padmanaresh;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.padmanaresh.Person.Address;
import com.padmanaresh.Person.Builder;
import com.padmanaresh.util.Date;

public class PersonJsonMain {

    public static void main(String[] args) throws InvalidProtocolBufferException {
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

                     // converting protocol buffer to json string
                     String jsonString = JsonFormat.printer().print(person);
                     System.out.println("Object converted to json \\n" + jsonString);

                     //converting json string to protocol buffer message
                     Builder personBuilder2 = Person.newBuilder();
                     JsonFormat.parser().ignoringUnknownFields().merge(jsonString, personBuilder2);
                     Person person2 = personBuilder2.build();
                     System.out.println("Below object s parsed from json \\n" + person2);

                    

    }
    
}
