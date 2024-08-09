package main.java.com.ohgiraffers.section04.sort;

public class Application03_for {
    public static void main(String[] args) {

        // for문 연습
        // 1시부터 12까지 출력해보자.
        for (int i = 1; i < 13 ; i++) {
            System.out.println(i + "시");
        }

        System.out.println();

        // 2부터 20까지 짝수를 출력해보자.
        for (int i = 2; i < 21; i+=2) {
            System.out.println(i);
        }

        System.out.println();


        // for문 연습 (중첩)
        // 0시 0분부터 23시 59분까지 출력해보자.
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.println(i + "시" + j + "분");

            }
            
        }



    }
}
