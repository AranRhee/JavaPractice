package Ch6_OOP1;

public class Iphone {
    String version;
    String color;
    //Iphone(){}  // 기본생성자. 클래스에 정의된 생성자가 없을경우 컴파일러가 자동으로 추가해줌
    Iphone(String ver){
        version = ver;
    }

    Iphone(String ver, String col) {
        version = ver;
        color = col;
    }

    // 인스턴스 복사를 위한 생성자
    Iphone(Iphone ip) {
        version = ip.version;
        color = ip.color;
        // this(ip.version, ip.color);  // -> 이 방법이 더 효율적. 기존 코드 활용
    }
}

