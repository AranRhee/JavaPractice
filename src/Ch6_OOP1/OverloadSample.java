package Ch6_OOP1;

public class OverloadSample {
    /*
    오버로딩 : 하나의 메소드 이름으로 여러 기능을 구현. 파라미터의 갯수 또는 타입이 달라야 함.
        return 타입이 다른 것은 오버로딩이라고 할 수 없음. 가장 자주 쓰는 오버로딩은 println
        근본적으로 같은 기능을 하는 메소드일 경우는 서로 다른 이름을 가지는 것보다 오버로딩을 사용하면 좋음.
    * */

    public static void main(String[] args) {
        Calculate cal = new Calculate();

        // sum 메소드 오버로딩
        cal.sum(2,3);   // 5
        cal.sum(2,4,1);  // 7

        /*
        가변 파라미터는 내부적으로 배열을 이용하며 메소드를 호출할때마다 배열을 생성하지만
         파라미터에 대입된 배열을 넣어주게 될 경우 {}에 return이 없어 에러 발생
         따라서 return이 되는 new 키워드를 사용해야 함
         또한 가변 파라미터를 사용하는 메소드의 경우 오버로딩 시 어떤 메소드를 호출하는지 구분할 수 없는 경우가 있어 되도록이면 오버로딩 하지 않는 것이 좋음.
        */
        cal.sumVarargs(1,2,3);  // 6
        //cal.sumVarargs({2,3,4});  // Array initializer is not allowed here
        cal.sumVarargs(new int[]{4,5,6,7}); // 22

    }

}
