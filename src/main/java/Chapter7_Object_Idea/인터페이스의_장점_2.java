package Chapter7_Object_Idea;

public class 인터페이스의_장점_2 {
    public static void main(String[] args) {

    }
    /* [자바의 정석 - 기초편] ch7-39 인터페이스의 장점2
     *
     * - 개발 시간을 단축할 수 있다.
     *      => 인터페이스를 호출하기 때문에 일단, 인터페이스 개발부터 시작하면 됨
     * - 변경에 유리한 유연한 설계 가능
     * - 표준화 가능
     *      => 예 : JDBC (Oracle, MySQL, MS-SQL 등 인터페이스를 사용)
     * - 서로 관계없는 클래스들을 관계 맺어줄 수 있음
     *      => SCV / Tank / Dropship => extends GroundUnit implements Repairable / extends AirUnit implements Repairable
     *          => Repairable 을 구현한 기계 유닛만 관계 맺을 수 있음
     *          => GroundUnit / AirUnit
     *      => 사람 유닛인 Marine 은 제외
     *
     *
     */
}
