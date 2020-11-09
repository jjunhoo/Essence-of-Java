package Chapter7_Object_Idea;

public class Capsulation {
    private int hour;
    public int getHour() { return hour; }
    public void setHour(int hour) {
        // 0 ~ 23 사이의 값을 가지도록 강제함
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public static void main(String[] args) {
        Capsulation capsulation = new Capsulation();
        capsulation.setHour(10);
        System.out.println("hour : " + capsulation.getHour());
    }
    /*
     * [자바의 정석 - 기초편] ch7-22 캡슐화
     *
     * 캡슐호와 접근 제어자
     *
     * 접근 제어자를 사용하는 이유 ?
     * - 외부로부터 데이터를 보호하기 위함 (변수를 직접 수정 되지 않도록 함)
     * - 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위함
     *
     * private int hour
     * public int getHour() { return hour; }
     * public void setHour(int hour) {
     *      if (hour < 0 || hour > 23) return;
     *      this.hour = hour;
     * }
     *
     *
     */
}
