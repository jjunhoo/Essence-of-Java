package Object_Idea;

public class Composite {
    public static void main(String[] args) {

    }
    /*
     * [자바의 정석 - 기초편] ch7-3,4 클래스 간의 관계, 상속과 포함
     *
     * 포함 (Composite)이란 ?
     * - 클래스의 멤버로 참조변수를 선언하는 것
     * - 작은 단위의 클래스를 만들고, 이들을 조합해서 클래스를 만든다.
     *
     *      class Circle {
     *          Point c = new Point();
     *          int r;
     *      }
     *
     *      class Point {
     *          int x;
     *          int y;
     *      }
     *
     *      c.c.x;
     *      c.c.y;
     *
     *
     * [ 클래스 간의 관계 결정하기 ]
     * - 상속관계 : '~은 ~이다 (is-a)'
     * - 포함관계 : '~은 ~을 가지고 있다 (has-a)'
     *
     * * 둘중 더 자연스러운 것으로 결정
     * 원은 점이다 - Circle is a Point
     * 원은 점을 가지고 있다 - Circle has a Point
     *
     * class Circle {
     *      Point c = new Point();
     *      int r;
     * }
     *
     * class Circle extends Point {
     *      int r;
     * }
     *
     *
     * */
}
