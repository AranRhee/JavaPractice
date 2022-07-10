package Ch7_OOP2.Modifier;

public final class Machine {

    private Machine(){}  // 클래스 외부에서 인스턴스 생성 불가
    // 이런 케이스의 경우 다른 클래스의 조상이 없으므로, 클래스 앞에 final 키워드를 추가해서 상속할 수 없는 클래스임을 명시.

    // 언제 private 생성자를 사용할까?
    // 1. 불필요한 객체 생성 제한 - 기능만 사용한다거나
    // 2. Singleton 패턴 -> 프로세스 내에서 객체를 하나만 생성하고 모든 곳에서 이 객체 사용 (Spring 공부할때 다시 체크하기)
    // 3. 객체 생성 시 파라미터 제한 (잘못된 값이 들어올 경우의 오동작 대비). private, public 생성자를 따로 두는 방식
    // 4. Builder 패턴 -> 자바 Design Pattern 중 하나로, 객체 생성 시 생성자 셋팅을 효율적으로 사용 가능함.
    // ㄴ 디자인 패턴 공부할때 추가로 확인하기

    public static Machine getInstance(){
        Machine mac = new Machine();
        return mac;
    }
}
