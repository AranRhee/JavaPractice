package Ch6_OOP1;

import java.util.HashSet;

public class Lotto {
    String drawingDate = "토요일"; // 인스턴스변수 명시적 초기화
    static int[] num = new int[6];  //  클래스 변수 명시적 초기화

    // 클래스 초기화 블럭 : 배열이나 예외처리가 필요한 초기화에 주로 사용. (명시적 초기화만으로 초기화가 어려울때)
    static {
        HashSet<Integer> lotto = new HashSet<Integer>();
        while(lotto.size() < 6) {
            lotto.add((int)(Math.random()*45+1));
        }
        num = lotto.stream().mapToInt(x->x).toArray();

        for(int val : num) {
            System.out.print(val + ",");
        }
        System.out.println();
    }

    // 인스턴스 초기화 블럭
    {
        System.out.println(drawingDate + "에 추첨합니다.");
    }

    Lotto() {
        System.out.println("생성자 내부 실행");
    }// 생성자
}
