package com.example.lunchweb;

import java.util.LinkedList;
import java.util.Random;

public class Lunch {

    public static String RamdomLunch(){
        LinkedList<String> list = new LinkedList<>();

        list.add("Istanbul");
        list.add("Bilia");
        list.add("Casa Blanca");
        list.add("Huses");
        list.add("STEK O GRILLGOTT");
        list.add("Tusen & 2");
        list.add("Tre Lyktor");



        int len = list.size();
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(len);
        String result = list.get(random);
        return result;
    }
}
