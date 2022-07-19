package Ch7_OOP2.Interface;

public interface Machine {
    // 모든 멤버변수는 public static final, 키워드 생략 가능
    String manufacturer = "Apple"; // public static final String manufacturer = "Apple"

    // 모든 메소드는 public abstract, 생략 가능. (static / default 메소드는 예외)
    void turnOn(); // public abstract void turnOn()
    void turnOff(); // public abstract void turnOff()
    void charging(int currentBattery); // public abstract void charging(int currentBattery)
}