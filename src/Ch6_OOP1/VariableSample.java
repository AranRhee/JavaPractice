package Ch6_OOP1;

public class VariableSample {
    public static void main(String[] args) {
        System.out.println("시작");
        Lotto lt = new Lotto();
        System.out.println("종료");

        /*
         클래스 변수 초기화 순서 : 기본값 > 명시적 초기화 > 클래스 초기화 블럭 (클래스 로딩시 수행)
         인스턴스 변수 초기화 순서 : 기본값 > 명시적초기화 > 인스턴스 초기화 블럭 > 생성자 (인스턴스 생성될때 수행)

         시작
            16,34,37,7,10,43,
            토요일에 추첨합니다.
            생성자 내부 실행
            종료
         */
    }


}
