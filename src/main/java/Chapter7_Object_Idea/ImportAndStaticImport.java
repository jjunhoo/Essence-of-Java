package Chapter7_Object_Idea;

public class ImportAndStaticImport {
    public static void main(String[] args) {

    }
    /*
     * [자바의 정석 - 기초편] ch7-15, 16 import문, static import문
     *
     * [ import 문 ]
     * - 클래스를 사용할 때 패키지 이름 생략 가능
     * - 컴파일러에게 클래스가 속한 패키지를 알려줌
     * - java.lang 패키지의 클래스는 import 하지 않고도 사용 가능
     *   ( String, Object, System, Thread ... 등 - import java.lang.*; )
     *
     * 1. 기존
     *  class ImportTest {
     *      java.util.Date today = new java.util.Date();
     *  }
     *
     * 2. 생략
     *  import java.util.Date;
     *
     *  class ImportTest {
     *      Date today = new Date();
     *  }
     *
     *
     * [ import 문 선언 방법 ]
     * - import 문은 선언 방법
     *
     * 1. import 패키지명.클래스명;
     * 2. import 패키지명.*;
     *
     * - import 문은 패키지문과 클래스선언의 사이에 선언
     * package com.codechobo.bool;
     *
     * import java.text.SimpleDateFormat;
     * import java.util.*;
     *
     * ...
     *
     * - import 문은 컴파일 시에 처리되므로 프로그램의 성능에 영향없음
     *      => import java.util.*; (성능 문제 없음)
     *
     * - 이름이 같은 클래스가 속한 두 패키지를 import 할 때는 클래스앞에 패키지명을 붙여줘야 함
     *
     *
     * [ static import 문 ]
     * - static 멤버를 사용할 때 클래스 이름을 생략할 수 있게 해줌
     *
     *  import static java.lang.Integer.*;    // Integer 클래스의 모든 static 메서드
     *  import static java.lang.Math.random;  // Math.random() 만 괄호 안 붙임
     *  import static java.lang.System.out;   // System.out 을 out 만으로 참조 가능
     *
     *
     *  import static java.lang.System.out;
     *  import static java.lang.Math.*;
     *
     *  class Test {
     *      public static void main (String[] args) {
     *          // System.out.println(Math.random());
     *          out.println(random());
     *
     *          // System.out.println("Math.PI : " + Math.PI);
     *          out.println("Math.PI : " + PI);
     *      }
     *  }
     * */
}
