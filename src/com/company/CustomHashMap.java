package com.company;

import java.util.ArrayList;

/**
 * Created by GURDIT_SINGH on 22-04-2015.
 */
public class CustomHashMap {

    static ArrayList<CustomKeyValue> keyValues=new ArrayList<CustomKeyValue>();
    public static void put(String key,String value){
        keyValues.add(new CustomKeyValue(key,value));
    }

    public static String get(String key){
        for(CustomKeyValue customKeyValue:keyValues){
            if(customKeyValue.getKey().equals(key)){
                return customKeyValue.getValue();
            }
        }
        return null;
    }
}
