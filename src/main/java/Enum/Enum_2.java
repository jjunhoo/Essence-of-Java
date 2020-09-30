package Enum;

enum Direction2 {
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

    private static final Direction2[] DIR_ARR = Direction2.values();

    private final int value;
    private final String symbol;

    Direction2(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    // 방향 회전을 위한 메서드 (num 값만큼 90도씩 시계방향으로 회전)
    public Direction2 rotate (int num) {
        num = num % 4;

        if (num < 0) num += 4;  // num 이 음수인 경우, 시계 반대방향으로 회전

        return DIR_ARR[(value - 1 + num) % 4];
    }

    public static Direction2 of(int dir) {
        if (dir < 1 || dir > 4) {
            throw new IllegalArgumentException("Invalid value : " + dir);
        }
        return DIR_ARR[dir - 1];
    }

    public int getValue()     { return value; }
    public String getSymbol() { return symbol; }
    @Override
    public String toString()  { return name() + " " + getSymbol(); }
}

public class Enum_2 {
    public static void main(String[] args) {
        for (Direction2 direction : Direction2.values()) {
            System.out.println(direction.name() + " " + direction.getSymbol());
        }

        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.of(1);
        System.out.println(d1.name() + " " + d1.getSymbol());
        System.out.println(d2.name() + " " + d2.getSymbol());

        System.out.println(Direction2.EAST.rotate(1));
        System.out.println(Direction2.EAST.rotate(2));
        System.out.println(Direction2.EAST.rotate(-1));
        System.out.println(Direction2.EAST.rotate(-2));
    }
    /*
        [자바의 정석 - 기초편] ch12-21,22 열거형멤버추가하기

        - 불연속적인 열거형 상수의 경우, 원하는 값을 괄호 안에 적는다.
            enum Direction { EAST(1), SOUTH(5), WEST(-1), NORTH(10) }

        - 괄호를 사용하려면, 인스턴스 변수와 생성자를 새로 추가해줘야 한다.
            enum Direction {
                EAST(1), SOUTH(5), WEST(-1), NORTH(10);         // 끝에 ';' 세미콜론 추가

                private final int value;                        // 정수를 저장할 필드 추가 (인스턴스 변수)

                Direction(int value) { this.value = value; }    // 생성자 추가 (생성자는 항상 private)

                public int getValue() { return value; }
            }

        - 열거형의 생성자는 묵시적으로 private 이므로, 외부에서 객체 생성 불가
            Direction d = new Direction(1); // 에러. 열거형의 생성자는 외부에서 호출 불가
     */
}
