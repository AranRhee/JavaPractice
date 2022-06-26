package Ch6_OOP1;

public class Robot {
    // 로봇 클래스의 속성(멤버변수)
    private int price;  // 속성에 private 접근제한자를 붙여 다이렉트로 수정할 수 없게 함.
    int battery = 100;
    String message;
    static String manufacturer = "Samsung";  // 클래스변수. 모든 클래스 공통 사용. 클래스 메모리 로딩 시 생성됨.

    //메소드 : 클래스의 기능. 재사용성, 중복코드제거, 프로그램 구조화에 장점이 있음.
    int changePrice(int newPrice) {
        // private인 price 멤버변수를 변경하는 메소드
        price = newPrice;
        return price;  // 메소드 종료 후 값 반환
    }

    void message(String message){
        if(battery > 0) {
            useBattery();
        } else {
            return;
        }
        System.out.println(message + "입니다");
    }

    void useBattery(){
        battery -= 10;
    }

    void checkBattery(){
        if(battery < 0) {
            System.out.println("Battery is empty.");
        } else {
            System.out.println("Battery : " + battery + "%");
        }
    }

    int checkPrice(){
        System.out.println("가격은 " + price + "원 입니다.");
        return price;
    }

    static void printManufacturer (){
       // checkPrice(); // Non-static method 'checkPrice()' cannot be referenced from a static context
        /* 클래스 메소드의 경우 인스턴스없이도 사용 가능하므로, 인스턴스메소드를 호출할 때 인스턴스가 없을 수 있음.
         따라서 인스턴스메소드와 달리 같은 클래스 내의 인스턴스 메소드 호출 불가 */
        System.out.println("제조사 : " + manufacturer);

        // 클래스메소드에서 인스턴스메소드를 호출하려면, 객체를 생성해야 함.
        // new Robot().checkPrice();
    }
}
