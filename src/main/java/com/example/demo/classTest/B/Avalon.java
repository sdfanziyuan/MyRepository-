package com.example.demo.classTest.B;

import com.example.demo.classTest.A.Car;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/12/2 17:37
 */
public class Avalon extends Car {
    public void run(){
        super.run();
    }
    public static void main(String[] args){
        Car avalon = new Avalon();
        Avalon avalon1 = new Avalon();
        avalon1.run();
        avalon.run();
    }
}
