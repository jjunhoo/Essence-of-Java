package Chapter7_Object_Idea;

public class instanceof_연산자 {
    public static void main(String[] args) {

    }
    /* [자바의 정석 - 기초편] ch7-26 instanceof 연산자
     *
     * - 참조변수의 형변환 가능 여부 확인에 사용 (가능하면 true 반환)
     * - 형변환 전에 반드시 instanceof 로 확인해야 함
     *
     * void doWork (Car c) {                // new Car(), new FireEngine 모두 가능
     *   if (c instanceof FireEngine) {     // 1. 형변환이 가능한지 확인 (방어 코드가 없다면, 런타임 시 cast 에러 발생 가능)
     *      FireEngine fe = (FireEngine) c; // 2. 형변환
     *      fe.water();
     *      ...
     *   }
     * }
     *
     * FireEngine fe = new FireEngine();
     * fe instanceof Object;        // true - 최고 조상 클래스
     * fe instanceof Car;           // true - 조상 클래스
     * fe instanceof FireEngine;    // true - 자신 클래스
     *
     */
}
