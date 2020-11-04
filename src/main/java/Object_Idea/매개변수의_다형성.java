package Object_Idea;

public class 매개변수의_다형성 {
    public static void main(String[] args) {

    }
    /* [자바의 정석 - 기초편] ch7-27,28 매개변수다형성
     *
     * - 참조형 매개변수는 메서드 호출 시 '자신과 같은 타입 또는 자손 타입'의 인스턴스를 넘겨줄 수 있다.
     *
     * class Product {
     *      int price;      // 제품가격
     *      int bonusPoint; // 보너스점수
     * }
     * class Tv extends Product {}
     * class Computer extends Product {}
     * class Audio extends Product {}
     *
     * class Buyer {
     *      int money = 1000;   // 소유금액
     *      int bonusPoint = 0; // 보너스점수
     * }
     *
     * // 매개변수의 다형성을 통해 Product 하위 클래스를 모두 파라미터로 받기 가능
     * void buy (Product p) {
     *      money -= p.price;
     *      bonusPoint += p.bonusPoint;
     * }
     */
}
