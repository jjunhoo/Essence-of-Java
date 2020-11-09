package Chapter11_Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Collection_HashSet_1 {
    public static void main(String[] args) {
        Object[] objArray = {"1", 1, "2","2","2","3","3","3","4","4","4"};
        Set set = new HashSet();

        for (int i=0; i< objArray.length; i++) {
            set.add(objArray[i]);
        }
        // 중복을 허용하지 않는데, 1이 두번 나온 이유는 하나는 String 타입이고, 하나는 Integer 타입이기 때문
        System.out.println("[Set] : " + set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator : " + iterator.next());
        }


        // Set 은 순서 유지 X 및 정렬 X ! > 정렬하기 위해서는 List 로 변환 후 sort
        Set tempset = new HashSet();
        for (int i=0; i<6; i++) {
            tempset.add((int)(Math.random() * 45) + 1);
        }
        System.out.println("[temp set] : " + tempset);

        // 정렬을 위해 LinkedList 로 변환 후 Collection 을 이용하여 sort
        List list = new LinkedList(tempset);
        Collections.sort(list);
        System.out.println("[LinkedList sort] : " + list);
    }

    /*
        [자바의 정석 - 기초편] ch11-34~36 HashSet(1)

        [ HashSet ]
        - Set : HashSet, SortedSet - TreeSet
        - HashSet : 순서 X, 중복 X
            - Set 인터페이스를 구현한 대표적인 Collection
            - 순서를 유지하려면, LinkedHashSet 사용
        - TreeSet
            - 범위 검색과 정렬에 유리
            - HashSet 보다 데이터 추가, 삭제에 시간이 더 소요
     */
}
