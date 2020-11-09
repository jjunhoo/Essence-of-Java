package Chapter11_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_Collections {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        Collections.addAll(list, 1,2,3,4,5);
        System.out.println("list : " + list);

        // element 회전
        Collections.rotate(list, 1);
        System.out.println("list : " + list);

        // element 위치 변경
        Collections.swap(list, 0, 2);
        System.out.println("list : " + list);

        // element 섞기
        Collections.shuffle(list);
        System.out.println("list : " + list);

        // 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("list : " + list);

        // 오름차순 정렬
        Collections.sort(list);
        System.out.println("list : " + list);

        // 3이 저장된 위치 (index) 반환 > * binarySearch 는 항상 정렬된 상태에서 사용해야 정확한 값을 얻을 수 있음
        int idx = Collections.binarySearch(list, 3);
        System.out.println("idx : " + idx);

        // max 값
        System.out.println("list max : " + Collections.max(list));

        // min 값
        System.out.println("list min : " + Collections.min(list));

        // list.size 만큼의 새로운 List 인스턴스 생성 후 '9'로 채움 (단, 결과는 변경 불가)
        List newList = Collections.nCopies(list.size(), 9);
        System.out.println("newList : " + newList);

        // 두 List 의 공통 요소가 없으면 true, 공통 요소가 있으면 false
        System.out.println("isDuplicate : " + Collections.disjoint(list, newList));

        // 2번째 파라미터의 리스트의 값들을 1번째 파라미터의 리스트로 복사
        Collections.copy(list, newList);
        System.out.println("list : " + list);
        System.out.println("newList : " + newList);

        // list 컬렉션 내의 값 '9' 들을 '1'로 모두 변경
        Collections.replaceAll(list, 9, 1);
        System.out.println("list : " + list);
    }
    /*
        [자바의 정석 - 기초편] ch11-52~56 Collections클래스, 컬렉션 클레스 요약

        [ Collections ]
        - Collection 을 위한 메서드 제공 (static) > Collections, Arrays, Objects
        - 컬렉션 채우기, 복사, 정렬, 검색 등 - fill(), copy(), sort(), binarySearch() 등

        - 컬렉션의 동기화 - synchronizedXXX()
            static Collection synchronizedCollection(Collection c)
            static List       synchronizedList(List list)
            static Set        synchronizedSet(Set set)
            static Map        synchronizedMap(Map map)
            static SortedSet  synchronizedSortedSet(SortedSet s)

        - 변경 불가 (ReadOnly) 컬렉션 - unmodifiableXXX()
            static Collection   unmodifiableCollection(Collection c)
            static List         unmodifiableList(List list)
            static Set          unmodifiableSet(Set set)
            static NavigableSet unmodifiableNavigableSet(NavigableSet s)
            static NavigableMap unmodifiableNavigableMap(NavigableMap m)
            static Map          unmodifiableMap(Map map)
            static SortedSet    unmodifiableSortedSet(SortedSet s)
            static SortedMap    unmodifiableSortedMap(SortedMap m)

        - 싱글톤 컬렉션 - singletonXXX()
            static List singletonList(Object o)
            static Set singleton(Object o)
            static Map singletonMap(Object key, Object value)

        - 한 종류의 객체만 저장하는 컬렉션 - checkedXXX()
            [ 예 : checkedList 생성 방법 ]
            List list = new ArrayList();
            List checkedList = checkedList(list, String.class); // 해당 ArrayList 는 String 타입만 저장 가능한 List 생성
            checkedList.add("abc");             // OK
            checkedList.add(new Integer(3));    // Error > ClassCastException 발생
     */
}
