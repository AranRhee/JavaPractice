package Ch7_OOP2.InnerClass;

import Ch7_OOP2.Interface.MacMini;
import Ch7_OOP2.Interface.Machine;

public class Anonymous {
    public static void main(String[] args){
        // 익명 클래스. 구현하고자 하는 조상 클래스의 이름 혹은 인터페이스의 이름을 사용해서 정의
        Object ano = new Machine() { // 클래스 선언과 객체 생성이 동시에 이루어짐. 일회용!
            // 단 하나의 클래스를 상속받거나, 하나의 인터페이스만 구현 가능.
            @Override
            public void turnOn() {
                System.out.println("일회용 익명 클래스 전원 on");
            }

            @Override
            public void turnOff() {
                System.out.println("일회용 익명 클래스 전원 off");
            }

            @Override
            public void charging(int currentBattery) {
                System.out.println("일회용 배터리는 충전할 수 없습니다.");
            }
        };

        System.out.println(ano.getClass()); //class Ch7_OOP2.InnerClass.Anonymous$1
        // 익명클래스는 이름이 없어서 외부클래스명$숫자.class 형식으로 결정됨.
    }

}
