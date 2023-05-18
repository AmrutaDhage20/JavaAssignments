package com.encora.javaAssignments.DailyProgramPractice;

import java.util.*;

public class program6 {

    //Java Program to Convert Map (HashMap) to List

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "amruta");
        map.put(2, "bosch");
        map.put(3, "coffee");
        map.put(4, "datta");
        map.put(5, "elephant");
        List<Integer> keyList = new ArrayList(map.keySet());
        List<String> valueList = new ArrayList(map.values());
        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);
    }
}