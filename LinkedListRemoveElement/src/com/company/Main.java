package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> list = new LinkedList<>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");
        list.add("Item4");
        list.add("Item5");

        // ispis liste
        System.out.println("Before remove:");
        for(String str : list){
            System.out.println(str);
        }
        // uklanjanje elemenata
        list.remove("Item4");

        // ispis liste
        System.out.println("After remove: ");
        for(String str1: list){
            System.out.println(str1);
        }
    }
}
