package Ch7_OOP2.InnerClass;

public class Exam {
    // 내부 클래스 : 클래스 내에 선언된 클래스. 사용 빈도가 낮으며 두 클래스가 서로 긴밀한 관계에 있을 때 사용.
    // 내부클래스에서 외부 클래스의 멤버들에 쉽게 접근 가능하고, 불필요하게 외부에 노출을 막음 (캡슐화)
    // 내부 클래스는 외부에서 잘 사용되지 않는 것이 좋음
    class Answer {
        String question;
        String answer;
    }

}
