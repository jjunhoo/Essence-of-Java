package Chapter7_Object_Idea;

public class 인터페이스 {
    public static void main(String[] args) {

    }
    /* [자바의 정석 - 기초편] ch7-35~37 인터페이스의 선언, 상속, 구현
     *
     * [ 인터페이스 (interface) ]
     * - 추상 메서드의 집합 (핵심)
     * - 구현된 것이 전혀 없는 설계도. 껍데기 (모든 멤버가 public)
     *
     * [ 추상 클래스 ]
     * - 추상 메서드 / 지역 변수 / 생성자 등을 가질 수 있음
     *
     * [ 인터페이스 ]
     * - 추상 메서드 / 상수만 가질 수 있음
     * - 인터페이스 내 추상 메서드 앞에는 public / abstract 생략 가능 !
     * - 인터페이스 내 상수 앞에는 public / static / final 생략 가능 !
     *
     * interface 인터페이스 이름 {
     *      public static final 타입 상수 이름 = 값;
     *      public abstract 메서드 이름 (매개변수 목록);
     * }
     *
     * - 인터페이스의 조상은 인터페이스만 가능 (Object 가 최고 조상이 아님)
     * - 다중 상속이 가능 (추상 메서드는 충돌해도 문제 없음)
     *
     * interface Fightable extends Movable, Attackable { } // 다중 상속 (일반 클래스는 불가) >>> 중요 !!
     *
     * interface Movable {
     *      void move (int x, int y);
     * }
     *
     * interface Attackable {
     *      void attack (Unit u);
     * }
     *
     *
     * [ 인터페이스의 구현 ]
     * - 인터페이스에 정의된 추상 메서드를 완성하는 것
     *
     * class 클래스이름 implements 인터페이스이름 {     // 추상 클래스는 extends
     *      // 인터페이스에 정의된 추상메서드를 모두 구현해야 한다.
     * }
     *
     * - 일부만 구현하는 경우, 클래스 앞에 abstract 를 붙여야 함
     *
     * [ 인터페이스란 ? ]
     * - 추상 메서드의 집합 (핵심!)
     * - 상수 / static 메서드 / default 메서드 (JDK 1.8 추가)
     *
     * [ 인터페이스의 구현이란 ? ]
     * - 인터페이스의 추상 메서드 몸통 {} 만들기 (미완성 설계도 완성)
     *
     * [ 추상 클래스와 인터페이스의 공통점은 ? ]
     * - 추상 메서드를 가지고 있음 (미완성 설계도)
     *
     * [ 추상 클래스와 인터페이스의 차이점은 ? ]
     * - 인터페이스는 iv (지역 변수) / 생성자 / 인스턴스 메서드를 가질 수 없다 !
     */
}
