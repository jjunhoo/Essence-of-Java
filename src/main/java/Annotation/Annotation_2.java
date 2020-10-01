package Annotation;

import java.util.ArrayList;

// @Override
class Parent {
    void parentMethod() { }
}

class Child extends Parent {
    @Override       // 어노테이션 사용 시 메소드명을 잘못 기재했을 경우, 컴파일 단계에서 확인 가능
    void parentMethod() {}
}

// @Deprecated
class MyDeprecated {
    @Deprecated
    void deprecatedMethod() {}
}

// @FunctionalInterface
// 함수형 인터페이스는 하나의 추상 메서드만 추가 가능
@FunctionalInterface
interface MyFuncInterface {
    void testMethod();
    // void testCheck();
}

// @SuppressWarnings
class MySuppress {
    @SuppressWarnings("unchecked")
    void mySuppressMethod() {
        ArrayList list = new ArrayList();
        list.add(1);    // 해당 라인의 제네릭 타입 관련 경고 발생을 억재
    }
}


public class Annotation_2 {
    public static void main(String[] args) {
        MyDeprecated myDeprecated = new MyDeprecated();
        myDeprecated.deprecatedMethod();
    }
    /*
        [자바의 정석 - 기초편] ch12-23~26 표준애너테이션

        1. @Override
        - 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 함
          (오버라이딩할 때 메소드 이름을 잘못 적는 실수가 많음 => 컴파일 단계에서 확인 가능)

          class Parent {
            void parentMethod() { }
          }

          [ 사용 전 ]
          class Child extends Parent {
            void parentmethod() { }     // 오버라이딩 하려 했으나, 실수로 메소드명을 잘못 적음
          }

          [ 사용 후 ]
          class Child extends Parent {
            @Override
            void parentMethod() { }
          }

        2. @Deprecated
        - 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙임
        - @Deprecated 의 사용 예, Date 클래스의 getDate()
        - 해당 어노테이션이 붙은 코드를 컴파일하면 경고 메시지 출력

            @Deprecated
            public int getDate() {
                return normalize().getDayOfMonth();
            }

        3. @FunctionalInterface
        - 함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성했는지 체크
        - 함수형 인터페이스에는 하나의 추상메서드만 가져야한다는 제약이 있음

            @FunctionalInterface
            public interface Runnable {
                public abstract void run();     // 추상메서드
            }

        4. @SuppressWarnings
        - 컴파일러의 경고 메시지가 나타나지 않게 억제
          (개발자가 해당 경고를 확인했다는 의미로도 통용)

          @SuppressWarnings
            ArrayList list = new ArrayList();  // 제네릭 타입을 지정하지 않았음
            list.add(obj);                     // 여기서 경고 발생

        - 괄호 안에 억제하고자 하는 경고의 종류를 문자열로 지정
        - 둘 이상의 경고를 동시에 억제하려면 아래와 같이 사용
            @SuppressWarnings("deprecation", "unchecked", "varargs")

        - '-Xlint' 옵션으로 컴파일하면, 경고 메시지를 확인할 수 있다.

     */
}
