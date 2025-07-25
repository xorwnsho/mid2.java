package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;

        System.out.println(Arrays.toString(arr));

        // 베열의 첫번째 위치에 추기
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫번재 위치에 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        newValue = 4;
        addMid(arr, 2, newValue);
        System.out.println(Arrays.toString(arr));

        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        newValue = 5;
        addLast(arr, newValue);
        System.out.println(Arrays.toString(arr));
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = newValue;
    }

    private static void addMid(int[] arr, int index,int newValue) {
        for(int i = arr.length-1; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = newValue;
    }

    private static void addLast(int[] arr, int newValue) {
        arr[arr.length-1] = newValue;
    }
}
