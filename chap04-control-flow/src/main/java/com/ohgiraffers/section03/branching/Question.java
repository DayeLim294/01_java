package main.java.com.ohgiraffers.section03.branching;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        /*
         * 자판기를 만들어보자.
         * 자판기가 파는 음료는 사이다(500), 콜라(600), 환타(700), 박카스(1000), 핫식스(1500)
         * 잘못된 음료수가 선택되면 다시 받아야 한다.
         *
         * 음료수를 선택하면 계산 여부를 물어본 후
         * 계산을 고르면 총 금액과 고른 음료수를 출력 해 주어야 한다.
         *
         * 예시)
         * 음료를 선택 해주세요 :
         * 사이다
         * 사이다를 선택 하셨습니다.
         * 계산 하시겠습니까?
         * 네 아니오
         * 총 상품은 사이다 음료를 더 선택 해주세요
         * 총 금액은 500원 입니다. 콜라
         */

        // 총 금액과 총 상품을 받을 변수 선언 해놓기
        // 무한루프 반복문 만들기
        // 스캐너를 이용해 원하는 음료를 입력 받기
        // 스위치를 이용해 해당 음료의 가격과 상품 명을 총 금액, 상품 변수에 추가하기 +=
        // 계산여부 물어보기
        // 계산 할거면 break 를 이용해 무한루프를 끊어주며  총 금액, 총 상품 출력
        // 안할거면 음료를 더 선택해주세요 출력 후
        // 반복문 다시 반복


        Scanner scr = new Scanner(System.in);
        String selectDrink = "";
        int price = 0;
        String str = "";

        System.out.println("-------------- vending machine --------------");
        System.out.println("사이다(500), 콜라(600), 환타(700), 박카스(1000), 핫식스(1500)");
        System.out.println("음료를 선택해 주세요 : ");

        while (true) {

            selectDrink = scr.nextLine();
            switch (selectDrink) {
                case "사이다":
                    price += 500;
                    str += selectDrink + " ";
                    break;
                case "콜라":
                    price += 600;
                    str += selectDrink + " ";
                    break;
                case "환타":
                    price += 700;
                    str += selectDrink + " ";
                    break;
                case "박카스":
                    price += 1000;
                    str += selectDrink + " ";
                    break;
                case "핫식스":
                    price += 1500;
                    str += selectDrink + " ";
                    break;
                default:
                    System.out.println("음료를 다시 선택해주세요");
                    continue;

            }
            System.out.println(str + "를 선택하셨습니다.");
            System.out.println("계산하시겠습니다?");

            String yesno = scr.nextLine();

            if (yesno.equals("네")) {
                System.out.println("총 상품은 " + str);
                System.out.println("총 금액은 " + price);
                break;

            } else if (yesno.equals("아니요")) {
                System.out.println("음료를 더 선택해 주세요");

            }
        }






    }


}








