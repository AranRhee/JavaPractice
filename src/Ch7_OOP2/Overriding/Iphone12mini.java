package Ch7_OOP2.Overriding;

import java.time.LocalDate;

public class Iphone12mini extends Apple{
    int releaseYear;

    Iphone12mini(){
        // 컴파일러가 super(); 를 자동으로 실행함.
        // 자식 클래스의 인스턴스 생성 시 자식+부모의 멤버가 합쳐진 인스턴스가 생성됨. 따라서 부모클래스의 기본 생성자 호출하여 초기화
        // 자식클래스에서 조상의 멤버를 사용할 수 있기 때문에 생성자의 첫줄에서 조상클래스의 생성자 호출
        releaseYear = 2020;
        setModelName("Iphone 12 mini");
        setPrice(750000);
        // 만약 부모클래스의 기본생성자가 없다면 자식클래스도 부모 클래스의 생성자 타입에 맞게 수정하거나, 기본생성자를 추가해주면 됨.
    }
    /*
    부모 클래스의 changePrice 메소드를 자식클래스에서 오버라이딩
      [[오버라이딩]]
    -> 부모 클래스의 메소드와 같은 이름, 같은 파라미터, 같은 리턴타입을 가져야 함.
    -> 접근제어자는 부모 클래스보다 넓은 범위여야 함
    -> 부모 클래스보다 예외가 많아서는 안됨. (예외 최상위 Exception 클래스 유의할 것)

    오버로딩 : 기존에 없는 새로운 메소드 추가
    오버라이딩 : 부모클래스로부터 상속받은 메소드 내용을 변경
     */

    void changePrice(int newPrice){
        LocalDate ld = LocalDate.now();
        if(ld.getYear() - releaseYear > 3){
            super.changePrice(newPrice); // 부모클래스의 메소드 사용
        } else {
            System.out.println("Not Available");
        }
    }

    void changePrice(){
        System.out.println("This method is overloaded");
    }

    // 부모와 같은이름의 멤버를 가질 경우 super 키워드로 구분 가능. 멤버변수 / 메소드 / 생성자 모두 사용 가능
    void parentsProperty(){
        System.out.println("Parent Class's release Year : " + super.releaseYear);
        System.out.println("My Class's release Year : " + this.releaseYear);
    }


}
