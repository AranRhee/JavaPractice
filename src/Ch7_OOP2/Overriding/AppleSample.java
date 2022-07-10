package Ch7_OOP2.Overriding;

public class AppleSample {
    public static void main(String[] args) {
        // Apple 클래스를 상속받는 자식 클래스 Airpods, Iphone12mini 클래스 생성
        Airpods airpods = new Airpods();
        Iphone12mini mini = new Iphone12mini();

        // Airpods 클래스는 부모 클래스에 정의된 changePrice 메소드를 실행
        // Iphone 클래스는 본인 클래스에 정의된 changePrice 메소드 실행 (오버라이딩)
        airpods.changePrice(150000);  // Airpods's price is 150000
        mini.changePrice(630000); // Not Available

        mini.changePrice(); // This method is overloaded.  -> 부모클래스 메소드 오버라이딩 X. 오버로딩

        mini.parentsProperty();
        // Parent Class's release Year : 1976
        // My Class's release Year : 2020


    }
}
