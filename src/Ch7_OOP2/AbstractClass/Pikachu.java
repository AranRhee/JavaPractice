package Ch7_OOP2.AbstractClass;

public class Pikachu extends Pokemon{


    Pikachu(String[] type) {
        this.name = "피카츄";
        this.fullHp = 45;
        this.hp = 45;
        this.type = type;
    }

    // 추상클래스 Pokemon을 상속받고 있는 자손클래스.
    // 상속받고 있는 추상클래스의 모든 추상 메소드를 구현해주어야 함.
    @Override
    void hpRecovery() {
        if((double)hp/fullHp < 0.3) hp += hp;
    }



}
