package Chapter7_Object_Idea;

class MyParent {
    private   int prv;  // 같은 클래스
              int dft;  // 같은 패키지 (default)
    protected int prt;  // 같은 패키지 + 자손 (다른 패키지)
    public    int pub;  // 접근 제한 없음

    public void printMembers() {
        System.out.println(prv);    // OK
        System.out.println(dft);    // OK
        System.out.println(prt);    // OK
        System.out.println(pub);    // OK
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        MyParent myParent = new MyParent();
        // System.out.println(myParent.prv);    // 에러 (같은 클래스 내에서만 사용 가능 > MyParent 만 사용 가능)
        System.out.println(myParent.dft);       // OK
        System.out.println(myParent.prt);       // OK
        System.out.println(myParent.pub);       // OK
    }
    /*
     * [자바의 정석 - 기초편] ch7-21 접근제어자
     *
     * [ 접근 제어자 (access modifier) ]
     * 1. private   - 같은 클래스 내에서만 접근 가능
     * 2. (default) - 같은 패키지 내에서만 접근 가능
     * 3. protected - 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근 가능
     * 4. public    - 접근 제한 없음
     *
     * - 클래스 앞에는 public / (default) 2가지만 선언 가능
     * - 변수 앞에는 public / (default) / protected / private 4가지 모두 선언 가능
     *
     * [ 접근 제어가 넓은 순서 ]
     * public > protected > (default) > private
     *
     *
     *
     *
     *
     * */
}
