package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Collections {

    public static void main(String[] args) {
        ArrayList<String> lieblingsfaecher = new ArrayList<>(0);
        lieblingsfaecher.add("Programmieren");
        lieblingsfaecher.add("Informatik");
        lieblingsfaecher.add("Englisch");

        System.out.print("Meine Lieblingsfächer sind: ");
        for (String s : lieblingsfaecher){
            System.out.print(s + ", ");
        }
        System.out.print("aber eigentlich ist mein Lieblingsfach ");
        lieblingsfaecher.set(0, "Sport");
        System.out.print(lieblingsfaecher.get(0) + ".\n\n");

        // --------------------------------------------------------------

        ArrayList lottozahlen = new ArrayList() {           // Ohne Typ-Parameter wird ein Array-List aus Objekten erstellt
            {
                add(1);
                add(17);
                add(25);
                add(30);
                add(31);
                add(33);
            }
        };
        for (Object i : lottozahlen) {
            System.out.print(i + "\t");
        }

        System.out.println((lottozahlen.contains(12)) ? "12 enthalten" : "12 nicht enthalten");

        System.out.println("Anzahl Lottozahlen: " + lottozahlen.size());

        //  bei .remove(1) wird die 17 entfernt

        lottozahlen.remove(1);

        for (Object i : lottozahlen) {
            System.out.print(i + "\t");
        }

        // --------------------------------------------------------------

        ArrayList<Integer> zahlen = new ArrayList<>(1000);      // ArrayList mit Integers

        zahlen.forEach((zahlen.indexOf()+1)*10);

        for(Object i : zahlen){
            System.out.println(i);
        }

        ListIterator<Integer> iterator = zahlen.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}