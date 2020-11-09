package Chapter12_Generics;

import java.util.ArrayList;

class Tv {}
class Audio {}

public class Generics_2 {
    public static void main(String[] args) {
        ArrayList<Tv> list = new ArrayList<Tv>(); // Tv 타입의 객체만 저장 가능
        list.add(new Tv());
        // list.add(new Audio()); // 불가

        Tv tv = list.get(0); // 제네릭스를 사용하여 형변환 필요 X
    }
    /*
        [자바의 정석 - 기초편] ch12-2,3 타입 변수

        - 클래스를 작성할 때, Object 타입 대신 타입 변수(E)를 선언해서 사용 (보통 E,T 사용 - E -> Element / T -> Type)
        - 객체 생성 시, 타입 변수 (E) 대신 실제 타입 (Tv) 지정 (대입)
            ArrayList<Tv> tvList = new ArrayList<Tv>(); => E 에 Tv 를 대입
     */
}
