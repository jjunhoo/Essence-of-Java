package Object_Idea;

public class Polymorphism {
    public static void main(String[] args) {

    }
    /* [자바의 정석 - 기초편] ch7-23 다형성
     *
     * - 조상 타입 참조 변수로 자손 타입 객체를 다루는 것
     * - 여러 가지 형태를 가질 수 있는 능력
     *
     * Tv t = new SmartTv();    // 타입 불일치 (Tv - 조상 / SmartTv - 자손)
     *
     *
     * - 객체와 참조변수의 타입이 일치할 때와 일치하지 않을 때의 차이 ?
     * SmartTv s = new SmartTv();  // 참조 변수와 인스턴스의 타입이 일치 (조상 + 자손 사용 가능)
     * Tv      t = new SmartTv();  // 조상 타입 참조변수로 자손 타입 인스턴스 참조 (조상만 사용 가능)
     *
     *
     * - 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
     * Tv      t = new SmartTv();   // OK.  허용
     * SmartTv s = new Tv();        // 에러. 허용 안 됨 (자손 객체는 조상의 멤버보다 같거나 많기 때문)
     *
     *
     *
     *
     */
}
