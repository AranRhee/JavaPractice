package Ch7_OOP2.Polymorphism;

import javax.crypto.Mac;

public class LaptopSample {
    public static void main(String args[]){
        MacBook mb = new MacBook();
        mb.setBootCamp(128);
        // 참조변수 타입과 인스턴스 타입이 일치하지 않음 - 조상클래스 타입의 참조변수로 자손 클래스 인스턴스 참조 가능
        Laptop lp = new MacBook();
        lp.turnOn();
        // lp.setBootCamp(128);  // Cannot resolve method 'setBootCamp' in 'Laptop'
        // 조상클래스의 참조변수로 자손클래스의 인스턴스를 참조하여 생성한 경우, 자손클래스에만 정의된 메소드와 멤버변수는 접근 불가능함.
        // 같은 타입의 인스턴스여도 참조변수 타입에 따라 사용할 수 있는 멤버가 달라짐.

        // 자손타입의 참조변수로 조상 타입의 인스턴스 생성 불가
        // MacBook macBook = new Laptop();
        // 참조변수가 사용할 수 있는 멤버의 갯수는 인스턴스의 멤버 갯수보다 같거나 적어야 함.
        // 자손타입의 참조변수를 조상타입으로 형변환 가능

        // 형변환은 참조변수의 타입을 변환하는 것이지 인스턴스를 변환하는 것이 아니기 때문에 참조변수의 형번환은 인스턴스에 영향 X
        // 통상적으로 작은 자료형에서 큰 자료형 형변환은 생략 가능
        MacBook macBook = new MacBook();
        Laptop laptop = null;
        laptop = macBook;  // 업캐스팅. 작은 자료형에서 큰 자료형으로 형번환
        //laptop.setBootCamp(128); // 참조변수의 형변환을 통해, 참조하고 있는 인스턴스에서 사용할 수 있는 멤버 갯수 조절.

        MacBook macBook1 = null;
        macBook1 = (MacBook) laptop;  // 다운캐스팅. 조상타입의 참조변수를 자손타입의 참조변수에 저장.
        macBook1.setBootCamp(256);

        Laptop laptop1 = new Laptop();
       // macBook1 = (MacBook) laptop1;  // java.lang.ClassCastException
        // 형변환 자체는 문제 없으나, 참조변수 laptop1이 참조하고 있는 인스턴스가 Laptop 타입의 인스턴스임.
        // 조상타입의 인스턴스를 자손 타입의 참조변수로 참조하는 것은 허용 X
        // 서로 상속관계의 타입간 형변환은 가능하지만, 참조변수가 가리키는 인스턴스의 자손타입으로 형변환은 불가능함.
        // 자식타입변수 = (자식타입) 부모타입;


        // 참조변수가 참조하고 있는 인스턴스 실제 타입 확인 -> instanceof 연산자 사용
        // instanceof 연산결과가 true일 경우 참조변수가 검사한 타입으로 형변환 가능
        System.out.println(laptop instanceof Laptop);  // true
        System.out.println(laptop instanceof MacBook); // true
        System.out.println(laptop instanceof Object);  // true -> Object는 최상위 클래스

        System.out.println(laptop1 instanceof Laptop);  // true
        System.out.println(laptop1 instanceof MacBook); // false
        System.out.println(laptop1 instanceof Object);  // true





    }


}
