package main.java.com.ohgiraffers.section03.interfacelmplements;

public class Application {
    public static void main(String[] args) {

        /*
        * 인터페이스
        * 자바의 클래스와 유사한 형태이지만,
        * 추상메소드와 상수 필드만 가질 수 있는 클래스의 변형제이다.
        *
        * 사용 목적
        * 1. 추상클래스와 비슷하게 필요한 기능을 공통화 해서 강제성을
        * 부여할 목적으로 사용한다. (표준화)
        * 2. 자바의 단일상속의 단점을 극복할 수 있다. (다중 상속)
        *
        *
        * */

        // InterProduct interProduct = new InterProduct();

        InterProduct interProduct = new Product();
        interProduct.abstMethod();

        InterProduct.staticMethod();
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);

    }
}
