package Chapter12_Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
    @Override
    public String toString() {
        return name + " : " + ban + " : " + no;
    }
}

public class Generics_4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("java kim", 1, 1));
        list.add(new Student("java lee", 2, 1));
        list.add(new Student("java park", 1, 2));

        Iterator<Student> iterator = list.iterator();

        while (iterator.hasNext()) {
            // Student student = (Student) iterator.next(); // 제네릭스를 사용하지 않았다면, 이처럼 형변환이 필요했을 것
            Student student = iterator.next();
            System.out.println("[student] : " + student.toString());
        }

        HashMap<String, Student> map = new HashMap<>(); // JDK 1.7 부터 생성자에 타입 지정 생략 가능
        map.put("java kim", new Student("java kim", 1, 1));
        System.out.println("[hashmap] : " + map);

        Student student = map.get("java kim");
        System.out.println(student.toString());
    }
    /*
        [자바의 정석 - 기초편] ch12-7,8 Iterator, HashMap과 지네릭스

        [ HashMap <K,V> - Key, Value (나름대로 변수의 의미를 두기 위하여 K,V로 지정   ) ]
        - 여러 개의 타입 변수가 필요한 경우, 콤마를 구분자로 선언
            HashMap<String, Student> map = new HashMap<String, Student>();  // 생성
            map.put("java kim", new Student("java kim", 1, 3));             // 데이터 저장
     */
}
