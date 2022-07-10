package Ch7_OOP2.Interface;

public abstract class Tablet implements Machine{
    // 인터페이스를 구현하는 추상클래스 생성 가능. 이런 경우 인터페이스 메소드의 일부만 구현해도 됨

    public void turnOn(){  // 인터페이스의 메소드가 public이므로, 이를 상속받는 메소드도 public 선언
        System.out.println("Tablet PC의 전원을 켭니다.");
    }

}
