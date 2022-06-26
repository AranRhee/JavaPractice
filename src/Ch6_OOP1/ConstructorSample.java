package Ch6_OOP1;

public class ConstructorSample {
    public static void main(String[] args) {
      //  Iphone ip = new Iphone();  // 'Iphone(java.lang.String)' in 'Ch6_OOP1.Iphone' cannot be applied to '()'
        // Iphone 클래스에 기본생성자가 없으므로 클래스 생성 시 파라미터 필요
        Iphone ip = new Iphone("12mini");
        ip.color = "green"; // 인스턴스 생성 후 별도 초기화

        // 두 객체는 다른 생성자로 초기화됨.
        Ipad myIpad = new Ipad();
        Ipad yourIpad = new Ipad("6th Gen", "Gold");
        System.out.println("버전 : " + myIpad.version + " / 색상 : " + myIpad.color);
        System.out.println("버전 : " + yourIpad.version + " / 색상 : " + yourIpad.color);
       /*
        버전 : mini 6 / 색상 : purple
        버전 : 6th Gen / 색상 : Gold
        */

        Iphone yourIphone = new Iphone(ip); // 생성자를 이용한 인스턴스 복사. 같은 상태를 갖는 인스턴스 하나 더 생성.
        System.out.println(yourIphone.color.equals(ip.color)); // true
        yourIphone.color = "Black";
        System.out.println(ip.color); // green
        // 서로 같은 상태를 가진 상태로 생성되었지만 독립적이기 때문에 변경 영향 없음.

    }
}
