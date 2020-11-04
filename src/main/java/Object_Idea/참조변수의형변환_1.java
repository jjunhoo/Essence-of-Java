package Object_Idea;

public class 참조변수의형변환_1 {
    public static void main(String[] args) {

    }
    /*
     * [자바의 정석 - 기초편] ch7-24,25 참조변수의형변환(1)
     *
     * - 사용할 수 있는 멤버의 갯수를 조절하는 것
     * - 조상 / 자손 관계의 참조변수는 서로 형변환 가능
     *
     * FireEngine f = new FireEngine();
     *
     * Car c = (Car) f;                 // OK. 조상인 Car 타입으로 형변환 (생략 가능)
     * FireEngine f2 = (FireEngine) c;  // OK. 자손인 FireEngine 타입으로 형변환 (생략 불가)
     * Ambulance a = (Ambulance) f;     // 에러. 상속관계가 아닌 클래스 간의 형변환 불가
     *
     *
     */
}
