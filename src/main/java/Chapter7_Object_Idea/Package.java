package Chapter7_Object_Idea;

public class Package {
    public static void main(String[] args) {

    }
    /*
     * [자바의 정석 - 기초편] ch7-12~14 패키지, 클래스 패스
     *
     * [ 패키지 (package)]
     * - 서로 관련된 클래스의 묶음
     * - 클래스는 클래스 파일 (*.class) , 패키지는 폴더. 하위 패키지는 하위 폴더
     * - 클래스의 실제 이름(full name)은 패키지를 포함 (java.lang.String)
     *   (rt.jar 는 클래스들을 압축한 파일 (JDK 설치 경로 /jre/lib 에 위치)
     *      - rt : runtime (java 9 부터 모듈 개념으로 인하여 다른 방식으로 제공)
     *
     * [ 패키지 선언 ]
     * - 패키지는 소스 파일의 첫 번째 문장으로 단 한번 선언
     * - 같은 소스 파일의 클래스들은 모두 같은 패키지에 속하게 된다.
     * - 패키지 선언이 없으면 이름 없는(unnamed > default package) 패키지에 속하게 된다.
     *
     * package com.codechobo.book;
     *
     * public class PackageTest {
     *      public static void main (String[] args) {
     *          System.out.println("Hello world");
     *      }
     * }
     * class PackageTest2 { }
     *
     * [ 클래스 패스 (classpath) ]
     * - 클래스 파일(*.class)의 위치를 알려주는 경로 (path)
     * - 환경변수 classpath 로 관리하며, 경로간의 구분자는 ';' 를 사용
     *   (classpath (환경변수) 에 패키지의 루트를 등록해줘야 함)
     *   - Windows > 시스템 변수 > 패키지 루트 추가
     *   - 클래스 패스를 설정하지 않을 경우, 매번 패키지 루트를 입력해야 하는 불편함 발생
     *
     * */
}
