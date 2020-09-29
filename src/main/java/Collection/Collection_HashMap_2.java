package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Collection_HashMap_2 {
    public static void main(String[] args) {
        String[] data = { "A", "K", "A", "K", "D", "A", "K", "S" };

        HashMap map = new HashMap();

        for (int i=0; i<data.length; i++) {
            // 이미 Key 값이 존재하는 경우
            if (map.containsKey(data[i])) {
                int num = (int) map.get(data[i]);
                map.put(data[i], num + 1);
            } else {
                // key 값이 존재하지 않는 경우, value - 1로 저장
                map.put(data[i], 1);
            }
        }

        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
