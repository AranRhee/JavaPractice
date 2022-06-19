package Ch5_Array;

import java.util.Arrays;

public class ArraySample {
    public static void main(String args[]) {
        ArraySample as = new ArraySample();
        int numArr[] = {10,7,2,19};
        as.inertionSort(numArr);
        for(int sortedNum : numArr) {
            System.out.print(sortedNum+ ",");
        }

        System.out.println("");

        int numArr2[] = {92,1,76,22};
        Arrays.sort(numArr2);
        for(int sortedNum : numArr2) {
            System.out.print(sortedNum+",");
        }




    }

    public void inertionSort(int[] numArr) {
        // 배열 정렬하기 (삽입정렬 -> 두번째 인덱스부터 시작하여 앞에 값과 비교해 적절한 위치로 넣어줌)

        for(int i=1; i<numArr.length; i++){
            int num = numArr[i];  //선택한 수를 num 변수에 저장.
            int idx = i;

            while(idx > 0 && num < numArr[idx - 1]){   // 선택한 수가 배열의 이전 요소보다 작다면
                numArr[idx] = numArr[idx-1];  // 배열의 이전 요소를 뒤로 위치시킴
                idx --;
            }
            numArr[idx] = num;  // 선택한 수 적절한 위치에 반영
        }
    }

}
