package com.example.demo.bean;

import org.junit.Test;

import java.util.*;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/24 17:55
 */
public class Animal{
    public void run(){
        System.out.println("animalrun");
    }

    public static void main(String args[]){
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        stringList.add("aaa");
        stringList.add("bbb");
        integerList.add(1);
        integerList.add(2);
        getData(stringList);
        getData(integerList);

    }

    public static void getData(List<?> data){
        System.out.println("data="+data);
    }
    public static void getNumber(List<? extends Number> data){
        System.out.println("data="+data);
    }

}
class Cat extends Animal{
    public void run(){
        System.out.println("catrun");
    }
    public void speak(){
        System.out.println("catSpeak");
    }
}





