package Generics;

import java.util.ArrayList;

public class Generics_1 {
    public static void main(String[] args) {
        // 아래 ArrayList 는 Generics 를 통해 type 을 한정하지 않았기 때문에 모든 type 저장 가능
        ArrayList list = new ArrayList();
        list.add(10);       // Integer
        list.add(20);       // Integer
        list.add("30");     // String   => 컴파일 에러가 발생하지 않음 (Generics 로 Integer 만 한정하지 않았기 때문)

        // Integer integer = (Integer) list.get(2);    // 컴파일은 OK > 하지만, Runtime 시 ClassCastException 발생
        // * 실행 시 발생하는 에러는 프로그램이 비정상 종료 되기 때문에 컴파일 시 에러를 발생시키기 위해 Generics 탄생
        System.out.println("[list] : " + list);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        // * 제네릭스를 사용한 경우, Integer 타입이 아니라면 컴파일 에러를 발생시킴 (따라서, 실행 전 코딩 단계에서 수정 가능)
        // list2.add("30");
        Integer integer2 = list2.get(2);    // 제네릭스 사용 시, 형변환이 불필요해지기 때문에 형변환 코드 생략 가능 !
        System.out.println("[list2] : " + list2);
    }
    /*
        [자바의 정석 - 기초편] ch12-1 지네릭스란?

        [ 제네릭스 ]
        - 컴파일 시 타입을 체크해주는 기능 (compile-time type check) > JDK 1.5
            // TV 객체만 저장할 수 있는 ArrayList 생성
            ArrayList<Tv> tvList = new ArrayList<Tv>();
            tvList.add(new Tv());    // OK
            tvList.add(new Audio()); // 컴파일 에러 > Tv 외 다른 타입은 저장 불가
        - 객체의 타입 안정성을 높이고, 형변환의 번거로움을 줄여주기 때문에 코드가 간결해짐
     */
}
