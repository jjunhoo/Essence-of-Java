package Chapter12_Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

enum TestType { FIRST, FINAL }

@interface DateTime {
    String yymmdd();
    String hhmmss();    // 추상 메서드
}

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용 가능 하도록 지정
@interface MyAnnotation {
    int         count()             default 1;
    String      testedBy();
    String[]    testTools()         default "JUnit";
    TestType    testType()          default TestType.FIRST;
    DateTime    testDate();
}

@Deprecated
@SuppressWarnings("1111")   // 유효하지 않은 어노테이션은 무시 됨
@MyAnnotation(testedBy = "aaa", testDate = @DateTime(yymmdd="201001", hhmmss="235959"))
public class Annotation_4 {
    public static void main(String[] args) {
        // Annotation_4 의 Class 객체를 얻음
        Class<Annotation_4> cls = Annotation_4.class;

        MyAnnotation annotation = cls.getAnnotation(MyAnnotation.class);
        System.out.println("[annotation > testedBy] : " + annotation.testedBy());
        System.out.println("[annotation > testDate > yymmdd] : " + annotation.testDate().yymmdd());
        System.out.println("[annotation > testDate > hhmmss] : " + annotation.testDate().hhmmss());

        for (String str : annotation.testTools()) {
            System.out.println("[annotation.testTools] : " + str);
        }
        System.out.println();

        // Annotation_4 의 모든 어노테이션을 가져옴
        Annotation[] annotations = cls.getAnnotations();

        for (Annotation anno : annotations) {
            // @SuppressWarnings 정보가 나오지 않는 이유는 잘못된 어노테이션이기 때문 (1111 이라는 경고는 없음)
            System.out.println("[annotation] : " + anno.toString());
        }
    }
    /*
        [자바의 정석 - 기초편] ch12-34~37 애너테이션 타입 정의하기, 애너테이션의 요소

        [ 어노테이션 타입 정의하기 ]
        - 어노테이션을 직접 만들어 사용 가능
            @interface 어노테이션이름 {
                타입 요소 이름();     // 어노테이션의 요소를 선언
                ...
            }

            예)
            @interface DateTime {
                String yymmdd();
                String hhmmss();    // 추상 메서드
            }

        - 어노테이션의 메서드는 추상 메소드이며, 어노테이션을 적용할 때 지정 (순서 X)
            @interface TestInfo {
                int         count();
                String      testedBy();
                String[]    testTools(); // 배열
                TestType    testType();  // enum TestType { FIRST, FINAL }
                DateTime    testDate();  // 자신이 아닌 다른 어노테이션(@DateTime)을 포함할 수 있음
            }

            [ 사용법 ]
            @TestInfo (
                count = 3,
                testedBy = "Kim",
                testTools = {"JUnit", "AutoTester"},
                TestType = TestType.FIRST,
                testDate = @DateTime(yymmdd="201001", hhmmss="235959")
            )
            public class NewClass { ... }

        - 적용 시 값을 지정하지 않으면, 사용될 수 있는 기본값 지정 가능 (null 제외)
            => 추상 메소드 구현 시 해당 값을 원래는 적어줘야하지만, default 값이 있는 경우에는 생략 가능

            @interface TestInfo {
                int count() default 1; // 기본값을 1로 지정
            }

            @TestInfo   // == @TestInfo(count = 1)
            public class NewClass { ... }

        - 요소가 하나이고, 이름이 'value' 일 경우, 요소의 이름 생략 가능
            @interface TestInfo {
                String value();
            }

            @TestInfo("passed")     // @TestInfo(value = "passed") 와 동일
            public class NewClass { ... }

        - 요소의 타입이 배열인 경우, 괄호를 사용해야 함
            @interface TestInfo {
                String[] testTools();
            }

            @TestInfo(testTools = {"JUnit", "AutoTester"})
            @TestInfo(testTools = "JUnit")  // 값이 하나일 때는 괄호 생략 가능
            @TestInfo(testTools = {}})      // 값이 없을 때는 괄호 반드시 필요


        [ 모든 어노테이션의 조상 ]
        - Annotation 은 모든 어노테이션의 조상이지만 상속은 불가
            @interface TestInfo extends Annotation {    // 에러. 허용되지 않는 표현 (Annotation 상속 X)
                int     count();
                String  testedBy();
            }

        - Annotation 은 인터페이스임
            package java.lang.annotation;

            public interface Annotation {       // Annotation 자신은 인터페이스
                // 컴파일러가 하단 추상 메서드들을 컴파일 단계에서 구현
                boolean equals (Object obj);
                int hashCode();
                String toString();

                Class<? extends Annotation> annotationType();   // 어노테이션 타입 반환
            }


        [ 마커 어노테이션 - Marker Annotation ]
        - 요소가 하나도 정의되지 않은 어노테이션

        @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Override { }      // 마커 어노테이션. 정의된 요소가 하나도 없음 (대괄호 안의 요소)

        @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Test { }          // 마커 어노테이션. 정의된 요소가 하나도 없음 (대괄호 안의 요소)

        => 사용법
        @Test                   // 단순히 어노테이션만 기재하면 됨
        public void method() {
            ...
        }

        @Deprecated             // 단순히 어노테이션만 기재하면 됨
        public int getDate() {
            return normalize().getDayOfMonth();
        }


        [ 어노테이션 요소의 규칙 ]
        - 어노테이션의 요소를 선언할 떄, 아래 규칙을 반드시 지켜야 함
            - 요소의 타입은 기본형, String, Enum, 어노테이션, Class 만 허용
            - 괄호 안에 매개변수는 선언 불가
            - 예외 선언 불가
            - 요소를 타입 매개변수로 정의 불가

        - 잘못된 코드
            @interface AnnotationTest {
                int id = 100;                       // OK. 상수
                String major(int i, int j);         // 파라미터 사용 불가
                String minor() throws Exception;    // 예외 사용 불가
                ArrayList<T> list();                // 타입 변수 사용 불가
            }
     */
}
