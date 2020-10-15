package Object_Idea;

class Point {
    int x;
    int y;
    String getLocation() {
        return "x : " + x + " , y : " + y;
    }
}
class Point3d extends Point {
    int z;
    // Overriding => 명시적으로 @Override 어노테이션을 사용하는 방법도 있음
    String getLocation() {
        return "x : " + x + " , y : " + y + ", z : " + z;
    }

    public String toString() {
        return "Override toString() ! - Not Object Class toString()";
    }
}
public class Overring {
    public static void main(String[] args) {
        Point3d point3d = new Point3d();
        System.out.println("[point3d] : " + point3d.getLocation());
        System.out.println("[point3d toString] : " + point3d);
    }
    /*
     * [자바의 정석 - 기초편] ch7-7~9 오버라이딩
     *
     * [ 오버라이딩 - Overriding ]
     * - 상속 받은 조상의 메서드를 자신에 맞게 변경하는 것 (선언부는 변경 불가, 구현부만 변경 가능)
     *
     *
     * class Point {
     *      int x;
     *      int y;
     *
     *      String getLocation() {
     *          return "x : " + x + ", y : " + y;
     *      }
     * }
     *
     * class Point3D extends Point {
     *      int z;
     *
     *      String getLocation() {
     *          return "x : " + x + ", y : " + y + ", z : " + z;
     *
     *      }
     * }
     *
     * [ 오버라이딩 조건 ]
     * 1. 선언부가 조상 클래스의 메서드와 일치해야 함
     * 2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
     * 3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
     *
     * class Parent {
     *      void parentMethod() throws IOException, SQLException {
     *          ...
     *      }
     * }
     *
     * class Child extends Parent {
     *      void parentMethod() throws IOException {    // 조상 클래스의 메서드보다 많이 선언 불가
     *          ...
     *      }
     * }
     *
     *
     * [ 오버로딩 vs 오버라이딩 ]
     * - 오버로딩 (overloading)  : 기존에 없는 새로운 메서드를 정의 (new)
     * - 오버라이딩 (overriding)  : 상속 받은 메서드의 내용을 변경 (change, modify)
     *
     * class Parent {
     *      void parentMethod() {}
     * }
     *
     * class Child extends Parent {
     *      void parentMethod() {}          // 오버라이딩
     *      void parentMethod(int i) {}     // 오버로딩
     *
     *      void childMethod() {}           // 메서드 정의
     *      void childMethod(int i) {}      // 오버로딩
     *      void childMethod() {}           // 메소드 중복 정의
     * }
     *
     *
     * */
}
