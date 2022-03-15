package com.cc.java;

import com.cc.java.bees.Drone;
import com.cc.java.bees.HoneyBee;
import com.cc.java.bees.Queen;
import com.cc.java.bees.Worker;
import com.cc.java.birds.Bird;

public class App {

    // static Honeybee worker;

    public static void main(String[] args) {
      
        HoneyBee queen = new Queen();
        HoneyBee drone = new Drone();
        HoneyBee worker = new Worker();
        Bird bird = new Bird();

        output(queen.doYourJob());
        output(drone.doYourJob());
        output(worker.doYourJob());
        output(bird.hasFeathers());

        output("-----------------");

        output(queen.fly());
        output(drone.fly());
        output(worker.fly());
        output(bird.fly());

  
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}
