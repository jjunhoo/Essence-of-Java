package Chapter11_Collection;

import java.util.Arrays;

public class Collection_2 {
    public static void main(String[] args) {
        // [ [자바의 정석 - 기초편] ch11-25~29 Arrays ]

        // [ Arrays ]
        // 1. 배열을 다루기 편한 static 메소드이다.
        // 2. 여러 가지 type 으로 Overloading 되어 있다.
        // 3. 배열의 복사
        //  - copyOf()
        //      - A 배열을 B에 복사
        //  - copyOfRange()
        //      - A 배열의 특정 index ~ index 까지 복사
        //  - fill()
        //      - param 값으로 배열을 채운다.
        //  - setAll()
        //      - lambda 식을 param 으로 받아서 사용
        //      - Arrays.setAll(arr, (i) -> (int)(Math.random() * 5 + 1);
        //          - 1 ~ 5 사이의 값을 arr 배열의 값으로 셋팅
        //  - sort()
        //      - 배열 정렬
        //  - binarySearch()
        //      - * 반드시 배열이 정렬된 상태에서만 사용 가능 (미정렬 상태에서 사용 시 잘못된 결과 return)
        //          [ 잘못된 예 ]
        //          int[] arr = { 3, 2, 0, 1, 4 };
        //          int idx = Arrays.binarySearch(arr, 2);
        //              - 위 배열 arr 에서 value - 2 는 1번째 idx 에 위치하므로 1이 리턴되어야 하는데 -5가 리턴
        //          [ 올바른 예 ]
        //          Arrays.sort(arr);   // 배열 정렬
        //          System.out.println(Arrays.toString(arr)); // [0,1,2,3,4]
        //          int idx = Arrays.binarySearch(arr, 2);    // idx = 2
        //  - deepToString()
        //      - 다차원 배열을 출력하기 위한 메소드
        //          - int[][] arr2D = {{11,12}, {21,22}};
        //  - deepEquals()
        //      - 다차원 배열 비교를 위한 메소드
        //          - String[][] arr2D1 = new String[][]{{11,12}, {21,22}};
        //          - String[][] arr2D2 = new String[][]{{11,12}, {21,22}};
        //              - Arrays.equals(arr2D1, arr2D2);     // false - 잘못된 비교
        //              - Arrays.deepEquals(arr2D1, arr2D2); // true  - 올바른 비교
        //  - asList(Object... a)
        //      - 배열을 List 로 변환
        //          - List list = Arrays.asList(1,2,3,4,5);
        //              - 위 list 는 Read Only 로 element 추가가 되지 않음
        //              - list.add(6); // X 불가 (unsupportedOperationException 발생)
        //          - 위 asList 를 통해 element 추가 및 삭제가 가능한 array 를 생성하기 위해서는 아래와 같이 생성
        //              - List list = new ArrayList(Arrays.asList(1,2,3,4,5));

        int[]   array   = {0,1,2,3,4};
        int[][] array2D = {{11,22,33}, {44,55,66}};
        System.out.println("[array] : " + Arrays.toString(array));
        System.out.println("[array2D] : " + Arrays.deepToString(array2D));

        int[] arr2 = Arrays.copyOf(array, 5);
        int[] arr3 = Arrays.copyOf(array, 3);
        int[] arr4 = Arrays.copyOf(array, 7);
        int[] arr5 = Arrays.copyOfRange(array, 2,4);
        int[] arr6 = Arrays.copyOfRange(array, 0,7);
        System.out.println("[arr2] : " + Arrays.toString(arr2));
        System.out.println("[arr3] : " + Arrays.toString(arr3));
        System.out.println("[arr4] : " + Arrays.toString(arr4));
        System.out.println("[arr5] : " + Arrays.toString(arr5));
        System.out.println("[arr6] : " + Arrays.toString(arr6));
        System.out.println();

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);
        System.out.println("[arr7] : " + Arrays.toString(arr7));
        System.out.println();

        Arrays.setAll(arr7, i -> (int)(Math.random() * 6) + 1);
        System.out.println("[arr7] : " + Arrays.toString(arr7));
        System.out.println();

        for (int i : arr7) {
            System.out.println("[enhanced for loop] : " + i);
        }
    }
}
