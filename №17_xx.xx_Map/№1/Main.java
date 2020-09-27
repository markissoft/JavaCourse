package com.company;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    Animal cat = new Animal("cat", "Koli");
        Animal dog = new Animal("dog", "Pop");
	    Person person = new Person("Mike", 28);
        Person person1 = new Person("Mike", 28);
        Person person2 = new Person("Mike", 28);

	    ZooClub zoo = new ZooClub();
        List<Animal> list = null;
        list.add(cat);
        list.add(dog);

        zoo.map.put(person, null);
        zoo.map.put(person1, null);
        zoo.map.put(person2, null);
        zoo.map.replace(person, list);
        zoo.map.replace(person, null);
        zoo.map.remove(person);

        list.remove(cat);

        for(Map.Entry<Person, List<Animal>> map : zoo.map.entrySet()) {
            map.setValue(list);
        }

        System.out.println(zoo);

    }
}
