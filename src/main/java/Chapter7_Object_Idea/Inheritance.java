package Chapter7_Object_Idea;

public class Inheritance {
    public static void main(String[] args) {

    }
    /*
     * [자바의 정석 - 기초편] ch7-1,2 상속
     *
     * - 기존의 클래스로 새로운 클래스를 작성하는 것 (코드의 재사용)
     * - 두 클래스를 부모와 자식으로 관계를 맺어주는 것
     *
     *      class 자식클래스 extends 부모클래스 {
     *          // ...
     *      }
     *
     *      class Parent { }
     *      class Child extends Parent { }
     *
     * - 자손은 조상의 모든 멤버를 상속 받는다 (부모의 부모 클래스까지 - 생성자, 초기화 블럭 제외)
     * - 자손의 멤버 개수는 조상 보다 적을 수 없다 (같거나 많다)
     * - 자손의 변경은 조상에 영향을 미치지 않음
     *      class Parent {
     *          int age;    // 멤버 1개
     *      }
     *
     *      class Child extends Parent {
     *          void play() {   // 자신 멤버 1개 (play()) , 상속 받은 멤버 1개 (age)
     *
     *          }
     *      }
     */
}
