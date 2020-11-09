package Chapter7_Object_Idea;

abstract class Player {             // 추상클래스
    abstract void play(int pos);    // 추상메서드
    abstract void stop();           // 추상메서드
}

class AudioPlayer extends Player {
    @Override
    void play(int pos) {
        System.out.println("AudioPlayer > play() - " + pos);
    }
    @Override
    void stop() {
        System.out.println("AudioPlayer > stop()");
    }
}

public class 추상_클래스_추상_메서드 {
    public static void main(String[] args) {
        // Player player = new Player();    // 추상 클래스는 인스턴스 생성 불가
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(10);
        audioPlayer.stop();

        Player player = new AudioPlayer();  // 다형성 (조상 클래스로 자손 클래스의 조상 클래스 메서드 호출)
        player.play(100);   // 조상 클래스의 메서드 (추상 메서드)
        player.stop();           // 조상 클래스의 메서드 (추상 메서드)
    }
    /* [자바의 정석 - 기초편] ch7-31,32 추상 클래스, 추상 메서드
     *
     * [ 추상 클래스 (Abstract class) ]
     * - 미완성 설계도. 미완성 메서드를 갖고 있는 클래스
     *
     * abstract class Player {              // 추상클래스 (미완성클래스)
     *      abstract void play(int pos);    // 추상메서드 (몸통 { }이 없는 미완성 메서드)
     *      abstract void stop();           // 추상메서드
     * }
     *  => 추상클래스 : 추상메서드를 가진 클래스
     *
     * - 다른 클래스 작성에 도움을 주기 위한 것. 인스턴스 생성 불가 !
     * Player p = new Player(); // 에러. 추상 클래스의 인스턴스 생성 불가
     *
     * - 상속을 통해 추상 메서드를 완성해야 인스턴스 생성 가능 !
     * class AudioPlayer extends Player {     // 추상클래스 상속 !
     *      void play(int pos) { // 내용 생략 } // 추상메서드 구현
     *      void stop() { // 내용 생략 }        // 추상메서드 구현
     * }
     * AudioPlayer ap = new AudioPlayer();    // OK. 인스턴스 생성 가능
     *
     *
     * [ 추상 메서드 ]
     * - 미완성 메서드. 구현부 (몸통, { }) 가 없는 메서드
     *  - 주석을 통해 어떤 기능을 수행할 목적으로 작성하였는지 설명한다.
     *  abstract 리턴타입 메서드이름();
     *
     * - 꼭 필요하지만, 자손마다 다르게 구현될 것으로 예상되는 경우 사용 !
     *  abstract class Player {          // 추상클래스
     *      abstract void play(int pos); // 추상메서드
     *      abstract void stop();        // 추상메서드
     *  }
     *
     *  // 추상 클래스의 추상 메서드를 모두 구현한 완전 클래스 (인스턴스 생성 가능!)
     *  class AudioPlayer extends Player {
     *      void play(int pos) { // 내용 생략 } // 추상메서드 구현
     *      void stop() { // 내용 생략 }        // 추상메서드 구현
     *  }
     *
     *  // 추상 클래스인 Player 의 stop() 추상메서드는 구현하지 않았기 때문에 아직 미완성 클래스
     *  // AbstractPlayer 클래스명 앞에 'abstract' 키워드 필요 (아직 미완성 클래스이기 때문 - abstract 이 없을 경우 컴파일 에러 발생)
     *  abstract class AbstractPlayer extends Player {
     *      void play(int pos) { // 내용 생략 } // 추상메서드 구현
     *  }
     *
     *
     * - 추상 메서드 호출 가능 (호출할 때는 선언부만 필요)
     * abstract class Player {
     *      boolean pause;
     *      int currentPos;
     *
     *      Player() {
     *          pause = false;
     *          currentPos = 0;
     *      }
     *
     *      // 해당 메서드가 반드시 작성 되어야 함을 강제함
     *      abstract void play (int pos);   // 추상메서드
     *      // 해당 메서드가 반드시 작성 되어야 함을 강제함
     *      abstract void stop ();          // 추상메서드
     *
     *      // 해당 클래스의 추상 메서드인 play() 가 추상 클래스인 Player 를 구현할 자손 클래스에서 반드시 작성되어야 하기 때문에 가능
     *      void play () {
     *          play(currentPos);           // 추상 메서드 사용 가능
     *      }
     * }
     *
     */
}
