package Ch7_OOP2.Inheritance;

import java.lang.reflect.Field;

public class IceCreamSample {
    public static void main(String[] args){
        /*
        1. 상속, 포함은 클래스를 각각 작성하는 것보다 중복된 코드를 제거하고, 코드의 재사용성을 높이는 장점이 있음.
        2. 코드를 공통적으로 관리하므로 유지보수에 용이하다. -> 수정 사항이 적음
        3. Java는 단일 상속만을 허용 -> 여러 클래스를 상속받을 수 없음.
        4. 다른 클래스를 상속받지 않는 모든 클래스는 Object 클래스를 상속받음 (Object : 자바 최상위 클래스)
          ㄴ toString(), equals 메소드는 Object 클래스에 정의되어 있어 모든 클래스에서 따로 정의하지 않고 사용 가능함.
         */

        // IceCream 클래스를 상속받는 자식클래스 베스킨라빈스, 메로나 클래스 인스턴스 생성
        // 부모 클래스의 생성자는 상속되지 않으나, 자식 클래스로 인스턴스를 생성할 때 자동으로 부모클래스의 기본 생성자가 호출됨
        BaskinRobins31 bb = new BaskinRobins31();  // IceCream Instance
        Melona mm = new Melona();
        // IceCream Instance
        // Melona Instance

        // Melona me = new Melona("Melon");

        // 부모 클래스에 정의된 멤버변수도 자식클래스에서 사용 가능
        mm.price = 1000;

        // toString 메소드를 부모 클래스에 구현해놓았기 때문에, 상속받은 자식 클래스에 구현이 없어도 사용 가능.
        mm.toString();  // Ice Cream Name : Melona
        bb.toString(); // Ice Cream Name : BaskinRobins31
        String[] flavorArr = {"Melon", "Mango"};
        mm.setFlavor(flavorArr);  // Melon, Mango

        /*
        Field[] arr = mm.getClass().getDeclaredFields();  // 내 필드만 가져옴 상속받은필드 X
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].getName());
        }*/


        // 상속관계 : ~은 ~이다 (부모-자식)
        // 포함관계 : ~은 ~을 가지고 있다
        Lotteria lt = new Lotteria();
        lt.iceCream.toString(); // Lotteria 인스턴스의 멤버변수(참조타입) IceCream
        // Ice Cream Name : IceCream


    }
}
