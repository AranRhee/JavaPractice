package Ch7_OOP2.AbstractClass;

public class PokemonSample {
    public static void main(String[] args){
        Pikachu pikachu = new Pikachu(new String[]{"전기"});
        Yadoran yadoran = new Yadoran(new String[]{"물", "고스트"});
        pikachu.doubleAttack("ThunderBolt", 30, yadoran);  // ThunderBolt 기술로 60의 데미지 타격
        // 자손 클래스에 구현된 추상메소드 실행
        yadoran.hpRecovery();  // 체력이 회복되었습니다.

        System.out.println(yadoran.hp); // 63


    }
}
