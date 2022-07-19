package Ch7_OOP2.AbstractClass;

public abstract class Pokemon {
    // 추상클래스 선언
    String[] type;
    String name;
    int attack;
    int defense;
    int hp;
    int fullHp;
    int speed;

    Pokemon(){}
    Pokemon(String name, String[] type){
        this.name = name;
        this.type = type;
    }

    // 상속받고 있는 추상클래스의 모든 추상 메소드를 구현해주어야 함.
    abstract void hpRecovery();

    // 추상클래스는 구현부가 있는 메소드도 선언 가능
    void attack(String name, int power, Pokemon pk) {
        System.out.println(name + " 기술로 " + power + "의 데미지 타격");
        pk.hp -= power;
    }

    void doubleAttack(String name, int power, Pokemon pk) {
        System.out.println(name + " 기술로 " + power*2 + "의 데미지 타격");
        pk.hp -= power * 2;

    }
}
