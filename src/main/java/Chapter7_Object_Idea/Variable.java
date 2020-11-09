package Chapter7_Object_Idea;

public class Variable {
    public static void main(String[] args) {
        InitTest initTest = new InitTest();
        System.out.println("iv x : " + initTest.x); // 0 으로 자동 초기화 (인스턴스 변수)
    }
    static class InitTest {
        int x;      // 인스턴스 변수
        int y = x;  // 인스턴스 변수

        static void method() {
            int i;         // 지역 변수
            // int j = i;  // 에러. 지역 변수를 초기화 하지 않고, 사용 불가
        }
    }
    /*
     * [자바의 정석 - 기초편] ch6-38~41 변수의초기화, 멤버변수의 초기화
     *
     * 변수의 초기화
     *  - 지역 변수(lv)는 수동 초기화 해야함 (사용 전 반드시)
     *  - 멤버 변수(iv, cv)는 자동 초기화 된다.
     *
     *
     * 멤버 변수의 초기화
     * 1. 명시적 초기화 (=)
     *      class Car {
     *          int door = 4;               // 기본형 (primitive type) 변수의 초기화
     *          Engine e = new Engine();    // 참조형 (reference type) 변수의 초기화
     *      }
     *
     * 2. 초기화 블럭 - { } 또는 static { }
     * - 인스턴스 초기화 블럭 : { }
     *      - 인스턴스 변수 (iv) 초기화에 사용
     * - 클래스 초기화 블럭 : static { }
     *      - 클래스 변수 (cv) 초기화에 사용
     *
     * 3. 생성자 (인스턴스 변수 iv - 초기화)
     *      Car(String color, String gearType, int door) {  // 매개변수가 있는 생성자
     *          this.color = color;
     *          this.gearType = gearType;
     *          this.door = door;
     *      }
     *
     *
     * 즉, 클래스 변수 (cv), 인스턴스 변수 (iv) 초기화는 3가지 방법이 있음
     * 1. 자동 초기화 (0 또는 null 로 초기화)
     * 2. 간단 초기화 (=)
     * 3. 복잡 초기화 ({ } 또는 static { })
     *      class StaticBlockTest {
     *          static int[] arr = new int[10]; // 명시적 초기화
     *
     *          static { // 클래스 초기화 블럭 - 배열 arr 을 난수로 채움 (클래스 변수 - cv 복잡 초기화)
     *              for (int i=0; i<arr.length; i++) {
     *                  arr[i] = (int)(Math.random() * 10) + 1;
     *              }
 *              }
     *      }
     *
     *
     * 클래스 변수 초기화 시점 : 클래스가 처음 로딩될 때 단 한번 (메모리에 할당될 때)
     * 인스턴스 변수 초기화 시점 : 인스턴스가 생성될 때 마다
     *
     * class InitTest {
     *      static int cv = 1;  // 명시적 초기화 (클래스 변수)
     *      int iv = 1;         // 명시적 초기화 (인스턴스 변수)
     *
     *      static { cv = 2; }  // 클래스 변수 초기화 블럭 (복잡 초기화)
     *      { iv = 2; }         // 인스턴스 변수 초기화 블럭 (복잡 초기화)
     *
     *      InitTest() {        // 생성자 초기화 ( InitTest it = new InitTest(); )
     *          iv = 3;
     *      }
     * }
     */
}
