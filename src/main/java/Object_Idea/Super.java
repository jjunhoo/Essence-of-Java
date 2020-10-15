package Object_Idea;

class Parent {
    // super
    int x = 10;
}
class Child extends Parent {
    // this
    int x = 20;

    void method() {
        System.out.println("x=" + x);   // 가까운 쪽 (this == Child)
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}
public class Super {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }
    /*
     * [자바의 정석 - 기초편] ch7-10,11 참조변수 super, 생성자 super()
     *
     * [ 참조변수 - super ]
     * - 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자) 내에만 존재
     * - 조상의 멤버를 자신의 멤버와 구별할 때 사용 (this 는 지역변수와 인스턴스변수를 구별할 때 사용)
     *
     *
     * [ super() - 조상의 생성자 ]
     * - 조상의 생성자를 호출할 때 사용 (생성자, 초기화 블럭은 상속되지 않음)
     * - 조상의 멤버는 조상의 생성자를 호출해서 초기화
     *
     * class Point {
     *      int x,y;
     *
     *      Point(int x, int y) {
     *          this.x = x;
     *          this.y = y;
     *      }
     * }
     *
     * class Point3D extends Point {
     *      int z;
     *
     *      Point3D(int x, int y, int z) {
     *          super(x, y);    // 조상클래스의 생성자 Point(int x, int y)를 호출
     *          this.z = z;     // 자신의 멤버를 초기화
     *
     *          // this.x = x;  // 이렇게 초기화해도 문제는 안 되지만, 명시적으로 super() 를 사용하여 초기화
     *          // this.y = y;
     *      }
     * }
     *
     *
     * - 생성자의 첫줄에 반드시 생성자를 호출해야 한다. 그렇지 않으면 컴파일러가 생성자의 첫줄에 super() 삽입
     * class Point {    // extends Object
     *      int x;
     *      int y;
     *
     *      Point() {
     *          this(0, 0);     // OK
     *      }
     *      Point(int x, int y) {
     *          // super();        // 컴파일러가 Object 클래스의 생성자를 호출하는 코드 자동 삽입
     *          this.x = x;
     *          this.y = y;
     *      }
     * }
     * */
}
