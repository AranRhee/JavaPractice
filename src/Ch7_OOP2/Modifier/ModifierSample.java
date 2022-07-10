package Ch7_OOP2.Modifier;

public class ModifierSample {
    public static void main(String[] args){
        /* 접근 제어자
        * private : 같은 클래스 내 접근 가능
        * default : 같은 패키지 내 접근 가능 (접근제어자 생략하면 default)
        * protected : 같은 패키지 내, 다른 패키지의 자손 클래스에서 접근 가능
        * public : 접근 제한 없음
        *
        * 접근제어자 사용 이유 (캡슐화)
        * -> 외부로부터 데이터를 보호하고, 내부적으로 사용되는 로직을 감추기 위함
        * -> 메소드 변경 시 접근권한 별로 테스트 범위가 줄어들 수 있음
        * */

        User user = new User();
        //user.name = "AR"; // 'name' has private access in 'Ch7_OOP2.Modifier.User'
        // 멤버변수가 private 접근제어자를 가지므로 직접적인 접근 허용 불가
        user.setName("AR");
        user.setAgeGroup(30);
        System.out.println(user.getAgeGroup());  // 30대


        // 생성자에도 접근제어자를 사용하여 인스턴스 생성 제한 가능
        //Math math = new Math();  // 'Math()' has private access in 'java.lang.Math'

        // 해당 클래스 내부에서는 인스턴스 생성 가능하므로, 외부에서 이 클래스의 인스턴스를 리턴받을수 있는 메소드를 public으로 지정.
        //Machine mac = new Machine();  // 'Machine()' has private access in 'Ch7_OOP2.Modifier.Machine'
        Machine mac = Machine.getInstance();

        // 혹은 해당 외부에서 사용할 수 있는 메소드는 static으로 선언해서 인스턴스 생성 없이 메소드 호출할 수 있음.
        double randomNum = Math.random();
        System.out.println(randomNum);


        // 접근 제어자 사용시 주의점
        /* 1. static과 abstract는 함께 사용 불가 - static 제어자는 메소드 구현부가 있는곳에만 사용 가능
        *  2. 클래스에 abstract와 final 함께 사용 불가 - abstract는 자손 클래스에서만 구현 가능하기 때문
        *  3. abstract는 접근제어자 private 불가 - 위의 사유와 동일
        *  4. 메소드에 private, final 함께 사용할 필요 없음. 어차피 접근자가 private면 오버라이딩 불가. 둘중 하나만 써도 됨.
         */
    }
}
