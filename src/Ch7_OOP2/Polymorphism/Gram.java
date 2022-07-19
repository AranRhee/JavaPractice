package Ch7_OOP2.Polymorphism;

public class Gram extends Laptop {
    int warranty = 2;  // 부모 클래스와 같은 이름의 멤버변수 선언

    Gram(){}
    Gram(String modelName) {
        this.modelName = modelName;
    }
    // 메소드 오버라이딩
    void turnOn(){
        System.out.println("Gram의 전원을 켭니다");
    }

    void turnOff(){
        System.out.println("Gram의 전원을 끕니다");
    }

}
