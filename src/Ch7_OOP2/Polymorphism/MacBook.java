package Ch7_OOP2.Polymorphism;

import java.time.LocalDate;

public class MacBook extends Laptop{

    Boolean appleCareYn;
    MacBook(){}
    MacBook(String modelName) {
        this.modelName = modelName;
    }


    void setBootCamp(int storage){
        System.out.println(storage+"GB 의 공간을 Windows로 할당합니다.");
    }
}
