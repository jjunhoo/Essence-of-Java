package Collection;

import java.util.Arrays;
import java.util.Comparator;

public class Collection_3 {
    // [ [자바의 정석 - 기초편] ch11-25~29 Comparator 와 Comparable ]

    /*
        - Comparable : 기본 정렬 기준을 구현하는데 사용
            public interface Comparable {
                int compareTo (Object o);
            }
        - Comparator : 기본 정렬 기준 외에 다른 기준으로 정렬하고자 할 때 사용
            public interface Comparator {
                int compare (Object o1, Object o2); // o1, o2 두 객체를 비교 구현
                boolean equals (Object obj);        // equals 메소드 오버라이딩 구현
            }

        - Compare 와 CompareTo 는 두 객체의 비교 결과를 반환하도록 작성. 같으면 0, 왼쪽이 크면 양수(+), 왼쪽이 작으면 (-)
            - 오름차순, 내림차순일 경우에 따라 구현
     */
    public static void main(String[] args) {
        String[] strarr = {"cat", "Dog", "lion", "tiger"};
        Arrays.sort(strarr);
        System.out.println("[strarr] : " + Arrays.toString(strarr));

        Arrays.sort(strarr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 없이 비교
        System.out.println("[strarr] : " + Arrays.toString(strarr));

        Arrays.sort(strarr, new Descending()); // 직접 구현한 Descending 클래스를 통해 문자열 내림차순
        System.out.println("[strarr] : " + Arrays.toString(strarr));
    }

    // 내림차순 정렬을 위한 기준을 만들기 위해 Comparator 구현 및 compare 메소드를 오버라이딩 한 클래스 생성
    static class Descending implements Comparator {
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Comparable && o2 instanceof Comparable) {
                Comparable c1 = (Comparable) o1;
                Comparable c2 = (Comparable) o2;

                return c2.compareTo(c1);
            }
            return -1;
        }
    }
}
