/**
 * Instead of passing arguments into our function to specify what our data is, we could pass in arguments
 * to specify what was done to that data.
 * This is one of the important things that first class functions let us do
 */
package com.company;

import com.company.ownInterfaces.NoArgsFunction;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Learn4FunctionsASData {

    protected static class Person {
        private String name;
        private Integer age;

        //constructor
        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
            this.age = age;
        }
        //Readable console output in JSON format
        public String toString() {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(this);
        }
    }

    protected static class DataLoader {
        public final NoArgsFunction<Person> loadPerson;

        public DataLoader(Boolean isDevelopment) {
            this.loadPerson = isDevelopment
                    ? this::loadPerson_Real_Data
                    : this::loadPerson_Mocked_Data;
        }

        private Person loadPerson_Real_Data() {
            System.out.println("Loading person...");
            return new Person("Deepa Perera_Real", 30);
        }

        private Person loadPerson_Mocked_Data() {
            System.out.println("Loading mocked person data...");
            return new Person("Deepa Perera_mocked", 30);
        }
    }

    public static void main(String[] args) {
        final Boolean IS_DEVELOPMENT = true;

        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply().toString());
    }

}
