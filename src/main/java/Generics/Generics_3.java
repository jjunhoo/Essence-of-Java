package Generics;

import java.util.ArrayList;

class Product {}
class Tv1 extends Product {}
class Audio1 extends Product {}

public class Generics_3 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv1> tv1List = new ArrayList<Tv1>();

        // ArrayList<Product> productList2 = new ArrayList<Tv1>(); // 에러. 타입이 같아야 함
        // List<Tv1> list = new ArrayList<Tv1>();                  // OK. 다형성 (List, ArrayList)

        productList.add(new Product());
        productList.add(new Tv1());     // Product 의 자손 객체이기 때문에 Tv1 추가 가능
        productList.add(new Audio1());  // Product 의 자손 객체이기 때문에 Audio1 추가 가능

        tv1List.add(new Tv1());
        tv1List.add(new Tv1());         // 하위 객체이기 때문에 Tv1 이외의 객체는 추가 불가 (다형성 없음)

        printAll(productList);
        // printAll(tv1List);           // 컴파일 에러 (파라미터 타입은 ArrayList<Product> 이기 때문)
    }
    public static void printAll(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println("[list] : " + p);
        }
    }
    /*
        [자바의 정석 - 기초편] ch12-4~6 지네릭스용어, 지네릭 타입과 다형성

        [ 제네릭스 용어 ]
        - Box<T> : 제네릭 클래스. 'T의 Box' 또는 'T Box' 라고 읽음
        - T      : 타입 변수 또는 타입 매개변수 (T는 타입 문자)
        - Box    : 원시 타입 (Raw type) > 일반 클래스

        - 참조 변수와 생성자의 대입된 타입은 일치해야 함
            ArrayList<Tv>        list = new ArrayList<Tv>();    // OK. 일치
            ArrayList<Product>   list = new ArrayList<Tv>();    // 에러. 불일치

        - 제네릭 클래스간의 다형성은 성립 (하지만, 대입된 타입은 일치해야함)
            List<Tv> list = new ArrayList<Tv>();    // OK. 다형성. ArrayList 가 List 구현
            List<Tv> list = new LinkedList<Tv>();   // OK. 다형성. LinkedList 가 List 구현

        - 매개변수의 다형성 성립
            ArrayList<Product> list = new ArrayList<Product>();
            list.add(new Product());
            list.add(new Tv());     // OK. 자손 객체
            list.add(new Audio());  // OK. 자손 객체
     */
}
