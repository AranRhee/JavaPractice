package Ch7_OOP2.Interface;

public class Desktop {
    boolean internet;
    // 인터페이스는 다중상속이 가능
    // 두 개의 클래스로부터 상속을 받아야 하는 경우
    // 1. 비중이 높은 조상 클래스를 선택하고, 다른 한쪽을 클래스 내부의 멤버로 포함시키는 방식을 사용하거나
    // 2. 어느 한쪽의 필요한 부분을 뽑아서 인터페이스로 만든 후 구현할 것

    void setInternet(){
        this.internet = true;
        System.out.println("인터넷이 연결되었습니다.");
    }

    void terminateInternet(){
        this.internet = false;
        System.out.println("인터넷 연결이 해제되었습니다.");
    }

    boolean getInternet(){
        return internet;
    }

}
