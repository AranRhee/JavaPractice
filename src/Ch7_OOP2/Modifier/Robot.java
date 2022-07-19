package Ch7_OOP2.Modifier;

public final class Robot {  // 클래스도 final 제어자 사용 가능. 다른 클래스가 상속할 수 없음
    static String manufacturer = "Apple";  // static 멤버변수 선언
    // 클래스변수는 인스턴스에 관계 없이 모두 같은 값을 가짐. 하나의 변수를 모든 인스턴스가 공유하기 때문
    String color;
    String modelName;
    final String batteryFormat = "AAA";  // final 멤버변수 선언
    // 값 변경 불가(상수).
    final String vendor;  // final 멤버변수의 경우 선언에서 초기화 하지 않고 생성자에서 초기화 하는 것도 가능함.
    // 이런 경우 인스턴스마다 다른 속성값을 가질 수 있음.

    Robot(String color, String modelName, String vendor){
        this.color = color;
        this.modelName = modelName;
        this.vendor = vendor;
    }

    final void pushVoice(){  // 메소드에도 final 클래스 사용 가능. 오버라이딩 불가
        // 오버로딩과 혼동하지 말 것
        System.out.println("Model Name : " + modelName);
    }
    void pushVoice(String modelName){
        System.out.println("Name : " + modelName);
    }

}
