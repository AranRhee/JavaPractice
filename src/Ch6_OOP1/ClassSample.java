package Ch6_OOP1;

public class ClassSample {
    public static void main(String[] args) {
        Robot r1 = new Robot();
        // Robot 타입 참조변수 생성 후 Robot 클래스의 인스턴스가 메모리에 생성
        // r1 변수에는 생성한 인스턴스의 주소값이 담겨있음

        r1.message("안녕하세요");   // 안녕하세요입니다
        r1.checkBattery();    // Battery : 90%
       // r1.price = 100;  // 'price' has private access in 'Ch6_OOP1.Robot'
        r1.changePrice(8500);
        r1.checkPrice(); // 가격은 8500원 입니다.


        Robot r2 = new Robot();
        r2.checkPrice(); // 가격은 0원 입니다.
        // price 멤버변수는 자료형(int) 의 기본값으로 초기화되어 0


        Robot[] robotArr = new Robot[2]; // 객체를 배열로 생성하는것도 가능. 객채를 담을 그릇 생성
        for(int i=0; i< robotArr.length; i++){
            robotArr[i] = new Robot();  // 실제 객체를 그릇에 담아주기.
        }

        System.out.println(r1.manufacturer.equals(r2.manufacturer)); //true
        r1.manufacturer = "Apple";
        r2.printManufacturer();  // 제조사 : Apple
        // 모든 인스턴스가 공통인 값을 가지므로, 한쪽에서 변경하면 다른 인스턴스도 값이 바뀌게 됨.

    }

}
