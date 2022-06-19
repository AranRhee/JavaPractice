package Ch2_Variable;

public class TypeCasting {

    int num = 1;  // num 변수에 int 값 1 저장

    double typeCasting = (double)num; // int type num을 double로 형변환
    double retVal = typeCasting + 2;  // typeCasting + (double)2
    // 표현 범위가 좁은 타입에서 넓은 타입으로 형변환하는 경우에는 값 손실이 없어 범위가 더 넓은쪽으로 변환됨. (형변환 연산자 생략가능)

    int intVal = (int) retVal;
    // 표현 범위 넓은 범위 -> 좁은 범위로 형변환 할 경우에는 형번환 연산자 필요함.




}
