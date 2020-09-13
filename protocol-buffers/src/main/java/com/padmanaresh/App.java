package com.padmanaresh;

import com.padmanaresh.Person.Builder;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
      Builder newBuilder = Person.newBuilder();
      newBuilder.setName("Padma Naresh");
      Person person = newBuilder.build();
      System.out.println(person); 

    }
}
