public class InsertionSort {

    public static int[] solution(int n, int[] arr) {

        //타겟 인덱스를 넣을 pivot, 스왑 때 사용할 temp 선언
        int pivot, temp;

        //바깥 for문으로 타겟 선정
        //(이전 인덱스와 비교해야하므로 idx=1 부터시작)
        for (int i=1; i<n; i++) {
            pivot = i;
            //안의 for문으로 타겟 이전idx~0까지 타겟과 비교
            for(int j = i-1; j>=0; j--) {
                //타겟이 이전 값보다 작다면 스왑 + 타겟idx-=1
                if (arr[pivot]<arr[j]) {
                    temp = arr[pivot];
                    arr[pivot] = arr[j];
                    arr[j] = temp;
                    pivot--;
                } else {
                    //타겟이 이전 값보다 크다면 for문종료--->타겟이동
                    break;
                }
            }
        }
        return arr;
    }
    //테스트
    public static void main(String args[]) {
        int[] arr = {8, 3, 10, 5, 7, 9, 6, 4, 1, 2};
        solution(10, arr);

        for (int p=0; p<10; p++) {
            System.out.print(arr[p]);
        }
    }
}