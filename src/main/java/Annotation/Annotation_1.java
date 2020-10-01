package Annotation;

public class Annotation_1 {
    public static void main(String[] args) {

    }
    /*
        [자바의 정석 - 기초편] ch12-23,24 애너테이션

        [ 어노테이션이란 ? ]
        - 주석처럼 프로그래밍 언어에 영향을 미치지 않으며, 유용한 정보를 제공

        [ 어노테이션의 사용 예 ]
        @Test   // 해당 메서드가 테스트 대상임을 테스트 프로그램에게 알림
        public void method() {
            ...
        }

        [ 표준 어노테이션 ]
        @Override
        컴파일러에게 오버라이딩 하는 메서드라는 것을 알림

        @Deprecated
        앞으로 사용하지 않을 것을 권장하는 대상에 붙임

        @SuppressWarnings
        컴파일러의 특정 경고 메세지가 나타나지 않도록 해줌

        @SafeVarargs
        제네릭 타입의 가변인자에 사용 (JDK 1.7)

        @FunctionalInterface
        함수형 인터페이스임을 알림

        @Native
        native 메소드에서 참조되는 상수 앞에 붙임 (JDK 1.8)


        =>  하단 * 표시된 어노테이션들은 어노테이션의 메타 어노테이션

        @Target *
        어노테이션이 적용 가능한 대상을 지정하는데 사용

        @Documented *
        어노테이션 정보가 javadoc 으로 작성된 문서에 포함되게 한다

        @Inherited *
        어노테이션 자손 클래스에 상속되도록 한다

        @Retention *
        어노테이션이 유지되는 범위를 지정하는데 사용

        @Repeatable *
        어노테이션을 반복해서 적용할 수 있게 함 (JDK 1.8)
     */
}
