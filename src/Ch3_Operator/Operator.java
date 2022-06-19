package Ch3_Operator;

public class Operator {

    public static void main(String args[]) {
        Integer num = 1;
        if(num > 0 && num instanceof Integer || num != 1) {
            // true && true || false
            // 논리연산자 :  or 연산자의 경우 and 보다 우선순위가 낮음
            System.out.println("retVal " + num);
        }

        // 산술 타입변환 -> 연산 전 피연산자 타입 일치를 위한 변환
        int intVal = 2;
        double dbVal = 3.0;
        double retVal = dbVal * intVal;   // 큰 타입으로 형변환 시 연산자 생략가능
        int retVal2 = intVal + (int)dbVal; // 작은 타입으로 형변환 시 연산자 필요


        // 증감연산자
        int addNum = 2;
        int addVal = 2;
        addNum++;  // addNum = addNum + 1
        ++addNum; // 증감연산자가 전위에 붙을 수도 있음. 값이 참조되기 전에 증가시킴.
        System.out.println(addNum);


        addVal = addNum++;  // addVal : 4, addNum : 5
        // addVal에 addNum 값 대입 후 addNum 값 1 증가
        System.out.println(addVal + "/" + addNum);

        addVal = ++addNum;  // addVal : 6 , addNum : 6
        // addNum에 먼저 1 더하고, addVal에 addNum 값 대입
        System.out.println(addVal + "/" + addNum);


        // 산술연산자
        int divVal =  5/3;
        System.out.println(divVal);  // divVal이 int타입이므로 몫인 1만 저장됨. 반올림X
        int priority = 1 + 3 * 4; // 13. 덧셈뺄셈은 곱셈나눗셈보다 우선순위 낮음

        // char타입 연산 가능. 유니코드로 저장하기 때문
        int charVal = 'A' + 1;
        System.out.println(charVal); // 66
        // 단 변수에 char 대입시 컴파일 불가능하므로 형변환 필요함


        // String 비교
        String strVal1 = "123";
        String strVal2 = "123";
        String strVal3 = new String("123");
        System.out.println(strVal1 == strVal2);  // true
        System.out.println(strVal1 == strVal3); // false  문자열 내용은 같으나 서로 다른 객체이기 때문.
        // string 비교시에는 equals 메소드 사용 필요
        // == 는 주소, equals는 value 비교
        strVal2.equals(strVal3);  // true


        //삼항연산자
        int compVal = 3;
        int ret = compVal != 2? compVal-2 : compVal++;  // compVal!=2가 true면 compVal-2 값을 대입, false면 대입후 증감연산





    }



}
