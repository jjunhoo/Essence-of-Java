package Chapter7_Object_Idea;

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        // 현재 위치에 정지
        System.out.println("[Unit] - stop");
    }
}

class Marine extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("[Marine] - x : " + x + " y : " + y);
    }
    void stimpack() {
        System.out.println("[Marine] - stimpack");
    }
}

class Tank extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("[Tank] - x : " + x + " y : " + y);
    }
    void tankMode() {
        System.out.println("[Tank] - TankMode");
    }
}

class DropShip extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("[DropShip] - x : " + x + " y : " + y);
    }
    void drop() {
        System.out.println("[DropShip] - Drop");
    }
}

public class 추상클래스의_작성_1 {
    public static void main(String[] args) {
        // 다형성을 사용하여 Unit 클래스를 상속 받은 자손 클래스를 하나의 배열에 저장
        Unit[] units = { new Marine(), new Tank(), new DropShip() };

        for (int i=0; i<units.length; i++) {
            // 다형성을 사용하여 Unit 클래스에서 정의한 추상메서드인 move 메소드를 한번에 사용
            // Unit 타입으로 move() 를 호출하지만 실제 호출은 각 클래스에서 구현된 move() 호출
            units[i].move(100, 200);
        }
    }
    /* [자바의 정석 - 기초편] ch7-33,34 추상클래스의작성1
     *
     * - 여러 클래스에 공통적으로 사용될 수 있는 추상 클래스를 바로 작성하거나 기존 클래스의 공통 부분을 뽑아서 추상 클래스로 만든다.
     *
     */
}
