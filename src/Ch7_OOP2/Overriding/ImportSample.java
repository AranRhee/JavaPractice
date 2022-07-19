package Ch7_OOP2.Overriding;

import java.time.LocalDate;
import java.util.*;

// 패키지 : 클래스의 묶음. 서로 관련된 클래스끼리 그룹단위로 묶어서 관리 가능. (물리적인 디렉토리) 같은 이름의 클래스여도 패키지가 다르면 사용 가능.
public class ImportSample {
    public static void main(String[] args){
        LocalDate ld = LocalDate.now();  // LocalDate 클래스를 사용하기 위해 상단에 import 됨
        ArrayList<String> list = new ArrayList<>();  // 한 패키지에서 여러 클래스를 사용할 경우 클래스 이름 대신 패키지명.* 로 사용 가능
        Apple ap = new Apple();  // 같은 패키지 내 클래스는 import 없이 사용 가능

        String className = ap.getClass().getName(); // 클래스의 실제 이름은 패키지명을 포함함
        System.out.println(className); // Ch7_OOP2.Overriding.Apple
    }
}
