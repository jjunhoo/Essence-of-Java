package Generics;

import java.util.ArrayList;

class Fruit2                    { public String toString() { return "Fruit"; } }
class Apple2 extends Fruit2     { public String toString() { return "Apple"; } }
class Grape2 extends Fruit2     { public String toString() { return "Grape"; } }

// FruitBox2 클래스는 Box2 를 상속 받아, add, get, getList, size 등의 메소드 사용 가능
class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item)         { list.add(item); }
    T get(int i)             { return list.get(i); }
    ArrayList<T> getList()   { return list; }
    int size()               { return list.size(); }
    public String toString() { return list.toString(); }
}

class Juice {
    String name;

    Juice(String name)       { this.name = name + "Juice"; }
    public String toString() { return name; }
}

class Juicer {
    static <T extends Fruit2> Juice makeJuice(FruitBox2<T> box) { // 제네릭 메서드
    // static Juice makeJuice(FruitBox2<? extends Fruit2> box) {  // 와일드 카드 메서드
        String tmp = "";
        for (Fruit2 fruit : box.getList()) {    // Fruit2 를 사용하여 하위 클래스까지 사용 가능하도록 함
            tmp += fruit + " ";
        }
        return new Juice(tmp);
    }
}

public class Generics_6 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<>();
        FruitBox2<Apple2> appleBox = new FruitBox2<>();

        // 하나의 참조 변수로 여러 타입의 제네릭 클래스 참조 가능
        FruitBox2<? extends Fruit2> wildcardBox = new FruitBox2<Fruit2>();
        wildcardBox = new FruitBox2<Apple2>();
        wildcardBox = new FruitBox2<Grape2>();

        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
        appleBox.add(new Apple2());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
    /*
        [자바의 정석 - 기초편] ch12-12~14 와일드카드, 지네릭 메서드

        [ 와일드 카드 <?> ]

        - 하나의 참조 변수로 대입된 타입이 다른 객체를 참조 가능하도록 해줌
            => 와일드 카드 기능이 없다면, 참조용 변수와 인스턴스 생성용 생성자의 타입 변수가 항상 일치해야 하는 제네릭 사용 제약 발생
            ArrayList<? extends Product> list = new ArrayList<Tv>();        // OK. Tv 클래스는 Product 클래스를 상속 받았기 때문에 제네릭 인스턴스 생성 가능 가능
            ArrayList<? extends Product> list = new ArrayList<Audio>();     // OK. Audio 클래스는 Product 클래스를 상속 받았기 때문에 제네릭 인스턴스 생성 가능 가능
            ArrayList<Product> list = new ArrayList<Tv>();                  // 에러. 대입된 타입 불일치

        - <? extends T> : 와일드 카드의 상한 제한. T 와 그 자손들만 가능 (Product, Tv, Audio) => 가장 많이 사용 ! / 상한을 T 까지로 제한
        - <? super T>   : 와일드 카드의 하한 제한. T 와 그 조상들만 가능 (Product, Object) => 하한을 T 까지로 제한
        - <?>           : 제한 없음. 모든 타입이 가능. <? extends Object> 와 동일 ! => Object 가 최상위 레벨 Class 이기 때문

        - 메서드의 매개변수에 와일드 카드 <?> 사용
            // 메서드의 배개변수로 와일드 카드를 Fruit 까지 상한 제한
            static Juice makeJuice(FruitBox<? extends Fruit> box) {
                String tmp = "";
                for (Fruit f : box.getList()) {
                    tmp += f + " ";
                }
                return new Juice(tmp);
            }

            Juicer.makeJuice(new FruitBox<Fruit>()));   // OK. Fruit
            Juicer.makeJuice(new FruitBox<Apple>()));   // OK. Fruit 클래스를 상속 받은 Apple 클래스도 매개변수로 전달 가능


        [ 제네릭 메서드 ]

        - 제네릭 타입이 선언된 메서드 (타입 변수는 메서드 내에서만 유효)
            static <T> void sort (List<T> list, Comparator<? super T> c)

        - 클래스의 타입 매개변수 <T> 와 메서드의 타입 매개변수 <T> 는 별개 !
            class FruitBox<T> {
                ...
                static <T> void sort (List<T> list, Comparator<? super T> c) {
                    ...
                }
            }

        - [ 중요 ! ] 메서드를 호출할 때마다 타입을 대입해야 함 (대부분 생략 가능)
            FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
            FruitBox<Apple> appleBox = new FruitBox<Apple>();
            ...
            System.out.println(Juicer.<Fruit> makeJuice(fruitBox));
            System.out.println(Juicer.<Apple> makeJuice(appleBox));

            [ Method ]
            // 매개변수로 받을 타입 변수를 정의 => <T extends Fruit>
            //      => Fruit, Apple, Grape 가능 !
            static <T extends Fruit> Juice makeJuice (FruitBox <T> box) {
                String tmp = "";
                for (Fruit f : box.getList()) tmp += f + " ";
                return new Juice(tmp));
            }

        - 제네릭 메서드
            메서드를 호출할 때마다 다른 제네릭 타입을 대입할 수 있게 한 것
        - 와일드 카드 메서드
            하나의 참조변수로 서로 다른 타입이 대입된 여러 제네릭 객체를 다루기 위한 것
     */
}
