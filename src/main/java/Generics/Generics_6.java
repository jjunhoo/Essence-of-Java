package Generics;

public class Generics_6 {
    public static void main(String[] args) {

    }
    /*
        [자바의 정석 - 기초편] ch12-15,16 지네릭형변환

        - 제네릭 타입과 원시 타입 간의 형변환은 바람직하지 않다 (경고 발생)
            Box<Object> objBox = null;
            Box box = (Box) objBox;     // OK. 제네릭 타입 -> 원시 타입 (경고 발생)
            objBox = (Box<Object>) box; // OK. 원시 타입 -> 제네릭 타입 (경고 발생)
     */
}
