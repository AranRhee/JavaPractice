package Ch7_OOP2.Polymorphism;

import java.time.LocalDate;

public class Laptop {

    String manufacturer;
    String modelName;
    int ram;
    String CPU;
    int warrenty = 1;

    Laptop(){}
    Laptop(String modelName){
        this.modelName = modelName;
    }


    void turnOn(){
        System.out.println("전원을 켭니다.");
    }

    void turnOff(){
        System.out.println("전원을 끕니다");
    }

   public void printModelName(){
        System.out.println("ModelName : " + this.modelName);
    }
}
