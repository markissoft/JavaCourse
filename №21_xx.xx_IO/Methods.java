package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class Methods {
    static void serialize() {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Employee p = new Employee(1, "Rustam", 700);
            oos.writeObject(p);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void deserialize() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Employee p = (Employee)ois.readObject();
            System.out.printf(p.getName() + " " +  p.getSalary());
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void collectionSeDe() {

        String filename = "people.dat";

        ArrayList<Employee> people = new ArrayList<Employee>();
        people.add(new Employee(30, "Tom", 1750));
        people.add(new Employee(33, "Sam", 1780));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            oos.writeObject(people);
            System.out.println("File has been written");
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        // deserialization
        ArrayList<Employee> newPeople= new ArrayList<Employee>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {

            newPeople = ((ArrayList<Employee>)ois.readObject());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        for(Employee p : newPeople)
            System.out.printf(p.getSalary() + " " + p.getName());
    }
}

