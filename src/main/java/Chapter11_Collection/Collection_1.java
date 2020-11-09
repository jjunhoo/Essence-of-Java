package Chapter11_Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;
import java.util.Map;

public class Collection_1 {
    public static void main(String[] args) {
        // [자바의 정석 - 기초편] Iterator, Enumeration, Map과 Iterator

        // ArrayList > Iterator 사용 예제
        List list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator iterator = list.iterator();

        // 첫번째 iterator 에서는 element 정상 출력
        while (iterator.hasNext()) {
            System.out.println("[LIST - Iterator] : " + iterator.next());
        }

        // 두번째 iterator 에서는 element 미출력 (이미 위 iterator 에서 element 를 모두 읽었기 때문)
        // iterator 는 1회성이라서 다시 사용하기 위해서는 아래와 같이 다시 얻어와야함
        // iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("[LIST - Iterator] : " + iterator.next());
        }

        // * Iterator 인터페이스를 구현한 Collection 에서 사용 가능 (List, Set 등)
        //      - Map 은 Collection 을 구현한 것이 아니기 때문에 keySet(), entrySet(), values() 를 통하여 Iterator 를 사용해야 함
        // * Iterator 를 구현한 Collection 을 표준화된 방법으로 반복 처리 가능
        Map map = new HashMap();
        map.put("1","value-1");
        map.put("2","value-2");
        Iterator it = map.entrySet().iterator();
        // Iterator it = map.values().iterator();
        // Iterator it = map.keySet().iterator();

        while (it.hasNext()) {
            System.out.println("[Map - Iterator] : " + it.next());
        }


        // 1. hasNext()
        //      - 다음 요소가 있는지 확인 > return boolean
        // 2. next()
        //      - 다음 요소 return > return E
        // 3. remove()
        //      - 해당 요소 제거
        // 4. forEachRemaining(Consumer<? super E> action) - java 8
        //      - action 이 Object.requireNonNull 일 경우, hasNext()를 통해
        //        element 가 없을 때까지 next() 메소드를 통해 확인
        //      - java 8 > default method 로 추가
        //        default void forEachRemaining(Consumer<? super E> action)
    }
}
