package Chapter7_Object_Idea;

public class Modifier {
    public static void main(String[] args) {

    }
    /*
     * [자바의정석 - 기초편 ] ch7-17~20 제어자, static, final, abstract
     *
     * [ 제어자 (modifier) ]
     * - 클래스와 클래스의 멤버 (멤버 변수, 메서드) 에 부가적인 의미 부여
     *
     *  접근 제어자 :  public, protected, (default), private
     *  그 외      : static, final, abstract, native, transient, synchronized, volatile, strictfp
     *
     * - 하나의 대상에 여러 제어자를 같이 사용 가능 (접근 제어자는 1개만 !)
     *  public class ModifierTest {
     *      public static final int WIDTH = 200;
     *      public static void main (String[] args) {
     *          System.out.println("WIDTH = " + WIDTH);
     *      }
     *  }
     *
     *
     * [ static - 클래스, 공통적 ]
     *  멤버 변수 (static)
     *  - 모든 인스턴스에 공통적으로 사용되는 클래스 변수가 된다.
     *  - 클래스 변수는 인스턴스를 생성하지 않고도 사용 가능
     *  - 클래스가 메모리에 로드될 때 생성
     *
     *  메서드 (static)
     *  - 인스턴스를 생성하지 않고도 호출 가능한 static 메서드가 된다.
     *  - static 메서드 내에서는 인스턴스 멤버들을 직접 사용할 수 없다.
     *
     *  class StaticTest {
     *      static int width = 200;         // 클래스 변수 (static 변수)
     *      static int height = 120;        // 클래스 변수 (static 변수)
     *
     *      static {                        // 클래스 초기화 블럭
     *          // static 변수의 복잡한 초기화 수행
     *      }
     *
     *      static int max (int a, int b) { // 클래스 메서드 (static 메서드)
     *          return a > b ? a : b;       // 인스턴스 변수 및 인스턴스 메서드 사용 불가~
     *      }
     *  }
     *
     *
     * [ final - 마지막의, 변경될 수 없는 ]
     * 클래스 (final)
     * - 변경될 수 없는 클래스. 확장될 수 없는 클래스가 된다. (해당 클래스를 다른 클래스가 상속 받지 못함)
     * - 그래서 final 로 지정된 클래스는 다른 클래스의 조상이 될 수 없다.
     * 메서드 (final)
     * - 변경될 수 없는 메서드. final 로 지정된 메서드는 오버라이딩을 통해 재정의 될 수 없음
     * 멤버변수 (final)
     * 지역변수 (final)
     * - 변수 앞에 final 이 붙으면, 값을 변경할 수 없는 상수가 된다.
     *
     * final class FinalTest {              // 조상이 될 수 없는 클래스
     *      final int MAX_SIZE = 10;        // 값을 변경할 수 없는 멤버변수 (상수)
     *
     *      final void getMaxSize() {       // 오버라이딩될 수 없는 메서드 (변경불가)
     *          final int LV = MAX_SIZE;    // 값을 변경할 수 없는 지역변수 (상수)
     *          return MAX_SIZE;
     *      }
     * }
     *
     *
     * [ abstract - 추상의, 미완성의 ]
     * 클래스 (abstract)
     * - 클래스 내에 추상 메서드가 선언되어 있음을 의미
     * 메서드 (abstract)
     * - 선언부만 작성하고, 구현부는 작성하지 않은 추상 메서드임을 알린다.
     *
     * abstract class AbstractTest { // 추상클래스 (추상 메서드를 포함한 클래스)
     *      abstract void move();    // 추상메서드 (구현부가 없는 메서드 > 미완성 메서드 )
     * }
     *
     * - 추상 클래스는 인스턴스 생성 불가
     * - 추상 클래스를 상속 받아서 완전한 클래스는 만든 후에 객체 생성 가능 !
     *
     * */
}
