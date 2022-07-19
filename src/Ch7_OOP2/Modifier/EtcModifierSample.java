package Ch7_OOP2.Modifier;

public class EtcModifierSample {
    public static void main(String[] args) {
        Robot r1 = new Robot("White", "RV-1", "Emart");
        Robot r2 = new Robot("Black", "RV-2", "Homeplus");

        r1.manufacturer = "Samsung";  // static 제어자가 붙은 속성 변경
        System.out.println(r2.manufacturer); //Samsung     // r2의 static 속성도 변경됨. (공통속성)

        r1.pushVoice(); // Model Name : RV-1
        r2.pushVoice(r2.modelName); // Name : RV-2


    }
}
