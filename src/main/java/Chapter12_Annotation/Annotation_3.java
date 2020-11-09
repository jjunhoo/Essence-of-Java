package Chapter12_Annotation;

public class Annotation_3 {
    public static void main(String[] args) {

    }
    /*
        [자바의 정석 - 기초편] ch12-29~33 메타애너테이션

        1. @Target
        - 어노테이션을 정의할 때, 적용 대상 지정에 사용

        => @SuppressWarnings 어노테이션 정의 확인
        @Target({ TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE })
        @Retention(RetentionPolicy.SOURCE)
        public @interface SuppressWarnings {
            String[] value();
        }

        => Target 종류
        ANNOTATION_TYPE     - 어노테이션
        CONSTRUCTOR         - 생성자
        FIELD               - 필드 (멤버변수, enum 상수)
        LOCAL_VARIABLE      - 지역 변수
        METHOD              - 메소드
        PACKAGE             - 패키지
        PARAMETER           - 매개변수
        TYPE                - 타입 (클래스, 인터페이스, enum)
        TYPE_PARAMETER      - 타입 매개변수 (JDK 1.8)
        TYPE_USE            - 타입이 사용되는 모든 곳 (JDK 1.8)


        2. @Retention
        - 어노테이션이 유지되는 기간을 지정하는데 사용

        => 종류
            - SOURCE  : 소스 파일에만 존재. 클래스 파일에는 존재하지 않음
            - CLASS   : 클래스 파일에 존재. 실행 시에 사용 불가 (default)
            - RUNTIME : 클래스 파일에 존재. 실행 시 사용 가능

        - 컴파일러에 의해 사용되는 어노테이션 유지 정책은 SOURCE 이다.
            => 컴파일러를 위한 용도로 런타임 시에는 필요 없기에 유지 정책이 SOURCE

            @Target(ElementType.METHOD)
            @Retention(RetentionPolicy.SOURCE)
            public @interface Override { }

        - 실행시에 사용 가능한 어노테이션의 정책은 RUNTIME
            @Documented
            @Retention(RetentionPolicy.RUNTIME)
            @Target(ElementType.TYPE)
            public @interface FunctionalInterface { }

        3. @Documented, @Inherited
        - javadoc 으로 작성한 문서에 포함시키려면 @Documented 을 붙임
        - 어노테이션을 자손 클래스에 상속하고자 할 때, @Inherited 붙임

            @Inherited          // @SuperAnnotation 이 자손까지 영향이 미침
            @interface SuperAnnotation { }

            @SuperAnnotation
            class Parent { }    // 부모 클래스

            class Child extends Parent { } // Child 에는 붙은 어노테이션이 없지만, @SuperAnnotation 어노테이션이 붙은 것으로 인식

        4. @Repeatable
        - 반복해서 붙일 수 있는 어노테이션을 정의할 때 사용

            @Repeatable(ToDos.class)    // ToDo 어노테이션을 여러 번 반복해서 사용 가능
            @interface ToDo {
                String value();
            }

        - @Repeatable 이 붙은 어노테이션은 반복해서 붙일 수 있음
            @ToDo("delete test codes.")
            @ToDo("override inherited methods")
            class MyClass {
                ...
            }

        - @Repeatable 인 @ToDo 를 하나로 묶을 컨테이너 어노테이션도 정의해야 함
        @interface ToDos {  // 여러 개의 ToDo 어노테이션을 담을 컨테이너 어노테이션 ToDos
            ToDo[] value(); // ToDo 어노테이션 배열 타입의 요소 선언. 이름이 반드시 value 여야 함
        }
     */
}
