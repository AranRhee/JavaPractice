package Ch6_OOP1;

public class Calculate {

    public int sum(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    public int sum(int a, int b, int c) {
        System.out.println(a + b + c);
        return a + b + c;
    }

    // 가변 파라미터를 사용하는 메소드
    // 가변 인자는 호출할때마다 배열을 생성함.
    public int sumVarargs(int... args) {
        int ret = 0;
        for(int num : args) {
            ret += num;
        }
        System.out.println(ret);
        return ret;
    }

}
