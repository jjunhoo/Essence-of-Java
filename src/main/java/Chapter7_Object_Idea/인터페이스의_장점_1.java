package Chapter7_Object_Idea;

// 강결합 케이스 (A => B) - 의존 (추후 코드 변경 시 양쪽 모두 수정 필요)
/*
class A {
    public void method1(B b) {
        b.method1();
    }
}
*/
/*
class B {
    public void method1() {
        System.out.println("B 클래스의 메서드");
    }
}
*/

// 호출 클래스
class A {
    // 매개변수로 interface 를 구현한 클래스만 받음
    public void method1(I i) {
        i.method1();
    }
}
// 인터페이스 - 껍데기
interface I {
    void method1();
}

// 메소드 구현 클래스 - 몸통
class B implements I {
    public void method1() {
        System.out.println("new B class method call");
    }
}

// 메소드 구현 클래스 - 몸통 (추가된 클래스 > 호출 클래스 수정 필요 없음)
class C implements I {
    public void method1() {
        System.out.println("new C class method call");
    }
}

public class 인터페이스의_장점_1 {
    public static void main(String[] args) {
        A a = new A();
        a.method1(new C());
    }
    /* [자바의 정석 - 기초편] ch7-39 인터페이스의장점1
     *
     * [ 인터페이스의 장점 ]
     * - 두 대상 (객체) 간의 '연결, 대화, 소통' 을 돕는 '중간 역할'
     * - 선언(설계)와 구현을 분리시킬 수 있게 한다.
     *
     * // AS-IS (강결합)
     * class B {
     *      public void method() {
     *          System.out.println("call");
     *      }
     * }
     *
     * // TO-BE (약결합)
     * // 제공 인터페이스 (껍데기)
     * interface I {
     *      // 추상 클래스
     *      public void method();
     * }
     * // 인터페이스 내부 메소드 구현 클래스 (알맹이)
     * class B implements I {
     *      public void method("call");
     * }
     */
}
