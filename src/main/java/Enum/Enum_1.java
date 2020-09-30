package Enum;

// Enum > 열거형 선언
enum Direction { EAST, SOUTH, WEST, NORTH }

public class Enum_1 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;              // 열거형 타입.상수이름
        Direction d2 = Direction.valueOf("WEST");   // valueOf() 를 통해서도 추출 가능
        Direction d3 = Enum.valueOf(Direction.class, "EAST"); // 열거형 최고 조상인 Enum 의 valueOf() 를 통해서도 추출 가능

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1==d2 ? " + (d1==d2)); // OK. '==' 등가 연산자 사용 가능
        System.out.println("d1==d3 ? " + (d1==d3)); // OK. '==' 등가 연산자 사용 가능

        System.out.println("d1.equals(d3) ? " + d1.equals(d3)); // * equals() 메소드를 사용하여 비교 가능 (객체이기 때문)

        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3))); // 같기 때문에 0
        System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2))); // d1 = 0, d2 = 2 이기 때문에 0 - 2 = -2

        // Switch 문에서는 enum 의 값만 사용 ! (문법)
        switch (d1) {
            case EAST:
                System.out.println("The direction is EAST"); break;
            case SOUTH:
                System.out.println("The direction is SOUTH"); break;
            case WEST:
                System.out.println("The direction is WEST"); break;
            case NORTH:
                System.out.println("The direction is NORTH"); break;
        }

    }
    /*
        [자바의 정석 - 기초편] ch12-17~20 열거형

        - 관련된 상수들을 같이 묶어 놓는 것 (java 는 타입에 안전한 열거형 제공 => 값과 타입 체크)
            if (Card.Kind.CLOVER == Card.Value.TWO) {   // 컴파일 에러. 타입이 다름
                ...
            }

        - 열거형 정의 방법
            enum Direction {
                EAST,
                SOUTH,
                WEST,
                NORTH
            }

        - 열거형 타입의 변수를 선언하고 사용하는 방법
            class Unit {
                int x, y;       // 유닛의 위치
                Direction dir;  // 열거형 인스턴스 변수 선언

                void init() {
                    dir = Direction.EAST;   // 유닛의 방향을 EAST 로 초기화 (enum 에 선언된 값만 가능)
                }
            }

        - (중요) 열거형 상수의 비교에는 '==' 와 'compareTo()' 사용 가능
            if (dir == Direction.EAST) {                    // OK.
                x++;
            } else if (dir > Direction.WEST) {              // 에러. 열거형 상수에 비교 연산자 사용 불가 (* 각각의 요소가 객체이기 때문)
                ...
            } else if (dir.compareTo(Direction.WEST) > 0) { // OK.
                ...
            }

        - 모든 열거형은 Enum 의 자손이며, 아래의 메서드를 상속 받음
            1. Class<E> getDeclaringClass()                 - 열거형의 Class 객체 반환
            2. String name()                                - 열거형 상수의 이름을 문자열로 반환
            3. int ordinal()                                - 열거형 상수가 정의된 순서 반환 (0부터 시작)
            4. T valueOf(Class<T> enumType, String name)    - 지정된 열거형에서 name 과 일치하는 열거형 상수 반환

        - (중요) values(), valueOf() 는 컴파일러가 자동으로 추가
            1. static E[] values()
            2. static E valueOf(String name)
                => values()
                   Direction d = Direction.valueOf("WEST"); // Direction d = Direction.WEST; 와 동일

                => valueOf()
                   Direction[] dArr = Direction.values();

                   for (Direction d : dArr) {   // for (Direction d : Direction.values())
                        System.out.println("name : " + d.name() + " / ordinal : " + d.ordinal());
                   }
     */
}
