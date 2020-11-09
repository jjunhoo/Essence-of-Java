package Chapter7_Object_Idea;

public class 여러_종류의_객체를_배열로_다루기 {
    public static void main(String[] args) {

    }
    /* [자바의 정석 - 기초편] ch7-29,30 여러 종류의 객체를 배열로 다루기
     *
     * - 조상 타입의 배열에 자손들의 객체를 담을 수 있다.
     *
     * [ AS-IS ]
     * Product p1 = new Tv();
     * Product p1 = new Computer();
     * Product p1 = new Audio();
     *
     * [ TO-BE ] - 조상 타입 (Product) 배열에 자손 (Tv, Computer, Audio) 객체 저장
     * Product p[] = new Product[3];
     * p[0] = new Tv();
     * p[1] = new Computer();
     * p[2] = new Audio();
     *
     * [ 예제 ]
     * class Buyer {
     *      int money = 1000;
     *      int nonusPoint = 0;
     *
     *      Product[] cart = new Product[10];
     *
     *      int i = 0;
     *
     *      void buy(Product p) {
     *          if (money < p.price) {
     *              System.out.println("잔액부족");
     *              return;
     *          }
     *          money -= p.price;
     *          bonusPoint += p.bonusPoint;
     *          // Product 조상 타입의 객체 배열로 자손 타입 객체 저장
     *          cart[i++] = p;
     *      }
     * }
     *
     * * 다형성의 장점
     * - 다형적 매개변수
     * - 하나의 배열에 여러 종류 객체 저장
     *
     *
     *
     */
}
