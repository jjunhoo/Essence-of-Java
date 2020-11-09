package Chapter12_Generics;

public class Generics_7 {
    public static void main(String[] args) {

    }
    /*
        [자바의 정석 - 기초편] ch12-15,16 지네릭형변환

        - 제네릭 타입과 원시 타입 간의 형변환은 바람직 하지 않다. (경고 발생)
            Box<Object> objBox = null;
            Box box = (Box) objBox;     // OK. 제네릭 타입 -> 원시 타입
            objBox = (Box<Object>) box; // OK. 원시 타입 -> 제네릭 타입

        - 같은 제네릭 클래스라도 제네릭 타입이 다른 경우, 형변환 불가
            Box<Object> objBox = null;
            Box<String> strBox = null;
            objBox = (Box<Object>) strBox;  // 에러. Box<String> -> Box<Object>
            strBox = (Box<String>) objBox;  // 에러. Box<Object> -> Box<String>

        - 와일드 카드가 사용된 제네릭 타입으로는 형변환 가능
            Box<Object>     objBox     = (Box<Object>) new Box<String>();           // 에러. 형변환 불가능

            Box<? extends Object> wBox = (Box<? extends Object>) new Box<String>(); // OK.
            Box<? extends Object> wBox = new Box<String>();                         // 위 문장과 동일 (형변환 생략 => <? extends Object> 는 Object 와 그 자손까지 사용 가능하기 때문)

        - (중요) 컴파일러는 제네릭 타입을 제거하고, 필요한 곳에 형변환을 넣음 (제네릭은 컴파일 타임에만 존재)
            1. 제네릭 타입의 경계를 제거 (하위 호환성을 위함. 제네릭은 JDK 1.5 부터 추가)
                => 기본적으로는 타입 변수 T 가 Object 로 변환됨

                [ 소스 코드 ]
                class Box <T extends Fruit> {
                    void add (T t) {
                    ...
                    }
                }
                [ 컴파일 후 클래스 파일 ]
                class Box {
                    void add (Fruit t) {
                    ...
                    }
                }

            2. 제네릭 타입 제거 후에 타입이 불일치하면, 형변환을 추가
                [ 소스 코드 ]
                T get (int i) {
                    return list.get(i);
                }
                [ 컴파일 후 클래스 파일 ]
                Fruit get (int i) {
                    return (Fruit)list.get(i);
                }

            3. 와일드 카드가 포함된 경우, 적절한 타입으로 형변환 추가
                [ 소스 코드 ]
                static Juice makeJuice(FruitBox<? extends Fruit> box) {
                    String tmp = "";
                    for (Fruit f : box.getList())
                        tmp += f + " ";
                    return new Juice(tmp);
                }
                [ 컴파일 후 클래스 파일 ]
                static Juice makeJuice(FruitBox box) {
                    String tmp = "";
                    Iterator it = box.getList().iterator();
                    while (it.hasNext()) {
                        tmp += (Fruit) it.next() + " ";
                    }
                    return new Juice(tmp);
                }
     */
}
