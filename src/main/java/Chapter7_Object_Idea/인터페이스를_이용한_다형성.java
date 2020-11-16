package Chapter7_Object_Idea;

// 추상 클래스
abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("unit stop !");
    }
}

interface Fightable {
    void move(int x, int y);    // public abstract 생략
    void attack(Fightable f);   // public abstract 생략
}

class Fighter extends Unit2 implements Fightable {
    // 오버라이딩 규칙 : 조상 보다 접근제어자가 좁으면 안 된다 !
    @Override
    public void move (int x, int y) {
        System.out.println("Fighter move");
    }
    @Override
    public void attack (Fightable f) {
        System.out.println("Fighter attack");
    }
    Fightable getFightable() {
        Fightable fightable = new Fighter();
        return fightable;
    }
}

public class 인터페이스를_이용한_다형성 {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        f.move(30, 40);
        f.attack(new Fighter());

        Fightable fightable = f.getFightable();
        System.out.println("[fightable] : " + fightable);
    }
    /* [자바의 정석 - 기초편] ch7-38 인터페이스와 다형성
     *
     * [ 인터페이스를 이용한 다형성 ]
     *
     * - 인터페이스도 구현 클래스의 부모인가 ?
     *      => 맞음 (엄밀히 따지자면 아니지만, 상속이 가능하기 때문에 맞다고 생각)
     * - 인터페이스 타입 매개변수는 인터페이스를 구현한 클래스의 객체만 가능
     *
     * class Fighter extends Unit implements Fightable {
     *      public void move (int x, int y);
     *      public void attack (Fightable f);
     * }
     *
     * Unit u = new Fighter();      // 가능 (다형성)
     * Fightable f = new Fighter(); // 가능 (다형성)
     *
     * // 대신 인터페이스 내에 정의된 메서드만 접근 가능
     * f.move(100, 200);
     * f.attack(new Fighter());
     *
     *
     * - 인터페이스를 메서드의 리턴 타입으로 지정할 수 있음
     *      => Fighterable 인터페이스를 구현한 클래스의 인스턴스를 반환
     *
     * Fightable method() {
     *      ...
     *      Fighter f = new Fighter();  // Fighter 클래스는 Fightable 인터페이스를 구현한 클래스이기 때문
     *      return f;
     * }
     *
     *
     */
}
