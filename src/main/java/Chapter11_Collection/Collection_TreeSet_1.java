package Chapter11_Collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Collection_TreeSet_1 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        /*
        for (int i=0; set.size()<6; i++) {
            int num = (int)(Math.random() * 45) + 1;
            set.add(num);
        }
        */
        set.add(new TreeSetTestComparable());

        // TreeSet 은 순서를 유지하기 때문에 정렬된 상태로 출력됨
        System.out.println(set);


        TreeSet set1 = new TreeSet<>();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i=0; i<score.length; i++) {
            set1.add(new Integer(score[i]));
        }

        System.out.println("50 보다 작은 값 :" + set1.headSet(50));
        System.out.println("50 보다 큰 값 :" + set1.tailSet(50));
        System.out.println("40 ~ 80 사이의 값 : " + set1.subSet(40, 80));
    }
    /*
         [자바의 정석 - 기초편] ch11-39~41 TreeSet(1)

         [ TreeSet ]
         - 이진 탐색 트리(binary search tree)로 구현, 범위 탐색과 정렬에 유리
         - 이진 트리는 모든 노드가 최대 2개의 하위 노드를 갖음 (Linked List 의 변형)
         - 부모 보다 작은 값은 왼쪽, 큰 값은 오른쪽에 저장
         - 데이터가 많아질수록 추가, 삭제에 시간이 많이 소요 (비교 횟수 증가)
         - TreeSet 은 중복값을 저장하지 않음 (equals, hashcode 를 통해 값 비교)
         - TreeSet 에 직접 생성한 class 를 add 하기 위해서는 Comparator (compare) 또는 Comparable (compareTo) 인터페이스를 구현하여야 함
         - 이진 트리의 모든 노드를 한번씩 읽는 것을 '트리 순회'라고 한다.
         - 전위, 중위, 후위, 레벨 순회법이 있으며, 중위 순회를 하면 오름차순으로 정렬된다.
     */
}

// Comparable > compareTo 메소드를 구현한 클래스 (기본 비교 기준이기 때문에 생성자에 넣어주지 않더라도 TreeSet 에 add 가능)
class TreeSetTestComparable implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 1; // 0 으로 설정할 경우, 같은 객체로 판단
    }
}

// Comparator > compare 메소드를 구현한 클래스 (사용자용 비교 기준이기 때문에 생성자에 넣어주어야 TreeSet 에 add 가능)
class TreeSetTestComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return 1;
    }
}

