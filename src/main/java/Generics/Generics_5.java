package Generics;

import java.util.ArrayList;

interface Eatable {}

class Fruit implements Eatable {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit { public String toString() { return "Apple"; } }
class Grape extends Fruit { public String toString() { return "Grape"; } }
class Toy                 { public String toString() { return "Toy"; } }

class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item)         { list.add(item); }
    T get(int i)             { return list.get(i); }
    int size()               { return list.size(); }
    public String toString() { return list.toString(); }
}

// FruitBox 는 타입 변수로 Fruit 를 상속 받고, Eatable 인터페이스를 구현한 클래스만 허용 (Fruit 클래스가 이미 Eatable 인터페이스를 구현했기 때문에 사실상 & Eatable 은 필요 없음)
// 인터페이스를 같이 명시할 경우에는 '&' 사용
class FruitBox <T extends Fruit & Eatable> extends Box<T> { }

public class Generics_5 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
        // FruitBox<Grape> grapeBox = new FruitBox<Apple>();   // 에러. 타입 불일치 (참조 변수와 생성자에 대입된 타입 불일치)
        // FruitBox<Toy>   toyBox   = new FruitBox<>();        // 에러. 타입 변수에 저장 불가 (Fruit 자손 클래스가 아님)

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        // fruitBox.add(new Toy());    // Fruit 클래스를 상속 받지 못했기 때문에 사용 불가
    }
    /*
        [자바의 정석 - 기초편] ch12-9~11 제한된 지네릭 클래스, 지네릭스의 제약

        [ 제한된 제네릭 클래스 ]
        - extends 로 대입할 수 있는 타입을 제한

            class FruitBox <T extends Fruit> {
                ArrayList <T> list = new ArrayList<T>();  // Fruit 를 상속 받은 클래스만 타입 변수로 지정 가능
                ...
            }

            FruitBox <Apple> appleBox = new FruitBox <Apple>(); // OK.
            FruitBox <Toy> toyBox = new FruitBox <Toy>();       // 에러. Toy 는 Fruit 를 상속 받은 클래스가 아닌 경우, 지정 불가

        - * 인터페이스인 경우에도 extends 사용 ! (중요 - implements 아님)

            interface Eatable {}
            class FruitBox <T extends Eatable> { ... }


        [ 제네릭스 제약 ]

        - 타입 변수에 대입은 인스턴스별로 다르게 사용 가능
            Box <Apple> appleBox = new Box <Apple>();   // OK. Apple 객체만 저장 가능
            Box <Grape> grapeBox = new Box <Grape>();   // OK. Grape 객체만 저장 가능

        - static 멤버에 타입 변수 사용 불가 (공유 변수이기 때문에 여러 타입을 받는 목적의 타입 변수를 제한할 수 없음)
            class Box <T> {
                static  T item;                          // 에러.
                static int compare (T t1, T t2) { ... }  // 에러.
                ...
            }

        - 객체/배열 생성 시 타입 변수 사용 불가. 타입 변수로 객체/배열 선언은 가능
            class Box <T> {
                T[] itemArr;    // OK. T 타입의 배열을 위한 참조 변수 선언은 가능
                T[] toArray() {
                    // 인스턴스 생성은 타입이 확정된 상태에서만 가능 ! (new 다음 타입 변수 사용 불가 !)
                    T[] tmpArr = new T[itemArr.length]; // 에러. 제네릭 배열 생성 불가
                }
            }
     */
}
