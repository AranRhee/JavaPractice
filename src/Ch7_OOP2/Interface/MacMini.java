package Ch7_OOP2.Interface;

public class MacMini extends Desktop implements Machine {  // 인터페이스는 다중상속 가능
    String name = "Mac-Mini";
    int battery = 100;
    Computer computer = new Computer(); // 멤버변수로 Computer 타입의 참조변수 선언


    // 구현하고 있는 인터페이스에 선언된 abstract 메소드의 구현부 작성.
    @Override
    public void turnOn() {
        // 인터페이스 abstract 메소드에 Computer 인스턴스의 메소드 호출
        computer.turnOn();
    }

    @Override
    public void turnOff() {
        computer.turnOff();
    }


    @Override
    public void charging(int currentBattery) {
        computer.charging(72);
    }

    // 인터페이스 다형성 -> 인터페이스도 구현 클래스의 조상이므로, 인터페이스 타입 참조변수에 자식 클래스의 인스턴스를 참조하는 것이 가능하다.
    Machine machine = new MacMini();
    public void testPoly(Machine mac){}
    public Machine polyMethod(){
        MacMini macMini = new MacMini();
        return macMini;
        // 매우중요!! 리턴타입이 인터페이스라는 것은 메소드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 의미이다. !!!!

        /* 인터페이스의 장점
        1. 개발 시간 단축 : 인터페이스 구현 작성 시 타입을 명확히 알 수 있어 바로 개발 가능
        2. 표준화 가능 : 인터페이스를 기본 툴로 이용하여 표준화 가능
        3. 서로 관계 없는 클래스에게 관계를 맺어줄 수 있음 : 인터페이스 공통 구현으로 인한 관계 생성
        4. 독립적인 프로그래밍 가능 : 인터페이스를 이용해 선언과 구현을 분리하여, 클래스가 변경되어도 다른 클래스에 영향을 끼치지 않음
        */
    }
}
