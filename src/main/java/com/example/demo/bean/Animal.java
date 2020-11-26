package com.example.demo.bean;

import java.util.HashMap;
import java.util.*;
/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/24 17:55
 */
public class Animal extends HashMap<String,Object>{
    public Animal(){
        super();
    }
    public String put(String key,Object value){
        super.put(key,value);
        return "";
    }
    public static void main(String args[]){
        Animal animal = new Animal();

        animal.put("SSS","AAA");
        System.out.println(animal.get("SSS"));

    }


}
