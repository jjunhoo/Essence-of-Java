package Chapter7_Object_Idea;

public class 추상클래스의_작성_2 {
    public static void main(String[] args) {

    }
    /* [자바의 정석 - 기초편] ch7-33,34 추상클래스의작성2
     *
     * - 추상화 <-> 구체화
     * - 추상화된 코드는 구체화된 코드 보다 유연 (변경에 유리)
     *
     * [ 구체적 코드 ]
     * GregorianCalendar cal = new GregorianCalendar(); // 구체적
     *
     * [ 추상적 코드 ]
     * Calendar cal = Calendar.getInstance();           // 추상적
     *
     * // getInstance 메서드 내부
     * public static Calendar getInstance(Locale aLocale) {
     *      return createCalendar(TimeZone.getDefault(), aLocale);
     * }
     *
     * // createCalendar 메소드 내부
     * private static Calendar createCalendar(TimeZone zone, Locale aLocale) {
     *      // ...
     *      if (caltype != null) {
     *          switch (caltype) {
     *              case "buddhist" :
     *                  // 리턴 타입을 특정하는 것이 아닌 Calendar 상속 받았기 때문에 다형성에 의하여 유연하게 사용 가능
     *                  cal = new BuddhistCalendar(zone, aLocale);
     *                  break;
     *              case "japanese" :
     *                  cal = new JapaneseCalendar(zone, aLocale);
     *                  break;
     *              case "gregory" :
     *                  cal = new GregoryCalendar(zone, aLocale);
     *                  break;
     *          }
     *      }
     * }
     *
     */
}
