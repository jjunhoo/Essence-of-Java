package Object_Idea;

public class SingleInheritance {
    public static void main(String[] args) {

    }
    /*
     * [자바의 정석 - 기초편] ch7-5,6 단일상속, Object 클래스
     *
     * [ 단일 상속 ]
     * - Java 는 단일 상속만 허용 (C++ 은 다중 상속 허용)
     *      class TvDVD extends Tv, DVD {  // 에러. 조상은 하나만 허용 (모호)
     *          // ...
     *      }
     *          => Tv 와 DVD 어느 곳에서 상속 받은 것인지 알 수 없음 (모호)
     *          => 인터페이스를 통해서 다중 상속과 비슷한 효과 가능
     *
     * - 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 한다.
     *      class TvDVD extends Tv {
     *          DVD dvd = new DVD();
     *
     *          void play() {
     *              dvd.play();     // 실제 메소드는 DVD 클래스에서 작성하고, 상속한 것처럼 사용 가능
     *          }
     *          void stop() {
     *              dvd.stop();
     *          }
     *      }
     *
     *      class Tv {
     *          boolean power;
     *          int channel;
     *
     *          void power() { power = !power; }
     *          void channelUp() { ++channel; }
     *          void channelDown() { --channel; }
     *      }
     *
     *      class DVD {
     *          boolean power;
     *
     *          void power() { power = !power; }
     *          void play() { }
     *          void stop() { }
     *      }
     *
     *
     * [ Object 클래스 ]
     * - 모든 클래스의 조상
     * - 부모가 없는 클래스는 자동으로 Object 클래스를 상속 받게 됨
     *   ( Object 클래스 안에는 > toString(), equals(Object obj), hashCode(), ... 등 11개 메소드가 있음 )
     *      => 따라서, 모든 클래스는 위 11개 메소드를 기본으로 사용 가능
     *
     *      class Tv {      // 부모클래스를 상속 받지 않았지만, 사실상 최고 조상인 Object 를 상속 받음 (컴파일러 자동 추가)
     *          // ....
     *      }
     *
     *      class Tv extends Object {
     *          // ....
     *      }
     * */
}
