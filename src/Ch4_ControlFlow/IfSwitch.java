package Ch4_ControlFlow;

public class IfSwitch {
    public static void main(String args[]) {
        String strVal = "비교";

        if ("비교?".equals(strVal)) {
            System.out.println("if문의 조건식이 true면 실행");
        } else if ("비교대상?".equals(strVal)) {
            System.out.println("if문의 다음 조건식이 true면 실행");
            if (true) {
                // if문 안에 if문 중첩 가능
            }
        } else {
            System.out.println("if문의 조건식이 true가 아닐 경우 실행");
        }

        if (strVal == "비교") System.out.println("if문 한줄 표기도 가능");



        switch (strVal) {  // 조건식 결과는 정수, 문자열이여야 함.
                            // case문 값은 정수, 상수(문자열상수 포함)만 가능
            case "비교?" :
                    // 조건식의 결과가 case 값과 같으면 실행됨
                break; // switch문 탈출
            case "비교" :
                System.out.println("yes!");
            default :
                System.out.println("No");  // 조건식의 결과가 case 값과 상관 없이 실행됨.
        }

    }


}
