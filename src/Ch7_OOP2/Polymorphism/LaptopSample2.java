package Ch7_OOP2.Polymorphism;

import javax.crypto.Mac;
import java.util.Vector;

public class LaptopSample2 {
    public static void main(String[] args){

        // 조상클래스 참조변수로 자손 클래스 인스턴스 참조하여 생성
        Laptop lp = new Gram();
        Gram gr = new Gram();

        // 멤버변수의 경우, 자손과 조상에 선언된 멤버변수의 이름이 같을 경우 인스턴스 타입이 아니라 참조변수 타입에 따라 결과를 얻음.
        System.out.println(lp.warrenty);  // 1
        System.out.println(gr.warranty);  // 2

        // 메소드의 경우, 인스턴스 타입에 따라 실행됨. 유의할 것!
        lp.turnOn(); // Gram의 전원을 켭니다
        gr.turnOn(); // Gram의 전원을 켭니다

        // 메소드의 파라미터에도 다형성 적용 가능
        Emart emart = new Emart();
        emart.setLaptop(new Gram("Gram"));  // ModelName : Gram
        // setLaptop 메소드의 경우 파라미터로 Laptop 타입의 파라미터를 받게 구성했지만, 다형성이 적용되어
        // Laptop의 자손 타입의 참조변수도 파라미터로 사용 가능함. (자식이 부모를 가지고 있음)


        // 여러 종류의 객체를 한 배열에 넣기. 조상 타입의 참조변수 배열을 선언하면 다른 종류의 객체 저장 가능(같은 조상인 경우)
        Laptop[] lapArr = new Laptop[3];
        lapArr[0] = new MacBook();
        lapArr[1] = new Gram();
        lapArr[2] = new ThinkPad();

        // 위에 선언된 배열의 경우 배열의 크기를 넘어서 저장할 수 없기 때문에, 배열의 크기를 알아서 관리하는 Vector 클래스 사용.
        // 내부적으로 Object 타입의 배열을 가지고 있음.

        /* list와의 차이.
        1. Vector는 한번에 하나의 스레드만 접근 가능,  ArrayList는 동시에 여러 스레드가 접근 가능
        2. Thread Safe
        3. Arraylist는 동기화되지 않아 속도가 더 빠름
        4. 최대 인덱스 초과 시 Vector는 현재 배열의 크기의 100%, ArrayList는 50% 증가
        5. 멀티스레드 환경이 아닐 경우 ArrayList 사용 권장
         */
        Vector vecArr = new Vector();
        vecArr.add(new MacBook());
        vecArr.add(new Gram());
        vecArr.add(new ThinkPad());

    }
}
