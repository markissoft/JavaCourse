package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Some some = new Some();
        Class asome = some.getClass();

        Class isome = Some.class;
        Class iclass = Integer.class;

        System.out.print(asome.getName());

        int mods = asome.getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }

        System.out.println(asome.getSuperclass());

        // Виявлення інтерфейсів, які реалізує клас
        Class pam =  LinkedList.class;
        Class[] interfaces = pam.getInterfaces();
        for(Class cInterface : interfaces) {
            System.out.println( cInterface.getName() );
        }

        // Дослідження конструкторів
        Class c = asome.getClass();
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
        


    }
}
