package Collection;

import java.util.HashSet;
import java.util.Objects;

public class Collection_HashSet_2 {
    public static void main(String[] args) {
        HashSet setA = new HashSet<>();
        HashSet setB = new HashSet<>();

        setA.add("1"); setA.add("2"); setA.add("3"); setA.add("4"); setA.add("5");
        setB.add("4"); setB.add("5"); setB.add("6"); setB.add("7"); setB.add("8");

        // 1개씩 실행 !
        // 교집합
        setA.retainAll(setB);
        System.out.println("[교집합] : " + setA);

        // 합집합
        setA.addAll(setB);
        System.out.println("[합집합] : " + setA);

        // 차집합
        setA.removeAll(setB);
        System.out.println("[차집합] : " + setA);


        // equals, hashCode 오버라이딩을 통한 HashSet 사용, equals, hashCode 미구현 시 2개 인스턴스 모두 add > HashSet 기능 상실
        HashSet set = new HashSet<>();
        set.add("abc");
        set.add("abc");

        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println("set :: " + set);


         /*
            [자바의 정석 - 기초편] ch11-37,38 HashSet(2)

            - HashSet 은 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인하여 같은 객체가 없으면 저장, 있으면 저장 X
            - * boolean add(Object o) 는 저장할 객체의 equals()와 hashCode()를 호출
                - 사용자 클래스를 통해 HashSet 을 이용할 경우, equals()와 hashCode() 오버라이딩 필수 !
                - 만약 오버라이딩 되어 있지 않는 경우, 중복 판별 불가
         */
    }
}
class Person {
    String name;
    int age;

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }

    // equals 메소드 오버라이딩
    @Override
    public boolean equals(Object obj) {
        // 비교 대상이 Person 클래스의 인스턴스가 아닌 경우, false
        if (!(obj instanceof Person)) return false;
        // param object 를 Person 클래스로 형변환
        Person person = (Person) obj;
        // Person 클래스의 name, age 와 obj 의 name, age 비교
        return this.name.equals(person.name) && this.age == person.age;
    }

    // Objects 클래스의 hash 메소드를 사용하여 hashCode 구현
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
