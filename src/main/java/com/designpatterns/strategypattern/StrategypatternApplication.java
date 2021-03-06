package com.designpatterns.strategypattern;

import com.designpatterns.strategypattern.problem.MallardDuck;
import com.designpatterns.strategypattern.problem.RedDuck;
import com.designpatterns.strategypattern.problem.RubberDuck;
import com.designpatterns.strategypattern.problem.WoodenDuck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategypatternApplication {

    public static void main(String[] args) {

        SpringApplication.run(StrategypatternApplication.class, args);
        problem();

    }

    private static void problem(){
        System.out.println("Mallard Duck Behaviors----------");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();
        mallardDuck.fly();

        System.out.println("\n \n Red Duck Behaviors---------------");

        RedDuck redDuck = new RedDuck();
        redDuck.quack();
        redDuck.swim();
        redDuck.display();
        redDuck.fly();

        System.out.println("\n \n Rubber Duckk Behaviors----------------");

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
        System.out.println("Rubber Ducks Should not be  Flying!!!!!!!!!!!!!");
        rubberDuck.fly();
        System.out.println("The Rubber Duck Fly is an empty dead code serving no purpose");


        System.out.println(" \n \n Wooden Duck Behaviors----------------");

        WoodenDuck woodenDuck = new WoodenDuck();
        woodenDuck.display();
        woodenDuck.swim();
        System.out.println("Wooden Ducks Should not be  Quacking!!!!!!!!!!!!!");
        woodenDuck.quack();
        System.out.println("Wooden Ducks Should not be  Flying!!!!!!!!!!!!!");
        woodenDuck.fly();
        System.out.println("The Rubber Duck Fly is an empty dead code serving no purpose");


        System.out.println(" \n \n \nProblems of inheritance in the aobve problem \n \n" +
                "1. Unwanted Dead Code in child classes \n" +
                "2. Duplicate Code in child classes \n" +
                "3. Handling Runtime changes are difficult \n" +
                "4. A change in Duck Class requires a change in all child classes");


    }

}
