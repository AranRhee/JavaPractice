package Ch6_OOP1;

public class Ipad {
    String version;
    String color;
    static String manufacturer = "Apple";

    Ipad(){
        this("mini 6", "purple");
        // 생성자 Ipad()에서 다른 생성자 Ipad(String ver, String col) 호출
        // 다른 생성자 호출은 가장 첫줄에서만 호출 가능
        // ㄴ 초기화 작업 도중 다른 생성자를 호출하면, 호출된 다른 생성자 내에서도 멤버변수 값이 초기화되기 때문. 위에 값이 무의미해짐.
    }

    Ipad(String ver, String col) {
        version = ver;
        color = col;
    }
}
