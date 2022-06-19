package Ch4_ControlFlow;

public class ForWhile {
    public static void main(String args[]) {

        for(int i=0; i<3; i++) {
            /* for(초기화; 조건식; 증감식) {
                조건식을 초기화하고 증감하여 참일때까지 로직 수행함.
            }*/
            System.out.println("The Condition is true" + i);
        }

        // 향상된 for문. 배열과 컬렉션에 저장된 요소에 접근할때 사용 가능.
        String arr[] = {"사과", "감", "수박"};
        for(String idx : arr) {
            System.out.println("과일 : " + idx);
        }


        int num = 3;
        while (num < 10) {
            // 조건식이 참일때 로직 계속 수행됨! 불필요한 무한루프 돌지않도록 로직상 유의해야함.
            num++;
            if(num == 5) continue; // 반복문 끝으로 이동하여 다음반복 실행. 탈출X
            System.out.println(num);
            if(num == 6) break;  // 자신이 포함된 가장 가까운 반복문 탈출
        }


        do {
            System.out.println("while문의 조건식과 관계없이 무조건 처음에 실행됨");
        } while (num < 0);

        // 반복문에 이름을 붙여서 해당 반복문을 벗어나는것도 가능.
        LoopOutside : for(int i=0; i<10; i++) {
            System.out.println(i);
            LoopInside : for(int j=0; j<3; j++) {
                System.out.println(j);
                if(j==2) break LoopOutside;
            }
        }

    }
}
