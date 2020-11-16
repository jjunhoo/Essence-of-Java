package Chapter7_Object_Idea;

public class 디폴트메서드_static메서드 {
    public static void main(String[] args) {

    }
    /* [자바의 정석 - 기초편] 7-40,41 디폴트 메서드와 static메서드
     *
     * [ default 메서드 / static 메서드 ]
     * - 인터페이스에 default 메서드 / static 메서드 추가 가능 (JDK 1.8)
     * - 인터페이스에 새로운 메서드 (추상 메서드) 추가가 어려움
     *      => 인터페이스에 새로운 메서드 추가 시 기존에 해당 인터페이스를 사용하는 클래스들이 모두 추가된 메서드를 구현해야함
     * - default 메서드는 인스턴스 메서드 (인터페이스 원칙 위반)
     *      interface MyInterface {
     *          void method();
     *          default void newMethod() {}   // 인스턴스 메서드
     *      }
     * - default 메서드가 기존의 메서드와 충돌할 떄 해결책 !!! (중요)
     *  1. 여러 인터페이스의 default 메서드 간의 충돌
     *    - 인터페이스를 구현한 클래스에서 default 메서드를 Overriding 해야 함
     *  2. default 메서드와 조상 클래스와 메서드 간의 충돌
     *    - 조상 클래스의 메서드가 상속되고, default 메서드는 무시됨
     *          => Overriding 하면 모든게 해결 !
     *
     */
}
