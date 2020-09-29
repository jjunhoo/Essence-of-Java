package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection_HashMap_1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 90);
        map.put("김자바", 100); // 같은 Key 에 대해서 값을 덮어쓰기 때문에 90 은 삭제되고 100 이 됨
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("박자바", 70);
        System.out.println("map : " + map);

        Set set = map.entrySet();
        Iterator iterator = set.iterator(); // Iterator 는 1회성

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("[key] : " + entry.getKey() + " / [value] : " + entry.getValue());
        }

        System.out.println("[명단] : " + map.keySet());

        Collection values = map.values();
        Iterator it = values.iterator();
        int total = 0;

        while (it.hasNext()) {
            total += (int) it.next();
        }
        System.out.println("total : " + total);
        System.out.println("average : " + (double) total / set.size());
        System.out.println("max " + Collections.max(values));
        System.out.println("min " + Collections.min(values));
    }
    /*
        [자바의 정석 - 기초편] ch11-46,47 HashMap(1)

        [ HashMap, HashTable - 순서 X, 중복 (키 X, 값 O) ]
        - Map 인터페이스를 구현. 데이터를 키와 쌍의 쌍으로 저장
        - HashMap (동기화 X) 은 HashTable (동기화 O) 의 신버전

        [ HashMap ]
        - Map 인터페이스를 구현한 대표적인 컬렉션 클래스
        - 순서를 유지하려면, LinkedHashMap 클래스를 사용하면 됨
        - Hashing (해싱 기법) 으로 데이터를 저장, 데이터가 많아도 검색이 빠름

        [ TreeMap ]
        - 범위 검색과 정렬에 유리한 컬렉션 클래스
        - HashMap 보다 데이터 추가, 삭제에 시간이 더 거림
        - TreeSet 과 같은 특성을 갖음 (저장 방식만 다름)
     */
}
