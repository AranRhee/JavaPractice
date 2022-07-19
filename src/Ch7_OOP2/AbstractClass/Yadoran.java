package Ch7_OOP2.AbstractClass;

public class Yadoran extends Pokemon{

    public Yadoran(String[] type) {
        this.name = "야도란";
        this.fullHp = 95;
        this.hp = 95;
        this.type = type;
    }

    @Override
    void hpRecovery() {
        if((double)hp/fullHp < 0.5) {
            hp += fullHp * 0.3;
            System.out.println("체력이 회복되었습니다.");
        }

    }
}
