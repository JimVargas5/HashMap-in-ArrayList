package com.company;
//Test for one of the Jasons...

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String searchTerm1 = "Portland";/*
        String searchTerm2 = "portland";
        String searchTerm3 = "portlAnd";*/
        String searchTerm4 = "pOrtlAnd";


        ArrayList<HashMap<String, String>> bigList = new ArrayList<>();

        HashMap<String, String> littleList1 = new HashMap<>();
        littleList1.put("WebDev1", "Portland");
        littleList1.put("WebDev4", "PORTLAND");
        littleList1.put("WebDev", "SomeWhereElse");

        HashMap<String, String> littleList2 = new HashMap<>();
        littleList2.put("Senior2", "Lexington");
        littleList2.put("Senior3", "pOrTlAnD");

        bigList.add(littleList1);
        bigList.add(littleList2);

        for (int i = 0; i < (bigList.size()); i++ ){
            for(Map.Entry<String, String> item : bigList.get(i).entrySet()){
                if (item.getValue().equalsIgnoreCase(searchTerm1)){
                    System.out.println("We found a match for: "+searchTerm1);
                    System.out.println("Key: "+item.getKey());
                    System.out.println("Value: "+item.getValue());
                }/*
                if (item.getValue().equalsIgnoreCase(searchTerm2)){
                    System.out.println("We found a match for: "+searchTerm2);
                    System.out.println("littleList"+i+" Key: "+item.getKey());
                    System.out.println("littleList"+i+" Value: "+item.getKey());
                }
                if (item.getValue().equalsIgnoreCase(searchTerm3)){
                    System.out.println("We found a match for: "+searchTerm3);
                    System.out.println("littleList"+i+" Key: "+item.getKey());
                    System.out.println("littleList"+i+" Value: "+item.getKey());
                }*/
                if (item.getValue().equalsIgnoreCase(searchTerm4)){
                    System.out.println("We found a match for: "+searchTerm4);
                    System.out.println("Key: "+item.getKey());
                    System.out.println("Value: "+item.getValue());
                }
            }
        }
    }
}
