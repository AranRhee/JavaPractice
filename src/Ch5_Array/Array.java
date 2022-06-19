package Ch5_Array;

public class Array {
    public static void main(String args[]) {

        int[] num;
        num = new int[3];   // 길이가 3인 int타입의 배열 생성. 배열 생성 시 크기 지정 필수.
        num[0] = 1;  // 배열 요소는 인덱스로 접근 가능. index 0 -> 배열의 첫번째 값.

        String[] arr = {"안녕","하세요"}; // 배열 선언 + 초기화
        // 참조형 배열의 경우 배열의 각 요소에 주소값이 저장됨.
        String[] newArr = new String[2];

        // 배열복사 -> for문보다 System.arraycopy 메소드가 효율적이라고 함.
        System.arraycopy(arr, 0, newArr, 1,1);
        // arr배열의 0번째 인덱스부터 1개의 값을 newArr 배열의 1번째 인덱스에 복사
        // 복사한 배열의 인덱스 범위를 벗어날 경우 ArrayIndexOutofBoundsException 발생함

        // 다차원 배열도 생성 가능

        int classNum[][] = new int[2][2];  // 2x2 배열.
        // int[] classNum[] , int[][] classNum 도 가능
        classNum[0][0] = 1;
        classNum[0][1] = 2;
       // classNum[0][2] = 3;  ArrayIndexOutOfBoundsException


    }
}
