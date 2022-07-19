package Ch7_OOP2.Polymorphism;

public class Emart {
    // 파라미터 다형성

    void setLaptop(Laptop lp){
        System.out.println(lp.getClass());
        lp.printModelName();
    }

}
